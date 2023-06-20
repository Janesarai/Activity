package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nombre;
        EditText apellido;
        EditText email;
        EditText clave;


        nombre= findViewById(R.id.nombre);
        apellido= findViewById(R.id.apellido);
        email= findViewById(R.id.email);
        clave= findViewById(R.id.clave);

        Button btnCreate= findViewById(R.id.buttoncrear);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name= nombre.getText().toString();
                String apellid= apellido.getText().toString();
                String emai = email.getText().toString();
                String clav= clave.getText().toString();

                if (name.isEmpty() || apellid.isEmpty() || emai.isEmpty() || clav.isEmpty() || !emai.contains("@")){
                    Toast.makeText(getBaseContext(), "Faltan campos por completar", Toast.LENGTH_SHORT).show();
                    return;
                }

                String texto= "Usuario" + name + " " + apellid + " " + "Email" + emai + "Contraseña"+ clav;

                Toast.makeText(getBaseContext(), texto, Toast.LENGTH_LONG).show();
            }
        });



    }
}