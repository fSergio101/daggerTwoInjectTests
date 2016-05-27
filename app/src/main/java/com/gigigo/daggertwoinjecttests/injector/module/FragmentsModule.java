package com.gigigo.daggertwoinjecttests.injector.module;

import com.gigigo.daggertwoinjecttests.fakeobjects.FakeString;
import com.gigigo.daggertwoinjecttests.injector.PerActivity;
import com.gigigo.daggertwoinjecttests.presenters.PresenterProvides;
import com.gigigo.daggertwoinjecttests.presenters.PresenterProvidesFail;
import dagger.Module;
import dagger.Provides;

@Module public class FragmentsModule {

  @Provides
  @PerActivity FakeString providesFakeString() {
    return new FakeString();
  }

  @Provides
  @PerActivity PresenterProvides providePresenterProvides() {
    return new PresenterProvides();
  }

  //Without providing this, app won't compile.
  @Provides
  @PerActivity PresenterProvidesFail providePresenterProvidesFail() {
    return new PresenterProvidesFail();
  }

}
