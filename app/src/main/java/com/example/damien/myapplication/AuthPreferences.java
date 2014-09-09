package com.example.damien.myapplication;

/**
 * Created by damien on 2014-09-07.
 */



import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by damien on 2014-09-07.
 */
public class AuthPreferences {

  private static final String KEY_USER = "user";
  private static final String KEY_TOKEN = "token";

  private SharedPreferences preferences;

  public AuthPreferences(Context context) {
    preferences = context
      .getSharedPreferences("auth", Context.MODE_PRIVATE);
  }

  public void setUser(String user) {
    SharedPreferences.Editor editor = preferences.edit();
    editor.putString(KEY_USER, user);
    editor.commit();
  }

  public void setToken(String password) {
    SharedPreferences.Editor editor = preferences.edit();
    editor.putString(KEY_TOKEN, password);
    editor.commit();
  }

  public String getUser() {
    return preferences.getString(KEY_USER, null);
  }

  public String getToken() {
    return preferences.getString(KEY_TOKEN, null);
  }
}