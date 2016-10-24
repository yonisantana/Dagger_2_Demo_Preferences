package com.ysantana.dagger_2_demo_preferences.modules;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.ysantana.dagger_2_demo_preferences.MyApplication;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

/**
 * Created by ysantana on 20/10/2016.
 */
@Module
public class StorageModule {
    private MyApplication myApplication;

    public StorageModule(MyApplication application) {
        myApplication = application;
    }

    @Singleton
    @Provides
    public SharedPreferences sharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(myApplication);
    }
}