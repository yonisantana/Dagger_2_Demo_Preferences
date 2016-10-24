package com.ysantana.dagger_2_demo_preferences;

import android.app.Application;

import com.ysantana.dagger_2_demo_preferences.component.DaggerStorageComponent;
import com.ysantana.dagger_2_demo_preferences.component.StorageComponent;
import com.ysantana.dagger_2_demo_preferences.modules.StorageModule;

/**
 * Created by ysantana on 20/10/2016.
 */
public class MyApplication extends Application {

    StorageComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerStorageComponent
                .builder()
                .storageModule(new StorageModule(this))
                .build();
    }

    public StorageComponent getComponent() {
        return component;
    }
}