package com.bw.jiguoshuai20200224.moudle;

import com.bw.jiguoshuai20200224.activity.InContent;
import com.bw.jiguoshuai20200224.utiuls.NetUtiuls;
/**
 * 季国帅
 * 20200224
 */
public class InMoudle implements InContent.Imoudle {
    @Override
    public void getBanner(final String url, final Iback iback) {
        NetUtiuls.getInstance().getJson(url, new NetUtiuls.ICallBack() {
            @Override
            public void onSuceess(String json) {
                iback.onSuccess(json);
            }

            @Override
            public void onError(String msg) {
                iback.onError(msg);

            }
        });
    }
}
