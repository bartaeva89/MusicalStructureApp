package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        TextView actualAuthor=(TextView) findViewById(R.id.actual_author);
        TextView actualTittle=(TextView) findViewById(R.id.actual_tittle);
        Bundle bundle = getIntent().getExtras();
        actualAuthor.setText(bundle.getString("artist"));
        actualTittle.setText(bundle.getString("tittle"));
    }
}
