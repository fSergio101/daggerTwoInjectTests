package com.gigigo.daggertwoinjecttests;

import android.app.Application;
import com.gigigo.daggertwoinjecttests.injector.component.ApplicationComponent;
import com.gigigo.daggertwoinjecttests.injector.component.DaggerApplicationComponent;
import com.gigigo.daggertwoinjecttests.injector.module.ApplicationModule;

/**
 * Created by Sergio Martinez Rodriguez
 * Date 27/5/16.
 */
public class DaggerApp extends Application {

  private ApplicationComponent component;

  @Override public void onCreate() {
    super.onCreate();
    initializeInjector();
  }

  private void initializeInjector() {
    component = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
  }

  public ApplicationComponent getComponent() {
    return component;
  }

}

