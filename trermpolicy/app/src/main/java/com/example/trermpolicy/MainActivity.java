package com.example.trermpolicy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    //Data-Data yang Akan dimasukan Pada ListView
    private String[] mahasiswa = {"Syarat dan Ketentuan","PRIVACY POLICE"};

    //ArrayList digunakan Untuk menampung Data mahasiswa
    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listitem);
        data = new ArrayList<>();
        getData();
        //ArrayAdapter digunakan untuk mengatur, bagaimana item pada ListView akan tampil
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, R.layout.support_simple_spinner_dropdown_item, data);
        listView.setAdapter(adapter);

        //Menambahan Listener, untuk menangani kejadian saat salah satu item listView di klik
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Mendapatkan Nama pada salah satu item yang diklik, berdasarkan posisinya
                String getName = data.get(position);

                //Berpindah Activity dan Mempassing data Nama pada Activity Selanjutnya
                Intent sendData = new Intent(MainActivity.this, data.class);
                sendData.putExtra("MyName", getName);
                startActivity(sendData);
            }
        });
    }

    private void getData(){
        //Memasukan Semua Data mahasiswa kedalam ArrayList
        Collections.addAll(data, mahasiswa);
    }
}