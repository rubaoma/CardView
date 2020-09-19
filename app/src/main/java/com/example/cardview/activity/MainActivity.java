package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclePostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclePostagem = findViewById(R.id.recyclerPostagem);

        //Define Layout
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayout.HORIZONTAL);
//        layoutManager.setOrientation(LinearLayout.VERTICAL);
        RecyclerView.LayoutManager layoutManager= new GridLayoutManager(this,2);
        recyclePostagem.setLayoutManager(layoutManager);

        //define adapter
        this.prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter( postagens );
        recyclePostagem.setAdapter(adapter);
    }

    public void prepararPostagens(){

        Postagem p = new Postagem("Rubens Moura", "#tbt Viagem Legal", R.drawable.imagem1);
        this.postagens.add( p );
        p = new Postagem("Rubens Moura", "Inesquecivel", R.drawable.imagem2);
        this.postagens.add( p );
        p = new Postagem("Rubens Moura", "Vontade de voltar pra lá", R.drawable.imagem3);
        this.postagens.add( p );
        p = new Postagem("Rubens Moura", "Muito bom", R.drawable.imagem4);
        this.postagens.add( p );
    }
}