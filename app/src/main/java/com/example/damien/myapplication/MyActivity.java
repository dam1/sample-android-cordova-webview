package com.example.damien.myapplication;

import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import org.apache.cordova.Config;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MyActivity extends Activity implements CordovaInterface {

  private static final int AUTHORIZATION_CODE = 1993;
  private static final int ACCOUNT_CODE = 1601;

  private AuthPreferences authPreferences;
  private AccountManager accountManager;

  /**
   * change this depending on the scope needed for the things you do in
   * doCoolAuthenticatedStuff()
   */
  private final String SCOPE = "https://www.googleapis.com/auth/googletalk";
  CordovaWebView cwv;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_my);

    cwv = (CordovaWebView) findViewById(R.id.cordovaview);
    Config.init(this);
    cwv.loadUrl(Config.getStartUrl());
  }

  @Override
  public void startActivityForResult(CordovaPlugin cordovaPlugin, Intent intent, int i) {

  }

  @Override
  public void setActivityResultCallback(CordovaPlugin cordovaPlugin) {

  }

  @Override
  public Activity getActivity() {
    return this;
  }

  @Override
  public Object onMessage(String s, Object o) {
    return null;
  }

  @Override
  public ExecutorService getThreadPool() {
    return threadPool;
  }

  private final ExecutorService threadPool = Executors.newCachedThreadPool();


}
