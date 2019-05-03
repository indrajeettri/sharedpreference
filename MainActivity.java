package com.example.hp.sharedprferforexam;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText,editText1;
    Button button2,button1;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edit1);
        editText1=findViewById(R.id.edit2);
        button1=findViewById(R.id.but1);
        button2=findViewById(R.id.but2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=editText.getText().toString();
                String pass=editText1.getText().toString();
                sharedPreferences=getSharedPreferences("login",MODE_PRIVATE);
                String ckuser=sharedPreferences.getString("username","");
                String ckpass=sharedPreferences.getString("password","");
                if(user.equals(ckuser)&& pass.equals(ckpass)){
                    Toast.makeText(getApplicationContext(),"username is"+ckuser,Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(),"password is "+ckpass,Toast.LENGTH_SHORT).show();

                    Intent intent=new Intent(MainActivity.this,Getterpage.class);
                    intent.putExtra("value1",ckuser);
                    intent.putExtra("value2",pass);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(),"enter valid",Toast.LENGTH_SHORT).show();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,signup.class);
                startActivity(intent);
            }
        });
    }
}
