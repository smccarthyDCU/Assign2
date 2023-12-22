package com.example.assign2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

//
public class EmailActivity extends AppCompatActivity {

    private static final String TO = "com.example.assign2.TO";
    private static final String SUBJECT = "com.example.assign2.SUBJECT";
    private static final String COMPOSE = "com.example.assign2.COMPOSE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
    }
    public void onClick(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        EditText To = (EditText) findViewById(R.id.editTextText4);
        EditText Subject = (EditText) findViewById(R.id.editTextText3);
        EditText compose = (EditText) findViewById(R.id.textView7);

        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

    }


}