package com.example.section5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText textua_idatzi;
    Button boton_calcular;
    TextView textua_erakutxi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        elementuak_aurkitu();
        boton_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textua= textua_idatzi.getText().toString();
                if (textua.isEmpty()){
                    Toast.makeText(MainActivity.this, "Idatzi balore bat", Toast.LENGTH_SHORT).show();
                }else {
                    double kalkuloa= Integer.parseInt(textua) * 0.0254;
                    DecimalFormat nere_formatua= new DecimalFormat("0.00");
                    String erantzuna_string= nere_formatua.format(kalkuloa);
                    textua_erakutxi.setText(erantzuna_string+" Metro");
                }
            }
        });
    }

    private void elementuak_aurkitu(){
        textua_idatzi= findViewById(R.id.edit_Text);
        boton_calcular= findViewById(R.id.button);
        textua_erakutxi= findViewById(R.id.text_view);
    }
}