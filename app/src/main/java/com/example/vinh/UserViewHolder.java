package com.example.vinh;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView userFirstName, userLastName, userEmail, userDegree;

    // Corrected constructor name to match the class name
    public UserViewHolder(@NonNull View itemView){
        super(itemView);
        userFirstName = itemView.findViewById(R.id.textFirstName);
        userLastName = itemView.findViewById(R.id.textLastName);
        userEmail = itemView.findViewById(R.id.textEmail);
        userDegree = itemView.findViewById(R.id.textDegreeProgram);
    }
}
