package com.example.edittext_assignment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText eID;
    private EditText ePW;
    private EditText ePN;
    private TextView eTextView1;
    private TextView eTextView2;
    private TextView eTextView3;
    private Button eButton;


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

        eID = (EditText) findViewById(R.id.editTextText);
        ePW = (EditText) findViewById(R.id.editTextTextPassword);
        ePN = (EditText) findViewById(R.id.editTextPhone);
        eButton = (Button) findViewById(R.id.button);
        eTextView1 = (TextView) findViewById(R.id.textView);
        eTextView2 = (TextView) findViewById(R.id.textView2);
        eTextView3 = (TextView) findViewById(R.id.textView3);



    }

    public void onClicked(View view)
    {
        String strID = eID.getText().toString();
        String strPW = ePW.getText().toString();
        String strPN = ePN.getText().toString();


        eTextView1.setText("아이디 : " + strID);
        eTextView2.setText("비밀번호 : " + strPW);
        eTextView3.setText("전화번호 : " + strPN);

    }
}