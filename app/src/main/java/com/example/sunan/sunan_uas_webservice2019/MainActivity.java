package com.example.sunan.sunan_uas_webservice2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button cek;
    TextView tv1,tv2, tv3, tv4, tv5, tv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cek = (Button) findViewById(R.id.btn_cek);
        tv1 = (TextView) findViewById(R.id.tv_jwb);
        tv2 = (TextView) findViewById(R.id.tv_jwb2);
        tv3 = (TextView) findViewById(R.id.tv_jwb3);
        tv4 = (TextView) findViewById(R.id.tv_jwb4);
        tv5 = (TextView) findViewById(R.id.tv_jwb5);
        tv6 = (TextView) findViewById(R.id.tv_jwb6);

        cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }
}
