package com.example.seccion6;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard= findViewById(R.id.card_view_starters);
        mainsCard= findViewById(R.id.card_view_mains);

        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent start = new Intent(MainActivity.this, StarterActivity.class);

                startActivity(start);
            }
        });

        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_main= new Intent(MainActivity.this, MainCoursesActivity.class);

                startActivity(start_main);
            }
        });

        TextView email_TextView= findViewById(R.id.text_view_email_address);
        email_TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent start_email= new Intent(Intent.ACTION_SENDTO);
                start_email.setData(Uri.parse("mailto:jgarciama25paag@ikzubirimanteo.com"));
                startActivity(start_email);

            }
        });

    }

}