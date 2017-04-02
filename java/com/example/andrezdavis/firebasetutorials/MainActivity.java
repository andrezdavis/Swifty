package com.example.andrezdavis.firebasetutorials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Random;

import com.example.andrezdavis.firebasetutorials.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.logging.ErrorManager;



public class MainActivity extends AppCompatActivity {

    private Button mFireBaseBtn;
    private DatabaseReference mDatabase;

    public static final String TAG = ("");


Random r = new Random();
    private EditText mNameField, mPhoneField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();
        mDatabase = FirebaseDatabase.getInstance().getReference().child("User Information");

        mNameField = (EditText) findViewById(R.id.name_field);

        mPhoneField = (EditText) findViewById(R.id.phone_field);

    }

public void init(){

    mFireBaseBtn = (Button) findViewById(R.id.firebase_btn);


        mFireBaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 1 - Create child in root object
                // 2 - Assign some value to the child object

                String name = mNameField.getText().toString().trim();

                String phone = mPhoneField.getText().toString().trim();

                String first4 = "";

                int rand = r.nextInt()*10000;


                first4 = ("" + rand);




                if (name.length() < 1 || phone.length() < 10) {
                    Log.i(name, "Write");
                }



                else {
                    HashMap<String, String> dataMap = new HashMap<String, String>();


                    dataMap.put("Name", name);
                    dataMap.put("Phone Number", phone);

                    mDatabase.push().setValue(dataMap);



                }

            }


        });
    }
}

