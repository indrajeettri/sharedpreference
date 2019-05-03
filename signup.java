package com.example.hp.sharedprferforexam;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signup extends AppCompatActivity {

    EditText editText3,editText4,editText5;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        editText3 =findViewById(R.id.edit3);
        editText4=findViewById(R.id.edit4);
        editText5 =findViewById(R.id.edit5);
        Button button4=findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sharedPreferences=getSharedPreferences("login",MODE_PRIVATE);
                editor1=sharedPreferences.edit();
                String username=editText3.getText().toString();
                String password=editText3.getText().toString();
                String mobile=editText3.getText().toString();
               editor1.putString("username",username);
               editor1.putString("password",password);
               editor1.putString("Mobile",mobile);
               editor1.commit();
                Intent in=new Intent(signup.this,MainActivity.class);
                startActivity(in);

            }
        });

    }
}
