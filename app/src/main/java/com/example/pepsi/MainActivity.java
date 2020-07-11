package com.example.pepsi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView small,medium,large;
    TextView quantity;
    private boolean smallShown = true;
    private boolean mediumShown = true;
    private boolean largeShown = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quantity = findViewById(R.id.quantity);
        small= findViewById(R.id.small);
        medium= findViewById(R.id.medium);
        large= findViewById(R.id.large);
        small.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((small!=null) && (smallShown)){
                    small.setImageResource(R.drawable.smallsel);
                    medium.setImageResource(R.drawable.medium);
                    large.setImageResource(R.drawable.large);
                    smallShown=false;
                    quantity.setText("100 ml");
                }else{
                    if(small!=null)small.setImageResource(R.drawable.small);
                    smallShown=true;
                    quantity.setText(" ");
                }

            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((medium!=null) && (mediumShown)) {
                    medium.setImageResource(R.drawable.mediumsel);
                    small.setImageResource(R.drawable.small);
                    large.setImageResource(R.drawable.large);
                    mediumShown = false;
                    quantity.setText("250 ml");
                }else{
                    if(medium!=null)medium.setImageResource(R.drawable.medium);
                    mediumShown=true;
                    quantity.setText(" ");
                }
            }
        });

        large.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((large!=null) && (largeShown)) {
                    large.setImageResource(R.drawable.largesel);
                    small.setImageResource(R.drawable.small);
                    medium.setImageResource(R.drawable.medium);
                    largeShown = false;
                    quantity.setText("500 ml");
                }else{
                    if(large!=null)large.setImageResource(R.drawable.large);
                    largeShown=true;
                    quantity.setText(" ");
                }

            }
        });


    }
}
