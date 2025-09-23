package com.example.seccion6;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StarterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        ListView startersList = findViewById(R.id.listview_starter);

        Platos plato1= new Platos("Paella valenciana", "dashhufasbufya", 8.45);
        Platos plato2= new Platos("Tacos al pastor", "dashhufasbufya", 45);
        Platos plato3= new Platos("Sushi de salmón", "dashhufasbufya", 32);
        Platos plato4= new Platos("Ceviche peruano", "dashhufasbufya", 73);
        Platos plato5= new Platos("Lasaña boloñesa", "dashhufasbufya", 34.50);
        Platos plato6= new Platos("Ramen tonkotsu", "dashhufasbufya", 84.05);
        Platos plato7= new Platos("Pollo tikka masala", "dashhufasbufya", 26.45);
        Platos plato8= new Platos("Moussaka griega", "dashhufasbufya", 21);

        Platos[] platos_lista= {plato1, plato2, plato3, plato4, plato5, plato6, plato7, plato8};

        ArrayAdapter<Platos> adaptador_de_platos= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, platos_lista);

        startersList.setAdapter(adaptador_de_platos);
    }
}