package com.gigigo.daggertwoinjecttests.injector.component;

import com.gigigo.daggertwoinjecttests.fragments.FragmentInject;
import com.gigigo.daggertwoinjecttests.fragments.FragmentProvides;
import com.gigigo.daggertwoinjecttests.fragments.FragmentProvidesFail;
import com.gigigo.daggertwoinjecttests.injector.PerActivity;
import com.gigigo.daggertwoinjecttests.injector.module.FragmentsModule;
import com.gigigo.daggertwoinjecttests.presenters.PresenterProvides;
import dagger.Component;

@PerActivity @Component(dependencies = ApplicationComponent.class, modules = FragmentsModule.class)
public interface FragmentComponent {

  void inject(FragmentInject fragmentInject);

  void inject(FragmentProvides fragmentProvides);

  void inject(FragmentProvidesFail fragmentProvidesFail);

  void inject(PresenterProvides presenterProvides);

}
