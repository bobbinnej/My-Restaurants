package com.moringaschool.myrestaraunts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.camera2.params.RecommendedStreamConfigurationMap;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class RestaurantsActivity extends AppCompatActivity {
    //create a string array of restaurants
   private String[] restaurants=new String[]{
           "Life of a pie","Screen Door","Mi Mero Mole","Mother's Bistro","Luc Lac","Sweet Basil",
           "Slappy Cakes","Equinox","Miss Delta's","Andina","Lardo","Portland City Grill",
           "Fat Head's brewery","Chipotle","Subway"
   };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        //initialize the list view
        ListView mListView=(ListView) findViewById(R.id.listview);

        TextView zipcodeTextView=(TextView)findViewById(R.id.textViewZipcode);
        //implementing the array adapter
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, restaurants);
        mListView.setAdapter(adapter);
         // add a toast that will display restaurant name when a list item is clicked
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String restaurant =((TextView)view).getText().toString();
                Toast.makeText(RestaurantsActivity.this,restaurant, Toast.LENGTH_LONG).show();
            }
        });
        Intent intent=getIntent();
        String zipcode=intent.getStringExtra("zipcode");
        zipcodeTextView.setText("Here are all the locations near:"+zipcode);



    }
}