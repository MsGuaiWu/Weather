package com.cl.goodweather.ui;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cl.goodweather.R;
import com.cl.goodweather.adapter.MoreLifestyleAdapter;
import com.cl.goodweather.bean.LifestyleResponse;
import com.cl.goodweather.contract.MoreLifestyleContract;
import com.cl.goodweather.utils.CodeToStringUtils;
import com.cl.goodweather.utils.Constant;
import com.cl.goodweather.utils.StatusBarUtil;
import com.cl.goodweather.utils.ToastUtils;
import com.cl.mvplibrary.mvp.MvpActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Response;

import static com.cl.mvplibrary.utils.RecyclerViewAnimation.runLayoutAnimation;

/**
 * 更多生活指数信息
 *
 * @author llw
 */
public class MoreLifestyleActivity extends MvpActivity<MoreLifestyleContract.MoreLifestylePresenter> implements MoreLifestyleContract.IMoreLifestyleView {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.rv)
    RecyclerView rv;

    @Override
    public void initData(Bundle savedInstanceState) {
        //透明状态栏
        StatusBarUtil.transparencyBar(context);
        Back(toolbar);
        showLoadingDialog();
        tvTitle.setText(getIntent().getStringExtra("cityName"));
        mPresent.worldCity(getIntent().getStringExtra("locationId"));
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_more_lifestyle;
    }

    @Override
    protected MoreLifestyleContract.MoreLifestylePresenter createPresent() {
        return new MoreLifestyleContract.MoreLifestylePresenter();
    }

    /**
     * 更多生活质量数据返回
     *
     * @param response
     */
    @Override
    public void getMoreLifestyleResult(Response<LifestyleResponse> response) {
        dismissLoadingDialog();
        if (response.body().getCode().equals(Constant.SUCCESS_CODE)) {
            List<LifestyleResponse.DailyBean> data = response.body().getDaily();
            if (data != null && data.size() > 0) {
                MoreLifestyleAdapter adapter = new MoreLifestyleAdapter(R.layout.item_more_lifestyle_list, data);
                rv.setLayoutManager(new LinearLayoutManager(context));
                rv.setAdapter(adapter);
                runLayoutAnimation(rv);
            } else {
                ToastUtils.showShortToast(context, "生活质量数据为空");
            }
        } else {
            ToastUtils.showShortToast(context, CodeToStringUtils.WeatherCode(response.body().getCode()));
        }
    }

    /**
     * 其他异常返回
     */
    @Override
    public void getDataFailed() {
        dismissLoadingDialog();
        ToastUtils.showShortToast(context, "更多天气数据获取异常");
    }

}
