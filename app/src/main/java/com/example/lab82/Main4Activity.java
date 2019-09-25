package com.example.lab82;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    String user="rahul";
    String pass="123";
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        e1=findViewById(R.id.editTextu);
        e2=findViewById(R.id.editTextp);



    }
    public void cl(View view){
        if(user.equals(e1.getText().toString()) && pass.equals(e2.getText().toString()))
            Toast.makeText(getApplicationContext(),"Login Successfull",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(getApplicationContext(),"Login Unsuccessfull",Toast.LENGTH_SHORT).show();

    }
}
