package com.example.alanchang.quickapplauncher;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Launch Adder Application
        Button adderLauncherBtn = (Button) findViewById(R.id.adderLauncherBtn);
        adderLauncherBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), AdderActivity.class);
                startIntent.putExtra("com.example.alanchang.placeholder", "Adder Application");
                startActivity(startIntent);
            }
        });

        // Launch Google URL
        Button googleBtn = findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "http://www.google.com";
                Uri address = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, address);
                if(gotoGoogle.resolveActivity(getPackageManager()) != null){
                    startActivity(gotoGoogle);
                }
            }
        });

    }
}
