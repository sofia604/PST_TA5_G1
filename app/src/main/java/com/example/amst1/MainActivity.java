package com.example.amst1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etUser,etPass;
    private String user;
    private String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUser=(EditText)findViewById(R.id.etUser);
        etPass=(EditText)findViewById(R.id.etPass);
        user="hola";
        password="hola";
    }

    public void Registrar(View v){
        user=etUser.getText().toString();
        password=etPass.getText().toString();
        etUser.setText("");
        etPass.setText("");
        Toast.makeText(this, "Usuario Registrado",
                Toast.LENGTH_SHORT).show();

    }


    public void Iniciar(View v){
        String usuario=etUser.getText().toString();
        String clave = etPass.getText().toString();

        if(user.equals(usuario)&&password.equals(clave)){
            Intent intent = new Intent(MainActivity.this, Presentacion.class);
            startActivity(intent);

        }else{
            Toast.makeText(this, "No existe el usuario ingresado",
                    Toast.LENGTH_SHORT).show();

        }
    }


}
