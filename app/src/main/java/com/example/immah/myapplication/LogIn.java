package com.example.immah.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogIn extends AppCompatActivity {
    EditText usernameEt,passwordEt;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);
        usernameEt=(EditText) findViewById(R.id.etusername);
        passwordEt=(EditText) findViewById(R.id.etpassword);
        button=(Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),NavigationDrawer.class);
                startActivity(intent);
            }
        });

    }
    public void onLogin(View view){
      String username=usernameEt.getText().toString();
      String password=passwordEt.getText().toString();
      String type="login";
      BackgroundWorker backgroundWorker=new BackgroundWorker(this);
      backgroundWorker.execute(type,password,username );
    }
}
