package com.ysantana.dagger_2_demo_preferences.component;

import com.ysantana.dagger_2_demo_preferences.modules.StorageModule;
import com.ysantana.dagger_2_demo_preferences.ui.AFragment;
import com.ysantana.dagger_2_demo_preferences.ui.BFragment;
import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by ysantana on 20/10/2016.
 */
@Singleton
@Component(modules = StorageModule.class)
public interface StorageComponent {
    void inject(AFragment aFragment);
    void inject(BFragment bFragment);
}