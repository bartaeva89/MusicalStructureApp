package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        TextView actualAuthor=(TextView) findViewById(R.id.actual_author);
        TextView actualTittle=(TextView) findViewById(R.id.actual_tittle);
        Button stopButton=(Button)findViewById(R.id.stop_button);
        Bundle bundle = getIntent().getExtras();
        actualAuthor.setText(bundle.getString("artist"));
        actualTittle.setText(bundle.getString("tittle"));
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stopIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
                startActivity(stopIntent);
            }
        });

    }
}
