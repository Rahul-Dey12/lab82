package com.example.lab82;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);
    }
    public  void register(View view){
        Intent i=new Intent(this,Main3Activity.class);
        i.putExtra("userid",e1.getText().toString());
        i.putExtra("password",e2.getText().toString());
        startActivity(i);
    }
}
