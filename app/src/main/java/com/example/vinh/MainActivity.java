package com.example.vinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addUserView(View view){
        Intent intent = new Intent (this, com.example.vinh.AddUserActivity.class);
        startActivity(intent);
    }
    public void listUserView(View view){
        Intent intent = new Intent(this, com.example.vinh.ListUserInRecycleViewActivity.class);
        startActivity(intent);
    }
}