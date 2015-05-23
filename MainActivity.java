package com.example.amy.scripturereference;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button sbutton;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbutton = (Button) findViewById(R.id.sbutton);
        sbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        handleButtonClick(v);
    }

    public void handleButtonClick(View view) {
        Intent intent = new Intent(this,  Display.class);

        EditText tBook = (EditText) findViewById(R.id.book1);
        String sBook = "Your favorite scriptures is: " + tBook.getText().toString() + " ";
        EditText tChapter = (EditText) findViewById(R.id.chapter1);
        String sChapter = tChapter.getText().toString() + ":";
        EditText tVerse = (EditText) findViewById(R.id.verse1);
        String sVerse = tVerse.getText().toString();

        intent.putExtra("myBook", sBook);
        intent.putExtra("myChapter", sChapter);
        intent.putExtra("myVerse", sVerse);

        startActivity(intent);
    }

}
