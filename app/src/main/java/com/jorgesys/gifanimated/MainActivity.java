package com.jorgesys.gifanimated;

import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String urlGif = "https://cdn.dribbble.com/users/263558/screenshots/1337078/dvsd.gif";
        //add Glide implementation into the build.gradle file.
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        Uri uri = Uri.parse(urlGif);
        Glide.with(getApplicationContext()).load(uri).into(imageView);

        WebView webView =  (WebView)findViewById(R.id.webView);
        webView = (WebView) findViewById(R.id.webView);
        webView.setBackgroundColor(Color.TRANSPARENT); //for gif without background
        webView.loadUrl("file:///android_asset/html/webpage_gif.html");

    }
}
