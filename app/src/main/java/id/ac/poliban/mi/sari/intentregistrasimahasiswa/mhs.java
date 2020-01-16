package id.ac.poliban.mi.sari.intentregistrasimahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class mhs extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mhs);

         EditText etNim = findViewById(R.id.etNim);
         EditText etNama = findViewById(R.id.etNama);
         EditText etAlamat = findViewById(R.id.etAlamat);
         EditText etTelp = findViewById(R.id.etTelp);
         Button btSend = findViewById(R.id.btSend);

        btSend.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.putExtra("MhsNim", etNim.getText().toString());
            intent.putExtra("MhsNama", etNama.getText().toString());
            intent.putExtra("MhsAlamat", etAlamat.getText().toString());
            intent.putExtra("Mhstelepon", etTelp.getText().toString());
            setResult(Activity.RESULT_OK, intent);
            finish();

        });


    }





}
