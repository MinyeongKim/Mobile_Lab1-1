package com.example.alsdu.lab11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    int imageIndex = 0;//flag
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.image1);
        imageView2 = (ImageView)findViewById(R.id.image2);

        //Only one image is shown when accessing the app
        imageView.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.INVISIBLE);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                changeImage();
            }

            /*
            *Function for changing images
            * if imageIndex is 0, image1 not shows and image2 shows
            * if imageIndex is 1, image1 shows and image2 not shows
             *  */
            private  void changeImage(){
                if(imageIndex == 0) {
                    imageView.setVisibility(View.INVISIBLE);
                    imageView2.setVisibility(View.VISIBLE);

                    imageIndex = 1;
                }
                else if(imageIndex == 1){
                    imageView.setVisibility(View.VISIBLE);
                    imageView2.setVisibility(View.INVISIBLE);

                    imageIndex = 0;
                }
            }
        });
    }
}

