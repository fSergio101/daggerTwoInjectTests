package com.gigigo.daggertwoinjecttests;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.gigigo.daggertwoinjecttests.fragments.FragmentInject;
import com.gigigo.daggertwoinjecttests.fragments.FragmentProvides;
import com.gigigo.daggertwoinjecttests.fragments.FragmentProvidesFail;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setButtonActions();
  }

  private void setButtonActions() {
    findViewById(R.id.loadInject).setOnClickListener(this);
    findViewById(R.id.loadProvides).setOnClickListener(this);
    findViewById(R.id.loadProvidesFail).setOnClickListener(this);
  }

  @TargetApi(Build.VERSION_CODES.HONEYCOMB) private void initFragment(Fragment fragment) {
    FragmentManager fragmentManager = getFragmentManager();
    FragmentTransaction ft = fragmentManager.beginTransaction();
    ft.replace(R.id.fragmentContainer, fragment);
    ft.commit();
  }

  @Override public void onClick(View v) {
    if (v.getId() == R.id.loadInject) {
      initFragment(new FragmentInject());
    } else if (v.getId() == R.id.loadProvides) {
      initFragment(new FragmentProvides());
    } else if (v.getId() == R.id.loadProvidesFail) {
      initFragment(new FragmentProvidesFail());
    }
  }

}
