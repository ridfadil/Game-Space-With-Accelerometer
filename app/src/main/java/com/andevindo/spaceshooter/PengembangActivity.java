package com.andevindo.spaceshooter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PengembangActivity extends AppCompatActivity {
    Button start;
    EditText nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengembang);
        start = (Button) findViewById(R.id.mulai);
        nama = (EditText) findViewById(R.id.et_name);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PengembangActivity.this, MainActivity.class);
                i.putExtra("nama", nama.getText().toString());
                startActivity(i);
                //startActivity(new Intent(PengembangActivity.this, MainActivity.class));
            }
        });
    }
}
