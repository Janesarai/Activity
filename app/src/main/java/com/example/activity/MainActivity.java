package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.activity.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        Button btnCreate= findViewById(R.id.buttoncrear);

        binding.buttoncrear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String name= binding.nombre.getText().toString();
                String apellid= binding.apellido.getText().toString();
                String emai = binding.email.getText().toString();
                String clav= binding.clave.getText().toString();

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