package com.example.hp.bikebd;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class GridviewPage extends AppCompatActivity {


    GridView gridview;


    String


            home_url = "https://www.bikebd.com/",
            ownership_review_url = "https://www.bikebd.com/motorcycle-review/motorcycle-ownership-review/",
            team_bikebd_review_url = "https://www.bikebd.com/category/team-bikebd-review/",
            technical_review_url = "https://www.bikebd.com/motorcycle-review/motorcycle-technical-reviews/",
            product_review_url = "https://www.bikebd.com/motorcycle-review/motorcycle-product-reviews/",
            market_review_url = "https://www.bikebd.com/motorcycle-review/market-others-review/",
            comparison_review_url = "https://www.bikebd.com/category/motorcycle-comparison/",
            tips_beginers_url_ = "https://www.bikebd.com/tips/motorcycle-tips-for-beginners/",
            riding_tips_url = "https://www.bikebd.com/tips/motorcycle-riding-tips/",
            care_tips_url = "https://www.bikebd.com/tips/care-technical-tips/",
            stuntmania_url = "https://www.bikebd.com/tips/motorcycle-stunt-tips/",
            modification_url = "https://www.bikebd.com/tips/motorcycle-modification-tips/",
            motorcycle_matters_url = "https://www.bikebd.com/tips/motorcycle-legal-matters-in-bangladesh/",
            story_url = "https://www.bikebd.com/category/motorcycle-travel-story/",
            news_url = "https://www.bikebd.com/category/motorcycle-news-in-bangladesh/",
            photo_gallery_url = "https://www.bikebd.com/photo-gallery/",
            vedios_url = "https://www.bikebd.com/videos/",
            bike_price_url = "https://www.bikebd.com/motorcycle-price-in-bangladesh/",
            showrooms_url = "https://www.bikebd.com/all-motorcycle-showrooms-in-bangladesh-addresses-phone-no/",
            honda_ridersZone_url = "http://hondariderszone.bikebd.com/",
            about_url = "https://www.bikebd.com/team-bikebd/",
            contact_url = "https://www.bikebd.com/contact-us/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        gridview = findViewById(R.id.gridview);

        CustomAdaptar adaptar = new CustomAdaptar(this, getdata());
        gridview.setAdapter(adaptar);


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    if (checkinternet()) {
                        Intent homeintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        homeintent.putExtra("home_key", home_url);
                        startActivity(homeintent);

                    } else {

                    }
                } else if (position == 1) {
                    if (checkinternet()) {
                        Intent ownershipintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        ownershipintent.putExtra("ownership_key", ownership_review_url);
                        startActivity(ownershipintent);
                    } else {

                    }
                } else if (position == 2) {
                    if (checkinternet()) {
                        Intent teambikebdintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        teambikebdintent.putExtra("team_bikebd_reviews_key", team_bikebd_review_url);
                        startActivity(teambikebdintent);
                    } else {

                    }
                } else if (position == 3) {
                    if (checkinternet()) {
                        Intent technicalintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        technicalintent.putExtra("technical_review_key", technical_review_url);
                        startActivity(technicalintent);
                    } else {

                    }
                } else if (position == 4) {
                    if (checkinternet()) {
                        Intent productintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        productintent.putExtra("product_review_key", product_review_url);
                        startActivity(productintent);
                    } else {

                    }
                } else if (position == 5) {
                    if (checkinternet()) {
                        Intent marketintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        marketintent.putExtra("market_review_key", market_review_url);
                        startActivity(marketintent);
                    } else {

                    }
                } else if (position == 6) {
                    if (checkinternet()) {
                        Intent comparisonintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        comparisonintent.putExtra("comparison_review_key", comparison_review_url);
                        startActivity(comparisonintent);
                    } else {

                    }
                } else if (position == 7) {
                    if (checkinternet()) {
                        Intent tipsbeginerintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        tipsbeginerintent.putExtra("tips_review_key", tips_beginers_url_);
                        startActivity(tipsbeginerintent);
                    } else {

                    }
                } else if (position == 8) {
                    if (checkinternet()) {
                        Intent ridingtipsintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        ridingtipsintent.putExtra("riding_tips_key", riding_tips_url);
                        startActivity(ridingtipsintent);
                    } else {

                    }
                } else if (position == 9) {
                    if (checkinternet()) {
                        Intent caretipsintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        caretipsintent.putExtra("care_tips_key", care_tips_url);
                        startActivity(caretipsintent);
                    } else {

                    }
                } else if (position == 10) {
                    if (checkinternet()) {
                        Intent stuntmaniaintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        stuntmaniaintent.putExtra("stuntmania_key", stuntmania_url);
                        startActivity(stuntmaniaintent);
                    } else {

                    }
                } else if (position == 11) {
                    if (checkinternet()) {
                        Intent modificationintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        modificationintent.putExtra("modification_key", modification_url);
                        startActivity(modificationintent);
                    } else {

                    }
                } else if (position == 12) {
                    if (checkinternet()) {
                        Intent legalmattersintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        legalmattersintent.putExtra("motorcycle_matters_key", motorcycle_matters_url);
                        startActivity(legalmattersintent);
                    } else {

                    }
                } else if (position == 13) {
                    if (checkinternet()) {
                        Intent storyintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        storyintent.putExtra("story_key", story_url);
                        startActivity(storyintent);
                    } else {

                    }
                } else if (position == 14) {
                    if (checkinternet()) {
                        Intent newsintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        newsintent.putExtra("news_key", news_url);
                        startActivity(newsintent);
                    } else {

                    }
                } else if (position == 15) {
                    if (checkinternet()) {
                        Intent photointent = new Intent(GridviewPage.this, DetailsActivity.class);
                        photointent.putExtra("photo_gallery_key", photo_gallery_url);
                        startActivity(photointent);
                    } else {

                    }
                } else if (position == 16) {
                    if (checkinternet()) {
                        Intent vediosintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        vediosintent.putExtra("vedios_key", vedios_url);
                        startActivity(vediosintent);
                    } else {

                    }
                } else if (position == 17) {
                    if (checkinternet()) {
                        Intent bikepriceintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        bikepriceintent.putExtra("bike_price_key", bike_price_url);
                        startActivity(bikepriceintent);
                    } else {

                    }
                } else if (position == 18) {
                    if (checkinternet()) {
                        Intent showroomsintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        showroomsintent.putExtra("showrooms_key", showrooms_url);
                        startActivity(showroomsintent);
                    } else {

                    }
                } else if (position == 19) {
                    if (checkinternet()) {
                        Intent hondariderszoneintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        hondariderszoneintent.putExtra("honda_ridersZone_key", honda_ridersZone_url);
                        startActivity(hondariderszoneintent);
                    } else {

                    }
                } else if (position == 20) {
                    if (checkinternet()) {
                        Intent aboutintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        aboutintent.putExtra("about_key", about_url);
                        startActivity(aboutintent);
                    } else {

                    }
                } else if (position == 21) {
                    if (checkinternet()) {
                        Intent contactintent = new Intent(GridviewPage.this, DetailsActivity.class);
                        contactintent.putExtra("contact_key", contact_url);
                        startActivity(contactintent);
                    } else {

                    }
                }

            }
        });


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }


    public ArrayList getdata() {

        ArrayList<Model> models = new ArrayList<>();

        Model s = new Model();
        s.setName(getString(R.string.home));
        s.setImage(R.drawable.home);
        models.add(s);

        s = new Model();
        s.setName(getString(R.string.ownership_reviews));
        s.setImage(R.drawable.bike_ownership);
        models.add(s);


        s = new Model();
        s.setName(getString(R.string.bikebd_reviews));
        s.setImage(R.drawable.bikebd1);
        models.add(s);

        s = new Model();
        s.setName(getString(R.string.technical_reviews));
        s.setImage(R.drawable.technical_review);
        models.add(s);

        s = new Model();
        s.setName(getString(R.string.product_reviews));
        s.setImage(R.drawable.product);
        models.add(s);

        s = new Model();
        s.setName(getString(R.string.market_reviews));
        s.setImage(R.drawable.market_review);
        models.add(s);

        s = new Model();
        s.setName(getString(R.string.comparison_reviews));
        s.setImage(R.drawable.comparison_review);
        models.add(s);

        s = new Model();
        s.setName(getString(R.string.beginers_tips));
        s.setImage(R.drawable.tips);
        models.add(s);

        s = new Model();
        s.setName(getString(R.string.riding_tips));
        s.setImage(R.drawable.riding_tips);
        models.add(s);

        s = new Model();
        s.setName(getString(R.string.care_tips));
        s.setImage(R.drawable.care_technical);
        models.add(s);

        s = new Model();
        s.setName(getString(R.string.stuntmania));
        s.setImage(R.drawable.home);
        models.add(s);


        s = new Model();
        s.setName(getString(R.string.modification));
        s.setImage(R.drawable.bike_modification);
        models.add(s);

        s = new Model();
        s.setName(getString(R.string.motorcycle_matters));
        s.setImage(R.drawable.legal_matters);
        models.add(s);

        s = new Model();
        s.setName(getString(R.string.story));
        s.setImage(R.drawable.story);
        models.add(s);

        s = new Model();
        s.setName(getString(R.string.news));
        s.setImage(R.drawable.news);
        models.add(s);

        s = new Model();
        s.setName(getString(R.string.photo_gallery));
        s.setImage(R.drawable.photo);
        models.add(s);

        s = new Model();
        s.setName(getString(R.string.vedios));
        s.setImage(R.drawable.vedios);
        models.add(s);


        s = new Model();
        s.setName(getString(R.string.bike_price));
        s.setImage(R.drawable.price);
        models.add(s);

        s = new Model();
        s.setName(getString(R.string.showrooms));
        s.setImage(R.drawable.showroom);
        models.add(s);

        s = new Model();
        s.setName(getString(R.string.honda_riders_zone));
        s.setImage(R.drawable.honda_riders_zone);
        models.add(s);

        s = new Model();
        s.setName(getString(R.string.about));
        s.setImage(R.drawable.about);
        models.add(s);

        s = new Model();
        s.setName(getString(R.string.contact));
        s.setImage(R.drawable.contact);
        models.add(s);

        return models;

    }

    /////checkinternet method

    public boolean checkinternet() {

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            return true;
        }

        return false;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
