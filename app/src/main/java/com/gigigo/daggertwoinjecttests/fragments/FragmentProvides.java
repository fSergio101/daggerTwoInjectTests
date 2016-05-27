package com.gigigo.daggertwoinjecttests.fragments;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.gigigo.daggertwoinjecttests.DaggerApp;
import com.gigigo.daggertwoinjecttests.R;
import com.gigigo.daggertwoinjecttests.injector.component.DaggerFragmentComponent;
import com.gigigo.daggertwoinjecttests.injector.component.FragmentComponent;
import com.gigigo.daggertwoinjecttests.injector.component.ApplicationComponent;
import com.gigigo.daggertwoinjecttests.injector.module.FragmentsModule;
import com.gigigo.daggertwoinjecttests.presenters.PresenterProvides;
import javax.inject.Inject;

/**
 * Created by Sergio Martinez Rodriguez
 * Date 27/5/16.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB) public class FragmentProvides extends Fragment{

  @Inject PresenterProvides presenterProvides;
  private View view;

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    DaggerApp application = (DaggerApp) getActivity().getApplication();
    ApplicationComponent component = application.getComponent();

    FragmentComponent fragmentComponent = DaggerFragmentComponent.builder()
        .applicationComponent(component)
        .fragmentsModule(new FragmentsModule())
        .build();

    initInjectors(fragmentComponent);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment, container, false);
    return view;
  }

  @Override public void onStart() {
    super.onStart();
    TextView tv = (TextView) view.findViewById(R.id.fragmentText);
    tv.setText(presenterProvides.printSomething());
  }

  private void initInjectors(FragmentComponent fragmentComponent) {
    fragmentComponent.inject(this);
    //calling this will create the necessary members injector in FragmentComponent
    fragmentComponent.inject(presenterProvides);
  }
}
