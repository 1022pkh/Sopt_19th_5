package com.semi.sopt_19th_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.semi.sopt_19th_5.font.FontActivity;
import com.semi.sopt_19th_5.recyclerview.RecycleActivity;

public class MainActivity extends AppCompatActivity {

    private Button semiBtn1;
    private Button semiBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        semiBtn1 = (Button)findViewById(R.id.semiBtn1);
        semiBtn2 = (Button)findViewById(R.id.semiBtn2);

        semiBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),FontActivity.class);
                startActivity(intent);
            }
        });

        semiBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RecycleActivity.class);
                startActivity(intent);
            }
        });


    }
}
