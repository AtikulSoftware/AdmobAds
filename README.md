# AdmobAds
Easy Admob Ads Library

> How To Setup This Library ?
Video - 

> Step 1. Add the JitPack repository to your build file
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  > Step 2. Add the dependency
  ```
  	dependencies {
	        implementation 'com.github.AtikulSoftware:AdmobAds:1.0.0'
	}
  ```
  
  > Add Internet permission in Manifests
  ```
  <uses-permission android:name="android.permission.INTERNET" />  
  <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />  
  ```
  
  > Add Admob Meta In Manifests .
  ```
    <meta-data  
       android:name="com.google.android.gms.ads.APPLICATION_ID"  
       android:value="ca-app-pub-3940256099942544~3347511713" />  
```

> Admob Test Ads Unit Id
```
Banner		 - ca-app-pub-3940256099942544/6300978111
Interstitial	 - ca-app-pub-3940256099942544/1033173712
```

> This Library Created By Atikul Software. It is Educational purposes. 
Name : Md Atikul Islam
