package com.example.hp.bikebd;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class DetailsActivity extends AppCompatActivity {

    WebView webview;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        progressBar = findViewById(R.id.progressBar);

        webview = findViewById(R.id.webview);
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        //dont get use external browser
        webview.setWebViewClient(new WebViewClient());

        //Improve Webview Performance
        webview.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webview.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webview.setWebViewClient(new WebViewpageLoaderClient());
        webSettings.setAppCacheEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSettings.setUseWideViewPort(true);
        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);
        webSettings.setEnableSmoothTransition(true);
        webview.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);


        if (getIntent().hasExtra("home_key")) {
            webview.loadUrl(getIntent().getExtras().getString("home_key"));
        } else if (getIntent().hasExtra("ownership_key")) {
            webview.loadUrl(getIntent().getExtras().getString("ownership_key"));
        } else if (getIntent().hasExtra("team_bikebd_reviews_key")) {
            webview.loadUrl(getIntent().getExtras().getString("team_bikebd_reviews_key"));
        } else if (getIntent().hasExtra("technical_review_key")) {
            webview.loadUrl(getIntent().getExtras().getString("technical_review_key"));
        } else if (getIntent().hasExtra("product_review_key")) {
            webview.loadUrl(getIntent().getExtras().getString("product_review_key"));
        } else if (getIntent().hasExtra("market_review_key")) {
            webview.loadUrl(getIntent().getExtras().getString("market_review_key"));
        } else if (getIntent().hasExtra("comparison_review_key")) {
            webview.loadUrl(getIntent().getExtras().getString("comparison_review_key"));
        } else if (getIntent().hasExtra("tips_review_key")) {
            webview.loadUrl(getIntent().getExtras().getString("tips_review_key"));
        } else if (getIntent().hasExtra("riding_tips_key")) {
            webview.loadUrl(getIntent().getExtras().getString("riding_tips_key"));
        } else if (getIntent().hasExtra("care_tips_key")) {
            webview.loadUrl(getIntent().getExtras().getString("care_tips_key"));
        } else if (getIntent().hasExtra("stuntmania_key")) {
            webview.loadUrl(getIntent().getExtras().getString("stuntmania_key"));
        } else if (getIntent().hasExtra("modification_key")) {
            webview.loadUrl(getIntent().getExtras().getString("modification_key"));
        } else if (getIntent().hasExtra("motorcycle_matters_key")) {
            webview.loadUrl(getIntent().getExtras().getString("motorcycle_matters_key"));
        } else if (getIntent().hasExtra("story_key")) {
            webview.loadUrl(getIntent().getExtras().getString("story_key"));
        } else if (getIntent().hasExtra("news_key")) {
            webview.loadUrl(getIntent().getExtras().getString("news_key"));
        } else if (getIntent().hasExtra("photo_gallery_key")) {
            webview.loadUrl(getIntent().getExtras().getString("photo_gallery_key"));
        } else if (getIntent().hasExtra("vedios_key")) {
            webview.loadUrl(getIntent().getExtras().getString("vedios_key"));
        } else if (getIntent().hasExtra("bike_price_key")) {
            webview.loadUrl(getIntent().getExtras().getString("bike_price_key"));
        } else if (getIntent().hasExtra("showrooms_key")) {
            webview.loadUrl(getIntent().getExtras().getString("showrooms_key"));
        }else if (getIntent().hasExtra("honda_ridersZone_key")) {
            webview.loadUrl(getIntent().getExtras().getString("honda_ridersZone_key"));
        }else if (getIntent().hasExtra("about_key")) {
            webview.loadUrl(getIntent().getExtras().getString("about_key"));
        }else if (getIntent().hasExtra("contact_key")) {
            webview.loadUrl(getIntent().getExtras().getString("contact_key"));
        }


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    private class WebViewpageLoaderClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            progressBar.setVisibility(View.INVISIBLE);
        }

    }

    @Override
    public void onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
