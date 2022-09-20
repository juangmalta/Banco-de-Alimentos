package com.example.bancodealimentos

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.bancodealimentos.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_login)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
    }

    fun clickTextViewRegister(view: View?) {
        /*
        // vamos a guardar perritos (obviamente)
        // la info se guarda por medio de hashmaps

        val perrito = hashMapOf(
            "nombre" to binding.nombrePerrito.text.toString(),
            "edad" to binding.edadPerrito.text.toString()
        )

        // 1er paso - obtener referencia a la colección
        val coleccion : CollectionReference =
            Firebase.firestore.collection("perritos")

        // 2do paso - solicitar guardar dato
        val taskAdd = coleccion.add(perrito)

        taskAdd.addOnSuccessListener { doc ->

            Toast.makeText(
                this,
                "id: ${doc.id}",
                Toast.LENGTH_SHORT
            ).show()

        }.addOnFailureListener{ error ->

            Toast.makeText(
                this,
                "ERROR AL GUARDAR REGISTRO",
                Toast.LENGTH_SHORT
            ).show()

            Log.e("FIRESTORE", "error: $error")
        }
        */
    }
}