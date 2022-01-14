package com.beatriz.oliveiraviagens.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.beatriz.oliveiraviagens.R;
import com.beatriz.oliveiraviagens.dao.PacoteDAO;
import com.beatriz.oliveiraviagens.model.Pacote;
import com.beatriz.oliveiraviagens.ui.adapter.ListaPacotesAdapter;

import java.util.List;

public class ListaPacoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacote);

        ListView listaPacotes = findViewById(R.id.lista_pacotes_listview);

        List<Pacote> pacotes = new PacoteDAO().lista();

        listaPacotes.setAdapter(new ListaPacotesAdapter(pacotes, this));
    }
}