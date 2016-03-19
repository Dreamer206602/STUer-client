package com.leelit.stuer.sell;

import com.leelit.stuer.bean.SellInfo;

import java.util.List;

/**
 * Created by Leelit on 2016/3/16.
 */
public interface ISellView {

    void stopRefreshing();

    void netError();

    void showDataFromDb(List<SellInfo> sellInfos);

    void showLoadingDbProgressDialog();

    void dismissLoadingDbProgressDialog();

    void showNoDataInDb();

    void showDataFromNet(List<SellInfo> sellInfos);

    void showNoDataFromNet();

    void showGoodsOffline(int position);

    void showContactDialog(String tel, String shortel, String wechat);
}
