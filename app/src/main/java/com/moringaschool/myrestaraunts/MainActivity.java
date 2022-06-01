package com.moringaschool.myrestaraunts;

import static androidx.constraintlayout.motion.utils.Oscillator.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTxtInputZipcode =(EditText) findViewById(R.id.editTxtInputZipcode);
        Button btnFindRestaurants=(Button)findViewById(R.id.btnRestaurants);
        btnFindRestaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Twende kazi",
//                        Toast.LENGTH_SHORT).show();

                //gather input from edit text and display it on logcat
                String zipcode=editTxtInputZipcode.getText().toString();

                Intent intent=new Intent(MainActivity.this,RestaurantsActivity.class);
                intent.putExtra("zipcode",zipcode);
                startActivity(intent);


            }
        });

    }

}