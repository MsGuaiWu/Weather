package com.cl.goodweather.ui;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;

import com.cl.goodweather.R;
import com.cl.goodweather.utils.Constant;
import com.cl.goodweather.utils.SPUtils;
import com.cl.goodweather.utils.StatusBarUtil;
import com.cl.mvplibrary.base.BaseActivity;
import com.cl.mvplibrary.view.SwitchButton;

import org.litepal.util.Const;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 应用设置页面
 *
 * @author llw
 */
public class SettingActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.wb_everyday)
    SwitchButton wbEveryday;

    @Override
    public void initData(Bundle savedInstanceState) {
        //白色状态栏
        StatusBarUtil.setStatusBarColor(context, R.color.white);
        //黑色字体
        StatusBarUtil.StatusBarLightMode(context);
        Back(toolbar);

        boolean isChecked = SPUtils.getBoolean(Constant.EVERYDAY_POP_BOOLEAN,true,context);

        wbEveryday.setChecked(isChecked);

        wbEveryday.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
                if(isChecked){
                    SPUtils.putBoolean(Constant.EVERYDAY_POP_BOOLEAN,true,context);
                }else {
                    SPUtils.putBoolean(Constant.EVERYDAY_POP_BOOLEAN,false,context);
                }
            }
        });
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_setting;
    }

}
