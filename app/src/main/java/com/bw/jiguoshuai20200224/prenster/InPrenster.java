package com.bw.jiguoshuai20200224.prenster;

import com.bw.jiguoshuai20200224.activity.InContent;
import com.bw.jiguoshuai20200224.moudle.InMoudle;
/**
 * 季国帅
 * 20200224
 */
public class InPrenster implements InContent.Iprenster {
    InContent.Iview iview;
    InMoudle moudle;
    public InPrenster(InContent.Iview view) {
        iview=view;
        moudle=new InMoudle();
    }

    @Override
    public void getBanner(String url) {
        moudle.getBanner(url, new InContent.Imoudle.Iback() {
            @Override
            public void onSuccess(String url) {
                iview.onSuccess(url);
            }

            @Override
            public void onError(String url) {
                iview.onSuccess(url);
            }
        });

    }
}
