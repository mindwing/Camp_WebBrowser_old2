package kr.mindwing.webbrowser;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hideActionBar();
    }

    private void hideActionBar() {
        View decorView = getWindow().getDecorView();
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}
