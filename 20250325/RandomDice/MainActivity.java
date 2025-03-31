package com.example.randomdice;

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

    private ImageView Dice1;
    private ImageView Dice2;

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
        Dice1 = findViewById(R.id.Dice1);
        Dice2 = findViewById(R.id.Dice2);
        Dice1.setImageResource(R.drawable.one);
        Dice2.setImageResource(R.drawable.one);
    }

    public void Roll(View view)
    {
        int num1 = (int)(Math.random()*10) % 6 + 1;
        int num2 = (int)(Math.random()*10) % 6 + 1;
        switch (num1)
        {
            case 1:
                Dice1.setImageResource(R.drawable.one);
                break;
            case 2:
                Dice1.setImageResource(R.drawable.two);
                break;
            case 3:
                Dice1.setImageResource(R.drawable.three);
                break;
            case 4:
                Dice1.setImageResource(R.drawable.four);
                break;
            case 5:
                Dice1.setImageResource(R.drawable.five);
                break;
            case 6:
                Dice1.setImageResource(R.drawable.six);
                break;
        }
        switch (num2)
        {
            case 1:
                Dice2.setImageResource(R.drawable.one);
                break;
            case 2:
                Dice2.setImageResource(R.drawable.two);
                break;
            case 3:
                Dice2.setImageResource(R.drawable.three);
                break;
            case 4:
                Dice2.setImageResource(R.drawable.four);
                break;
            case 5:
                Dice2.setImageResource(R.drawable.five);
                break;
            case 6:
                Dice2.setImageResource(R.drawable.six);
                break;
        }
    }
}