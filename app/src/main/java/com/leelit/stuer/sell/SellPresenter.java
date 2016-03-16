package com.leelit.stuer.sell;

import com.leelit.stuer.bean.SellInfo;
import com.leelit.stuer.model.SellModel;

import java.util.List;

import rx.Subscriber;

/**
 * Created by Leelit on 2016/3/16.
 */
public class SellPresenter {
    private SellModel mModel = new SellModel();

    private ISellView mView;

    public SellPresenter(ISellView view) {
        mView = view;
    }


    public void doQueryList() {
        mModel.query("", new Subscriber<List<SellInfo>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                mView.notRefreshing();
                mView.netError();
            }

            @Override
            public void onNext(List<SellInfo> sellInfos) {
                mView.notRefreshing();
                mView.showInfos(sellInfos);
            }
        });
    }
}