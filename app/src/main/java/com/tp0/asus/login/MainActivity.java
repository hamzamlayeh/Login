package com.tp0.asus.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void connecter(View view) {
        EditText login=(EditText)findViewById(R.id.T1);
        EditText pass=(EditText)findViewById(R.id.T2);
        Intent inte=new Intent(this,Main2Activity.class);
        Bundle b=new Bundle();
        b.putString("log",login.getText().toString());
        b.putString("pass",pass.getText().toString());
        inte.putExtras(b);
        startActivity(inte);
    }
   /* TextView nom=(TextView)findViewById(R.id.nam);
    String name=getResources().getString(R.string.dep);

    nom.setText(name);*/
}
