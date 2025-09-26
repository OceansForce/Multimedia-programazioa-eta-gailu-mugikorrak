package com.example.seccion6;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actibity_main_courses);

        ListView mainListaCursos = findViewById(R.id.list_view_main_courses);

        Platos[] mainCursos = {
                new Platos("Paella valenciana", "dashhufasbufya", 8.45),
                new Platos("Tacos al pastor", "dashhufasbufya", 45),
                new Platos("Sushi de salmón", "dashhufasbufya", 32),
                new Platos("Ceviche peruano", "dashhufasbufya", 73),
                new Platos("Lasaña boloñesa", "dashhufasbufya", 34.50),
                new Platos("Ramen tonkotsu", "dashhufasbufya", 84.05),
                new Platos("Pollo tikka masala", "dashhufasbufya", 26.45),
                new Platos("Moussaka griega", "dashhufasbufya", 21)
        };

        ArrayAdapter<Platos> adaptador_de_platos= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCursos);

        mainListaCursos.setAdapter(adaptador_de_platos);
    }
}
