package kr.mindwing.webbrowser;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText textUrl;
    private WebView webView;
    private OnKeyListener listener = new OnKeyListener() {

        @Override
        public boolean onKey(View v, int keyCode, KeyEvent event) {
            if (event.getAction() != KeyEvent.ACTION_DOWN) {
                return false;
            }

            boolean processed = false;

            switch (keyCode) {
                case KeyEvent.KEYCODE_ENTER:
                    webView.loadUrl(textUrl.getText().toString());

                    processed = true;

                    break;

                default:

                    break;
            }

            return processed;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hideActionBar();
        setupUI();
    }

    private void setupUI() {
        textUrl = (EditText) findViewById(R.id.text_url);
        textUrl.setOnKeyListener(listener);
        textUrl.setText("http://facebook.com");

        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
    }

    private void hideActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}
