package com.example.tonu.uploadimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();

        String mesaage = bundle.getString("translate");

        textResult=(TextView) findViewById(R.id.textview_result);

        textResult.setText(mesaage);
    }
}
