package com.bugscript.advanceddemo.base;

import android.app.Activity;

import com.bugscript.advanceddemo.home.MainActivity;
import com.bugscript.advanceddemo.home.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
        MainActivityComponent.class,
})
public abstract class ActivityBindingModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> providemainActivityInjector(MainActivityComponent.Builder builder);
}
