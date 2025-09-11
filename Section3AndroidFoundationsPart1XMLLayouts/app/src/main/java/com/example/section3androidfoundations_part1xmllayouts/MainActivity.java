package com.example.section3androidfoundations_part1xmllayouts;

import android.os.Bundle;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView erantzuna= findViewById(R.id.Text_View);

        RadioButton radio_Hombre= findViewById(R.id.radio_button_Hombre);
        RadioButton radio_Mujer= findViewById(R.id.radio_button_Mujer);

        EditText editText_edad= findViewById(R.id.edit_text_Edad);
        EditText editText_pies= findViewById(R.id.edit_text_Pies);
        EditText editText_pulgadas= findViewById(R.id.edit_text_Pulgadas);
        EditText editText_peso= findViewById(R.id.edit_text_Peso);

        Button button_calcular= findViewById(R.id.button_Calcular);
    }
}