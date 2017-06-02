package com.ramya.webview;
import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class MainActivity extends Activity {
WebView web;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web = (WebView) findViewById(R.id.mywebview);  
        WebSettings webset=web.getSettings();
        webset.setJavaScriptEnabled(true);
        web.loadUrl("http://www.aforandroid.info");
        web.setWebViewClient(new WebViewClient());  
}
    @Override
    public void onBackPressed(){
    	if(web.canGoBack()){
    		web.goBack();
    	}
    	else{
    		super.onBackPressed();
    	}
    }
}
