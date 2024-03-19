package com.example.vinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.EditText;

public class AddUserActivity extends AppCompatActivity{
    private EditText inputFirstName;
    private EditText inputLastName;
    private EditText inputEmail;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        inputFirstName = findViewById(R.id.editFirstName);
        inputLastName = findViewById(R.id.editLastName);
        inputEmail = findViewById(R.id.editEmail);
    }
    public void addUser(View view){
        String firstName = inputFirstName.getText().toString();
        String lastName = inputLastName.getText().toString();
        String email = inputEmail.getText().toString();
        RadioGroup degrees = findViewById(R.id.radioDegreeProgram);
        int checkedId = degrees.getCheckedRadioButtonId();
        int mappedValue = mapToConstant(checkedId);
        switch (mappedValue) {
            case 1:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email, "Software Engineering"));
                break;
            case 2:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email, "Industrial Management"));
                break;
            case 3:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email, "Computational Engineering"));
                break;
            case 4:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email, "Electrical Engineering"));
                break;
            default:
                break;
            }
        }
    private int mapToConstant(int resourceId) {
        if (resourceId == R.id.seRadioButton) {
            return 1;
        } else if (resourceId == R.id.imRadioButton) {
            return 2;
        } else if (resourceId == R.id.ceRadioButton) {
            return 3;
        } else if (resourceId == R.id.eeRadioButton) {
            return 4;
        } else {
            return -1; // Default or unknown case
        }
    }
}

