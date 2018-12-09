package com.bugscript.advanceddemo.di;

import android.app.Activity;

import com.bugscript.advanceddemo.base.BaseActivity;

public class Injector {
    private Injector(){

    }

    public static void inject(Activity activity){
        ActivityInjector.get(activity).inject(activity);
    }

    public static void clearComponent(Activity activity) {
        ActivityInjector.get(activity).clear(activity);
    }
}
