package com.example.tugas3mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.edNpm)
    EditText edNpm;
    @BindView(R.id.edNama)
    EditText edNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSubmit)
    void submit() {

        String strnama, strnpm;

        strnpm = edNpm.getText().toString();
        strnama = edNama.getText().toString();

        if (strnpm.isEmpty() && strnama.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Lengkapi Data", Toast.LENGTH_LONG).show();

        } else {
            Intent a = new Intent(MainActivity.this, MainActivity2.class);
            a.putExtra("Npm", strnpm);
            a.putExtra("Nama", strnama);
            startActivity(a);
            finish();


        }
    }
}
