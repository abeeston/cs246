package com.example.amy.scripturereference;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Display extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        LinearLayout lView = new LinearLayout(this);

        Intent myIntent = getIntent();
        Bundle b = myIntent.getExtras();

        String bBook = b.getString("myBook");
        TextView dBook = new TextView(this);
        dBook.setText(bBook);

        String bChapter = b.getString("myChapter");
        TextView dChapter = new TextView(this);
        dChapter.setText(bChapter);

        String bVerse = b.getString("myVerse");
        TextView dVerse = new TextView(this);
        dVerse.setText(bVerse);

        lView.addView(dBook);
        lView.addView(dChapter);
        lView.addView(dVerse);

        setContentView(lView);
    }
}
