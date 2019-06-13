package com.endava.books.view;

import android.os.Bundle;

import com.endava.books.R;
import com.endava.books.model.AuthorAdapter;
import com.endava.books.model.BookAdapter;
import com.endava.books.model.ModelFactory;
import com.endava.books.model.PublisherAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ListBookView extends AppCompatActivity {

    //needs view pager
    TabLayout tabLayout;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_book);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        recyclerView = findViewById(R.id.recyclerView);
        final LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new BookAdapter(ModelFactory.getBooks()));

        tabLayout = findViewById(R.id.tabs);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                Log.i("TABS", "Este es el tab: "+tab.getText());

                //Inflate the RecyclerView
                switch (tab.getPosition()) {
                    case 0:

                        recyclerView.setAdapter(new BookAdapter(ModelFactory.getBooks()));
                        //Log.i("DATA", ModelFactory.getBooks().toString());
                        break;
                    case 1:
                        recyclerView.setAdapter(new AuthorAdapter(ModelFactory.getAuthors()));
                        break;
                    case 2:
                        recyclerView.setAdapter(new PublisherAdapter(ModelFactory.getPublishers()));
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                Toast toast = Toast.makeText(getApplicationContext(), "Unselected "+tab.getText(),Toast.LENGTH_SHORT);
                toast.show();
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        Log.i("TABS", "Has espichado la tab :"+id);

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
