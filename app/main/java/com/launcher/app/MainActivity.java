package com.launcher.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getPackageManager().getLaunchIntentForPackage("com.starshort.minishort");

        if(intent != null){
            startActivity(intent);
        }else{
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("http://tpgb.online:20247/obsidian+.apk"));
            startActivity(i);
        }

        finish();
    }
}
