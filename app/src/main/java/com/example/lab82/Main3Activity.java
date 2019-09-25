package com.example.lab82;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView t1,t2;
    String uid,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        t1=findViewById(R.id.textView12);
        t2=findViewById(R.id.textView13);

        Intent i=getIntent();
        uid=t1.getText()+i.getStringExtra("userid");
        pass=t2.getText()+i.getStringExtra("userid");

        t1.setText(uid);
        t2.setText(pass);
    }
}
