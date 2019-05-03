package com.example.hp.sharedprferforexam;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Getterpage extends AppCompatActivity {

    EditText editText5,editText6;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getterpage);
        Bundle bundle=getIntent().getExtras();
        editText5=findViewById(R.id.text1);
        editText6=findViewById(R.id.text2);
        final String string1=bundle.getString("value1");
        final String string2=bundle.getString("value2");
        Button button=findViewById(R.id.btn6);
        editText5.setText(string1);
        editText6.setText(string2);
        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText5.setText(string1);
                editText6.setText(string2);
            }
        });*/

    }
}
