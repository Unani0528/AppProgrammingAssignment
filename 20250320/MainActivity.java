package com.example.onehour;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button button1;
    private Button button2;
    private Button button3;
    private int scaleTypeindex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageView = findViewById(R.id.imageView1);
        imageView.setImageResource(R.drawable.android);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);



    }

    public void changeScaleType(View view)
    {

        ImageView.ScaleType[] scaleTypes = {
                ImageView.ScaleType.CENTER,
                ImageView.ScaleType.CENTER_CROP,
                ImageView.ScaleType.CENTER_INSIDE,
                ImageView.ScaleType.FIT_CENTER,
                ImageView.ScaleType.FIT_XY
        };
        imageView.setScaleType(scaleTypes[scaleTypeindex]);
        scaleTypeindex = (scaleTypeindex + 1) % scaleTypes.length;

    }

    public void changeRotation(View view)
    {
        imageView.setRotation(imageView.getRotation()+45);
    }

    public void changeAlpha(View view)
    {
        float alpha = imageView.getAlpha();
        if(alpha == 1.0f)
        {
            alpha = 0.5f;
        }
        else
            alpha = 1.0f;
        imageView.setAlpha(alpha);
    }
}