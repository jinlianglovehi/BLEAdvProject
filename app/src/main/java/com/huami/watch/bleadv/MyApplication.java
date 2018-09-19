package com.huami.watch.bleadv;

import android.app.Application;
import android.content.res.Configuration;

import butterknife.ButterKnife;

public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        ButterKnife.setDebug(true);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }
}
