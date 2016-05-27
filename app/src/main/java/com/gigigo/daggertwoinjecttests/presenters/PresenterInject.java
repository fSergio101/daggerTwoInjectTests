package com.gigigo.daggertwoinjecttests.presenters;

import com.gigigo.daggertwoinjecttests.fakeobjects.FakeString;
import javax.inject.Inject;

/**
 * Created by Sergio Martinez Rodriguez
 * Date 27/5/16.
 */
public class PresenterInject {

  @Inject FakeString fakeString;

  @Inject public PresenterInject(){}

  public String printSomething(){
    if (fakeString != null){
      return fakeString.appendToValue("Presenter Inject");
    }else{
      return "FakeString IS NULL";
    }
  }
}
