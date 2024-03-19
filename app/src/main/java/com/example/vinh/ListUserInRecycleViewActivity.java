package com.example.vinh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ListUserInRecycleViewActivity extends AppCompatActivity{

    private UserStorage userStorage;
    private RecyclerView recyclerView;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_user);

        userStorage = UserStorage.getInstance();

        recyclerView = findViewById(R.id.rvUserView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        recyclerView.setAdapter(new UserListAdapter(getApplicationContext(), userStorage.getUsers()));

    }
}
