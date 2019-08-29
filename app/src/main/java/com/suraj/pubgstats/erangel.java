package com.suraj.pubgstats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class erangel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erangel);

        WebView webView = findViewById(R.id.webView);

        //webView.loadDataWithBaseURL("file:///android_res/drawable/", "<img src='"+ url + "' style='width:100%' />", "text/html", "utf-8", null);
        webView.loadUrl("file:///android_res/drawable/erangel.png");
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
    }
}
