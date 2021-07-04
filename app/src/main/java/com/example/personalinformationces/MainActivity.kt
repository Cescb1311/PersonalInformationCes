package com.example.personalinformationces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mostrar.setOnClickListener { mostrarDatos() }
        reset.setOnClickListener { borrarDatos() }
    }
    fun mostrarDatos(){
        val campoNombre=nombre.text.toString()
        val campoApellido=apellido.text.toString()
        val campoNumero=numero.text.toString()
        if (campoNombre.isEmpty() || campoApellido.isEmpty() || campoNumero.isEmpty()){
            Toast.makeText(this,"Ingrese todos los campos",Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this,"El número de $campoNombre $campoApellido es $campoNumero",Toast.LENGTH_LONG).show()
        }
    }
    fun borrarDatos(){
        nombre.text.clear()
        apellido.text.clear()
        numero.text.clear()
    }
}