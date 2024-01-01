package com.example.scheduletheevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookingPageActivity extends AppCompatActivity {
    ImageView img;
    TextView hName, hLocation, hPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_page);

        img = findViewById(R.id.img_hall);
        hName = findViewById(R.id.txt_hall_name);
        hLocation = findViewById(R.id.txt_hall_location);
        hPrice = findViewById(R.id.txt_hall_price);

        img.setImageResource(getIntent().getIntExtra("img", 0));
        hName.setText(getIntent().getStringExtra("hName"));
        hLocation.setText(getIntent().getStringExtra("hLocation"));
        hPrice.setText(getIntent().getStringExtra("hPrice"));
    }
}