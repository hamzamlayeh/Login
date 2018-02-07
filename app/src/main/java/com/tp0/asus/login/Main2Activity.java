package com.tp0.asus.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView text=(TextView)findViewById(R.id.text);
        Bundle b=getIntent().getExtras();
        String login=b.getString("log");
        String pass=b.getString("pass");
        text.setText("login : "+login+" ||| mot de pass : "+pass);

    }
}
