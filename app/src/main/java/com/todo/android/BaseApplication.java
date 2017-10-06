package com.todo.android;

import android.app.Application;
import android.content.Context;

/**
 * Created by AnyMarvel on 2017/10/7.
 */

public class BaseApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }
}
