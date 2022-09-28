package com.atikulsoftware.admobads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import com.atikulsoftware.adsadmob.AdmobBannerAds;
import com.atikulsoftware.adsadmob.AdmobInterstitialAd;

public class MainActivity extends AppCompatActivity {

    Button InitAdsBtn;
    LinearLayout BannerAds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitAdsBtn = findViewById(R.id.InitAdsBtn);
        BannerAds = findViewById(R.id.BannerAds);
        AdmobBannerAds.loadAds(BannerAds, MainActivity.this, "ca-app-pub-3940256099942544/6300978111");

        AdmobInterstitialAd.InterstitialAdUnitID = "ca-app-pub-3940256099942544/1033173712";
        AdmobInterstitialAd.LoadInterstitial(MainActivity.this);


        InitAdsBtn.setOnClickListener(v -> {
            // Code here ======
            AdmobInterstitialAd.ShowAds(MainActivity.this);
        });


    }
}