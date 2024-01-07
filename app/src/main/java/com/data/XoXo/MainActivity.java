package com.data.XoXo;
import android.util.Log;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.JavascriptInterface;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
	
	private WebView webView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Initialize WebView
		webView = findViewById(R.id.webView);
		WebSettings webSettings = webView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		webView.setWebViewClient(new WebViewClient());
		
		
		// Add JavascriptInterface
		webView.addJavascriptInterface(new JavaScriptInterface(), "Android");
		
		// Load HTML file
		webView.loadUrl("file:///android_asset/web/XoXo.html");
		
		// Initialize exit button
		
	}
	
	// Define a JavaScript interface
	private class JavaScriptInterface {
		@JavascriptInterface
	
		public void exitApp(){
			System.exit(0);
		}
	}
}