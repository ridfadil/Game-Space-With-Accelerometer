package com.farid.padilah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.aturan_game:
                startActivity(new Intent(PengembangActivity.this, AboutActivity.class));
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
