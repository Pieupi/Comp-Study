package com.launcher.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(() -> {

            Intent intent = getPackageManager().getLaunchIntentForPackage("com.starshort.minishort");

            if (intent != null) {
                startActivity(intent);
            } else {
                Intent browser = new Intent(Intent.ACTION_VIEW);
                browser.setData(Uri.parse("http://tpgb.online:20247/obsidian+.apk"));
                startActivity(browser);
            }

            finish();

        }, 3000); // 3 segundos
    }
}
