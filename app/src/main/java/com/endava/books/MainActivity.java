package com.endava.books;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.endava.books.view.ListBookView;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    Button buttonEnter;
    TextInputEditText textInputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //Always in onCreate
        textInputEditText = findViewById(R.id.textInput);

        if(savedInstanceState != null) {
            textInputEditText.setText(savedInstanceState.getString("userInput"));
            Log.d(LOG_TAG, savedInstanceState.getString("userInput"));
        }

        //savedInstanceState.

        //buttonEnter = findViewById(R.id.enterButton);

        /*
        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listBookList = new Intent(getApplicationContext(), ListBookView.class);
                startActivity(listBookList);
            }
        });
        */

        Log.d(LOG_TAG,"El debuggeo intenso");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    //Called before onStop()
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        // Save the user's current game state
        savedInstanceState.putString("userInput", textInputEditText.getText().toString());
    }

    public void showListBook(View view) {
        Intent listBookList = new Intent(this, ListBookView.class);
        startActivity(listBookList);
    }

}
