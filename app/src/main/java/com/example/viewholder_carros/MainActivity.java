package com.example.viewholder_carros;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        List<Item> datos = new ArrayList<>();

               datos.add( new Item("Ford", R.drawable.img));
               datos.add(new Item("Mercedes Benz", R.drawable.img));
               datos.add(new Item("Toyota", R.drawable.img));

               adaptador = new Adaptador(datos,this);
               recycler.setAdapter(adaptador);

    }
}