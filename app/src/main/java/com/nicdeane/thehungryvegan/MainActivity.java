package com.nicdeane.thehungryvegan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_mains);

        startersCard.setOnClickListener(v -> {
            Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);
            startActivity(startersActivityIntent);
        });

        mainsCard.setOnClickListener(v -> {
            Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);
            startActivity(mainCoursesActivityIntent);
        });

        TextView emailTextView = findViewById(R.id.text_view_email);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:info@artstageapp.com"));
                startActivity(launchEmailAppIntent); // Not safe check the docs.
            }
        });
    }

}