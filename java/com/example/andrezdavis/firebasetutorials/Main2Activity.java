package com.example.andrezdavis.firebasetutorials;

import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.io.IOException;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import android.Manifest.permission;
import android.content.pm.PackageManager;
import android.content.Context;
import android.telephony.SmsManager;
import android.widget.Toast;

import java.util.Random;


import com.example.andrezdavis.firebasetutorials.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Main2Activity extends AppCompatActivity {

    public static Random r = new Random();
    int rand = r.nextInt() * 10000000;
    private Button mButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

            @Override
            public void onClick(View v) {


            Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
            startActivity(intent);
            }
        });

    }
}
