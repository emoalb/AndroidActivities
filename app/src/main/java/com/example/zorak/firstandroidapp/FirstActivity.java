package com.example.zorak.firstandroidapp;
        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

/**
 * Created by Zorak on 8/31/2018.
 */


    public class FirstActivity extends Activity {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main_layout);
            Button mNew;

            mNew = (Button) findViewById(R.id.new_layout);


            View.OnClickListener listener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
launchActivity();

                }
            };


            mNew.setOnClickListener(listener);
        }
            private void launchActivity() {

                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
            }



    }

