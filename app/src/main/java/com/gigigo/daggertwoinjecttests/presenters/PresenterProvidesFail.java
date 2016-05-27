package com.gigigo.daggertwoinjecttests.presenters;

import com.gigigo.daggertwoinjecttests.fakeobjects.FakeString;
import javax.inject.Inject;

/**
 * Created by Sergio Martinez Rodriguez
 * Date 27/5/16.
 */
public class PresenterProvidesFail {

  @Inject FakeString fakeString;

  public PresenterProvidesFail(){}

  public String printSomething(){
    if (fakeString != null){
      return fakeString.appendToValue("Presenter Provides Fail");
    }else{
      return "FakeString IS NULL";
    }
  }
}
