package com.gigigo.daggertwoinjecttests.presenters;

import com.gigigo.daggertwoinjecttests.fakeobjects.FakeString;
import javax.inject.Inject;

/**
 * Created by Sergio Martinez Rodriguez
 * Date 27/5/16.
 */
public class PresenterProvides {

  @Inject FakeString fakeString;

  public PresenterProvides(){}

  public String printSomething(){
    if (fakeString != null){
      return fakeString.appendToValue("Presenter Provides");
    }else{
      return "FakeString IS NULL";
    }
  }
}
