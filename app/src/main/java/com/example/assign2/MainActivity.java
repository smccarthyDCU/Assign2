package com.example.assign2;

import static android.content.ContentValues.TAG;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"App started");
    }
    //Create an implicit intent which opens the camera
    public void implicitIntentCamera(View view) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intent);
      Log.d(TAG, "Camera Opened");
    }
    //Create an implicit intent which opens the gallery
    public void implicitIntentGallary(View view) {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        startActivity(intent);
        Log.d(TAG, "Gallery Opened");
    }
    // //Create an explicit intent to open the emailActivity.java
    public void EmailActivity(View view) {
        Intent intent = new Intent(this, EmailActivity.class);
        startActivity(intent);
    }
    //Button buttone;

    //buttone = findViewById(R.id.editTextText4);

    //buttone.setonclick


}