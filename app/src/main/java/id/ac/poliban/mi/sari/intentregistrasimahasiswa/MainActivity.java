package id.ac.poliban.mi.sari.intentregistrasimahasiswa;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final int REQUEST_CODE = 1000;
    private String mhs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) getSupportActionBar().setTitle("Info");
        Button btInput = findViewById(R.id.btShowInput);
        Button btData = findViewById(R.id.btShowData);

        btData.setOnClickListener(v -> {
            new AlertDialog.Builder(this)
                    .setTitle("info")
                    .setMessage(mhs)
                    .setPositiveButton("OK", null).show();

        });

        btInput.setOnClickListener(v -> {
            Intent intent = new Intent(this, mhs.class);
            startActivityForResult(intent, REQUEST_CODE);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data); assert data != null;
        if (requestCode==REQUEST_CODE && resultCode== Activity.RESULT_OK && data.getExtras()!=null){
            mhs = " Nim : " + data.getStringExtra("MhsNim") + "\n";
            mhs += " Nama : " + data.getStringExtra("MhsNama") + "\n";
            mhs += " Alamat : " + data.getStringExtra("MhsAlamat") + "\n";
            mhs += " Telepon : " + data.getStringExtra("Mhstelepon");
        }
    }
}
