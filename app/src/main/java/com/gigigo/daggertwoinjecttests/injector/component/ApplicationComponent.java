package com.gigigo.daggertwoinjecttests.injector.component;

import com.gigigo.daggertwoinjecttests.injector.module.ApplicationModule;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = ApplicationModule.class) public interface ApplicationComponent {

}