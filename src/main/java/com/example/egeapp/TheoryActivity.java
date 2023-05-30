package com.example.egeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class TheoryActivity extends AppCompatActivity {

    private ImageView imageView1;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);

        imageView1.setVisibility(View.GONE);
        imageView2.setVisibility(View.GONE);

        String imageURL1 = getIntent().getStringExtra("image");
        String imageURL2 = getIntent().getStringExtra("image2");

        if (imageURL1 != null) {
            imageView1.setVisibility(View.VISIBLE);
            Picasso.get().load(imageURL1).into(imageView1);
        }

        if (imageURL2 != null) {
            imageView2.setVisibility(View.VISIBLE);
            Picasso.get().load(imageURL2).into(imageView2);
        }
    }
    public void backToChosing (View view) {
        finish();
    }
}