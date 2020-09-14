package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT ="com.example.myfirstapp.EXTRA_TEXT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWelcomePage();
            }
        });
    }   public void openWelcomePage(){
            EditText editText = (EditText) findViewById(R.id.NameField);
            String Name = editText.getText().toString();
            Intent intent =new Intent(this,WelcomePage.class);
            intent.putExtra(EXTRA_TEXT,Name);
            startActivity(intent);
    }
}