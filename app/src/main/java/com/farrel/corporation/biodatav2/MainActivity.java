package com.farrel.corporation.biodatav2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setElevation(0);
            getSupportActionBar().setTitle("Profile");
//            getSupportActionBar().setTitle(Html.fromHtml("<font color=\""+R.color.linxWhite+"\">Profil</font>"));
        }
    }

    public void openApp(View view) {
        switch (view.getId()) {
            case R.id.btn_phone :
                Intent callApp = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:082134411244"));
                startActivity(callApp);
                break;
            case R.id.btn_email :
                Intent gmailApp = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:frl25ap@gmail.com"));
                startActivity(gmailApp);
                break;
            case R.id.btn_maps :
                Uri specificLocationWihPlusCode = Uri.parse("https://plus.codes/XC4V+84," + Uri.encode("Tembalang, Semarang City, Central Java"));
                Intent mapApp = new Intent(Intent.ACTION_VIEW, specificLocationWihPlusCode);
                startActivity(mapApp);
                break;
        }
    }
}