package com.example.alejandro.recyclertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //declaracion de intancias globales
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SE crean los Registros
        List items = new ArrayList();

        items.add(new Algorithm(R.drawable.binary,"Busqueda Binaria", "Recomendado en: Con Listas ordenadas."));
        items.add(new Algorithm(R.drawable.bubble,"Burbuja", "Recomendado en: Uso no Recomendable."));
        items.add(new Algorithm(R.drawable.count, "Conteo", "Recomendado en: Cuando las entradas están restringidas en un rango."));
        items.add(new Algorithm(R.drawable.linear, "Busqueda Lineal", "Recomendado en: Con entradas pequeñas y no ordenadas."));
        items.add(new Algorithm(R.drawable.merge, "Combinación", "Recomendado en: Cuando se trabaja en paralelo."));
        items.add(new Algorithm(R.drawable.quick, "Rápido", "Recomendado en: Normalmente el más rápido."));
        items.add(new Algorithm(R.drawable.radix, "Base", "Recomendado en: Con enteros limitados, o cadenas de longitud fija"));
        items.add(new Algorithm(R.drawable.select, "Selección", "Recomendado en: No depende de la entrada, siempre tarda lo mismo."));

        //Obtención del Recycler
        recycler = (RecyclerView)findViewById(R.id.recycler);
        recycler.setHasFixedSize(true);

        //Se Utiliza el LinearLayoutManager
        layoutManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(layoutManager);

        //Se crea el adaptador
        adapter = new AlgorithmAdapter(items);
        recycler.setAdapter(adapter);
    }
}
