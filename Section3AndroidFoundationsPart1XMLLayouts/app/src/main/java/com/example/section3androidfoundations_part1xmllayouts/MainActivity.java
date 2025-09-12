package com.example.section3androidfoundations_part1xmllayouts;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView erantzuna;
    private RadioButton radio_Hombre;
    private RadioButton radio_Mujer;
    private EditText editText_edad;
    private EditText editText_pies;
    private EditText editText_pulgadas;
    private EditText editText_peso;

    private Button button_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        elementuak_aurkitu();


    }

    private void elementuak_aurkitu(){
        erantzuna= findViewById(R.id.Text_View);

        radio_Hombre= findViewById(R.id.radio_button_Hombre);
        radio_Mujer= findViewById(R.id.radio_button_Mujer);

        editText_edad= findViewById(R.id.edit_text_Edad);
        editText_pies= findViewById(R.id.edit_text_Pies);
        editText_pulgadas= findViewById(R.id.edit_text_Pulgadas);
        editText_peso= findViewById(R.id.edit_text_Peso);

        button_calcular= findViewById(R.id.button_Calcular);
    }

    private void setButton_listener(){
        button_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo();
            }
        });
    }

    private void calculo(){
        int edad= Integer.parseInt(editText_edad.getText().toString());
        int pies= Integer.parseInt(editText_pies.getText().toString());
        int pulgadas= Integer.parseInt(editText_pulgadas.getText().toString());
        int peso= Integer.parseInt(editText_peso.getText().toString());

        int pulgadas_totales= (pies*12)+pulgadas;

        double altura_a_metros=pulgadas_totales*0.0254;

        double bmi= peso/ (altura_a_metros*pulgadas_totales);
    }
}