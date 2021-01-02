package com.vektorel.simpsonbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        TextView nameText=findViewById(R.id.nameText);
        TextView jobText=findViewById(R.id.jobText);
        ImageView imageView=findViewById(R.id.imageView);
        Intent intent=getIntent();
        Simpson selectedSimpson= (Simpson) intent.getSerializableExtra("selectedSimpson");
        Bitmap bitmap= BitmapFactory.decodeResource(getApplicationContext().getResources(),selectedSimpson.getPictureInteger());
        imageView.setImageBitmap(bitmap);
        nameText.setText(selectedSimpson.getName());
        jobText.setText(selectedSimpson.getJob());
    }
}