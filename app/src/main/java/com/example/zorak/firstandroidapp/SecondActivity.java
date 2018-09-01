package com.example.zorak.firstandroidapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Zorak on 9/1/2018.
 */

public class SecondActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_layout);
        Button mBack;
        mBack = (Button) findViewById(R.id.back);
        View.OnClickListener backlistener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this,"No going back!",Toast.LENGTH_SHORT).show();
               launchActivity();
            }
        };
        mBack.setOnClickListener(backlistener);
    }
    private void launchActivity() {

        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

}
