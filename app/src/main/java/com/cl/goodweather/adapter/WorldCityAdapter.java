package com.cl.goodweather.adapter;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.cl.goodweather.R;
import com.cl.goodweather.bean.WorldCityResponse;

import java.util.List;

/**
 * 国家/地区中的城市适配器
 *
 * @author llw
 */
public class WorldCityAdapter extends BaseQuickAdapter<WorldCityResponse.TopCityListBean, BaseViewHolder> {
    public WorldCityAdapter(int layoutResId, @Nullable List<WorldCityResponse.TopCityListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, WorldCityResponse.TopCityListBean item) {
        //名称
        helper.setText(R.id.tv_city, item.getName());
        //点击事件
        helper.addOnClickListener(R.id.tv_city);
    }
}
