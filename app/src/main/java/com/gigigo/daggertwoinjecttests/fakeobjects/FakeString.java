package com.gigigo.daggertwoinjecttests.fakeobjects;

/**
 * Created by Sergio Martinez Rodriguez
 * Date 27/5/16.
 */
public class FakeString {
  private final String string;

  public FakeString(){
    this.string = "Hello ";
  }

  public String appendToValue(String textToAppend){
    return string + textToAppend;
  }

}
