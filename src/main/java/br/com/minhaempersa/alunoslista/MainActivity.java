package br.com.minhaempersa.alunoslista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener{
    List<String> no = new ArrayList<String>();
    ListView listView;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no.add("Joao");
        no.add("Maria");
        no.add("Jose");
        no.add("Emanuel");
        no.add("Joaquim");

        Button botao = findViewById(R.id.adicionarButton);
        botao.setOnClickListener(this);

        listView = (ListView) findViewById(R.id.alunosListView);
        adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1,no);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onClick(View v) {
        EditText editText1 = findViewById(R.id.paisEditText);
        String name = editText1.getText().toString();

        no.add(name);
        adapter.notifyDataSetChanged();

    }
}
