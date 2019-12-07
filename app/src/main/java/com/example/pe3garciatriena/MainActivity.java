package com.example.pe3garciatriena;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {
    EditText etCompany, etCountry, etIndustry, etCeo;
    FirebaseDatabase db;
    DatabaseReference refcom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etCompany = findViewById(R.id.editText);
        etCountry = findViewById(R.id.editText2);
        etIndustry = findViewById(R.id.editText3);
        etCeo = findViewById(R.id.editText4);
        db = FirebaseDatabase.getInstance();
        refcom = db.getReference("companies");
        refcom.setValue("Hello");

    }

    protected void onStart() {
        super.onStart();
        refcom.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        }); {

        }
    }

    public void addRecord(View V){
        String id = etCompany.getText().toString();
        String fname = etCountry.getText().toString();
        String lname = etIndustry.getText().toString();
        String section = etCeo.getText().toString();
        refcom.push();
        Toast.makeText(this, "saved firebase", LENGTH_LONG).show();
    }

    public void next(View v) {
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }
}
