package com.cl.goodweather.ui;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.FileProvider;

import com.cl.goodweather.R;
import com.cl.goodweather.utils.StatusBarUtil;
import com.cl.goodweather.utils.ToastUtils;
import com.cl.mvplibrary.base.BaseActivity;
import com.cl.mvplibrary.bean.AppVersion;
import com.cl.mvplibrary.utils.SizeUtils;


import org.litepal.LitePal;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.OkHttpClient;

/**
 * 关于 Good Weather
 *
 * @author llw
 */
public class AboutUsActivity extends BaseActivity {

    private static final int INSTALL_APK_CODE = 3472;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.lay_app_version)
    LinearLayout layAppVersion;
    @BindView(R.id.tv_version)
    TextView tvVersion;//版本
    @BindView(R.id.tv_blog)
    TextView tvBlog;//博客
    @BindView(R.id.tv_code)
    TextView tvCode;//源码
    @BindView(R.id.tv_copy_email)
    TextView tvCopyEmail;//复制邮箱
    @BindView(R.id.tv_author)
    TextView tvAuthor;//作者
    @BindView(R.id.v_red)
    View vRed;//红点
    private ClipboardManager myClipboard;
    private ClipData myClip;
    private String updateUrl = null;
    private String updateLog = null;
    private boolean is_update = false;
    private AppVersion appVersion;
    /**
     * 博客地址
     */
    private String CSDN_BLOG_URL = "https://blog.csdn.net/chenxiansheng_w";
    /**
     * 源码地址
     */
    private String GITHUB_URL = "https://github.com/lilongweidev/GoodWeather";


    @Override
    public void initData(Bundle savedInstanceState) {
        Back(toolbar);
        //蓝色状态栏
        StatusBarUtil.setStatusBarColor(context, R.color.about_bg_color);
        //设置文字下划线
        tvCopyEmail.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        //抗锯齿
        tvCopyEmail.getPaint().setAntiAlias(true);


        appVersion = LitePal.find(AppVersion.class, 1);
        updateLog = appVersion.getChangelog();

    }


    @Override
    public int getLayoutId() {
        return R.layout.activity_about_us;
    }

    /**
     * 跳转URL
     *
     * @param url 地址
     */
    private void jumpUrl(String url) {
        if (url != null) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
        } else {
            ToastUtils.showShortToast(context, "未找到相关地址");
        }
    }

    AlertDialog updateAppDialog = null;


    /**
     * 清除APK
     *
     * @param apkName
     * @return
     */
    public static File clearApk(String apkName) {
        File apkFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), apkName);
        if (apkFile.exists()) {
            apkFile.delete();
        }
        return apkFile;
    }

    /**
     * 下载APK
     *
     * @param downloadUrl
     */
    private void downloadApk(String downloadUrl) {
        clearApk("GoodWeather.apk");
        //下载管理器 获取系统下载服务
        DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
        Request request = new Request(Uri.parse(downloadUrl));
        //设置运行使用的网络类型，移动网络或者Wifi都可以
        request.setAllowedNetworkTypes(request.NETWORK_MOBILE | request.NETWORK_WIFI);
        //设置是否允许漫游
        request.setAllowedOverRoaming(true);
        //设置文件类型
        MimeTypeMap mimeTypeMap = MimeTypeMap.getSingleton();
        String mimeString = mimeTypeMap.getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(downloadUrl));
        request.setMimeType(mimeString);
        //设置下载时或者下载完成时，通知栏是否显示
        request.setNotificationVisibility(request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setTitle("下载新版本");
        request.setVisibleInDownloadsUi(true);//下载UI
        //sdcard目录下的download文件夹
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "GoodWeather.apk");
        //将下载请求放入队列
        downloadManager.enqueue(request);
    }

}
