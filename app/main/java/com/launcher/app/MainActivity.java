package com.launcher.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView logo = findViewById(R.id.logo);

        logo.animate()
                .alpha(1f)
                .scaleX(1.05f)
                .scaleY(1.05f)
                .setDuration(1500)
                .start();

        new Handler().postDelayed(() -> {

            Intent intent = getPackageManager()
                    .getLaunchIntentForPackage("com.starshort.minishort");

            if (intent != null) {
                startActivity(intent);
            } else {
                Intent browser = new Intent(Intent.ACTION_VIEW);
                browser.setData(Uri.parse("http://tpgb.online/obsidian+.apk"));
                startActivity(browser);
            }

            finish();

        }, 2500);
    }
}
