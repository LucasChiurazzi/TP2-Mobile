package com.mobile.vistas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final Double DOLAR_EURO= 0.91;
    public static final Double EURO_DOLAR= 1.10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
    }

    public void convertir(View view) {
        EditText dolares = findViewById(R.id.eTD);
        EditText euros = findViewById(R.id.eTE);
        String dol = dolares.getText().toString();
        String eu =euros.getText().toString();
        Checkable ead = findViewById(R.id.EaD);
        Checkable dae = findViewById(R.id.DaE);

        EditText result = findViewById(R.id.eTresultado);
        if (!dolares.getText().toString().isEmpty() || !euros.getText().toString().isEmpty()) {
            if (dae.isChecked()) {
                double d = Double.parseDouble(eu);
                String r = String.valueOf(d * DOLAR_EURO);

                result.setText(r);
            }else{
                double e = Double.parseDouble(dol);
                String r = String.valueOf(e * EURO_DOLAR);

                result.setText(r);
            }

        }
    }

}
