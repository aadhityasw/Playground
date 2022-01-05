package com.example.transport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements PersonAdapter.ItemClicked{

    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<Person> people;
    Button btnAdd;
    EditText etName, etSurname, etPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);

        etName = findViewById(R.id.etName);
        etSurname = findViewById(R.id.etSurname);
        etPreference = findViewById(R.id.etPreference);

        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name_person, surname_person, pref_person;
                name_person =  etName.getText().toString();
                surname_person = etSurname.getText().toString();
                pref_person = etPreference.getText().toString();

                people.add(new Person(name_person, surname_person, pref_person));
                myAdapter.notifyDataSetChanged();
            }
        });

        //layoutManager = new LinearLayoutManager(this);
        layoutManager = new GridLayoutManager(this, 2 , GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        people = new ArrayList<Person>();
        people.add(new Person("John", "Wick", "bus"));
        people.add(new Person("Jason", "Bourne", "car"));
        people.add(new Person("Jack", "Barnes", "flight"));
        people.add(new Person("Ethan", "Hunt", "train"));
        people.add(new Person("Steve", "Rodgers", "bus"));
        people.add(new Person("Tony", "Stark", "flight"));
        people.add(new Person("Bucky", "Barnes", "train"));
        people.add(new Person("James", "Bond", "car"));
        people.add(new Person("Stephen", "Strange", "flight"));
        people.add(new Person("John", "Rambo", "train"));

        myAdapter = new PersonAdapter(this, people);

        recyclerView.setAdapter(myAdapter);
    }

    @Override
    public void onItemClicked(int index) {

        Toast.makeText(this, "Preference :- "+ people.get(index).getPreference(), Toast.LENGTH_SHORT).show();
    }
}
