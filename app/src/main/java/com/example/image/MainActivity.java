package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView myImageView1,myImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImageView1 = (ImageView) findViewById(R.id.pic1);
        myImageView2 = (ImageView) findViewById(R.id.pic2);

        myImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Wow!Beautiful Sun Rise Picture",Toast.LENGTH_SHORT).show();
            }
        });
        myImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"WOw! Beautiful Sun Up Picture",Toast.LENGTH_SHORT).show();
            }
        });
    }

//    @Override
//    public void onClick(View v) {
//        if (v.getId()==R.id.pic1){
//            Toast.makeText(MainActivity.this,"Beautiful Sun Rise Picture",Toast.LENGTH_SHORT).show();
//        }else if (v.getId()==R.id.pic2){
//            Toast.makeText(MainActivity.this,"Beautiful Sun Up Picture",Toast.LENGTH_SHORT).show();
//        }
//    }
}