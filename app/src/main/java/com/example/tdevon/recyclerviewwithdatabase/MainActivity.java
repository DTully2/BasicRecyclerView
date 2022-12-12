package com.example.tdevon.recyclerviewwithdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String [] people = {
            "Bobs",
            "Tom",
            "Beaturis",
            "Tony",
            "Bill",
            "Jim",
            "Jane",
            "Betty"
    };
    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recyclerViewManager;
    TextView textViewDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById( R.id.recyclerView );
        textViewDisplay = findViewById(R.id.textView);
        recyclerViewManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(recyclerViewManager);
        recyclerView.setHasFixedSize(true);
        recyclerViewAdapter = new MyAdapter(getApplicationContext(),people);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    public void onButtonClick(View view) {
        switch (view.getId())
        {
            case R.id.buttonTotal:
                textViewDisplay.setText(getString(R.string.thetotal)+ String.valueOf(recyclerView.getAdapter().getItemCount()));
                break;
            case R.id.buttonFirst:
                textViewDisplay.setText(getString(R.string.thefirst)+ people[0]);
                break;
            case R.id.buttonSecond:
                textViewDisplay.setText(getString(R.string.thesecond)+ people[1]);
                break;
        }
    }
}