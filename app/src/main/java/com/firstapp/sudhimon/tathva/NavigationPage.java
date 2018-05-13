package com.firstapp.sudhimon.tathva;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class NavigationPage extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.navigation_layout);
    }
}
