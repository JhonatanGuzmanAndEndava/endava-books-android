package com.endava.books;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.endava.books.view.ListBookView;

public class MainActivity extends AppCompatActivity {

    Button buttonEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

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
    }

    public void showListBook(View view) {
        Intent listBookList = new Intent(this, ListBookView.class);
        startActivity(listBookList);
    }

}
