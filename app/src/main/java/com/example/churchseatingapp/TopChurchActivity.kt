package com.example.churchseatingapp

import android.os.Bundle
import android.provider.ContactsContract.Intents.Insert.ACTION
import android.graphics.Color
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient

class TopChurchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_church)
        title = "Top church"

        val webView = findViewById<WebView>(R.id.webView)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://vcelistmc.github.io/Church-Seating-App/")
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webView.getSettings().setBuiltInZoomControls(true);
    }

    // if you press Back button this code will work
    override fun onBackPressed() {
       val webView = findViewById<WebView>(R.id.webView)

        if (webView!!.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }


}}


