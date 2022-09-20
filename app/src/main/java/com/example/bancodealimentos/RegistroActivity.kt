package com.example.bancodealimentos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.bancodealimentos.databinding.ActivityRegistroBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RegistroActivity : AppCompatActivity() {

    lateinit var binding : ActivityRegistroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_registro)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_registro)
    }

    fun clickRegisterAuth(view: View?) {
        var emailStr = binding.editTextTextEmail.text.toString()
        var pwdStr = binding.editTextTextPassword2.text.toString()
        var authTask = Firebase.auth.createUserWithEmailAndPassword(emailStr, pwdStr)

        authTask.addOnCompleteListener(this){ resultado ->

            if(resultado.isSuccessful){

                Toast.makeText(this, "REGISTRO EXITOSO", Toast.LENGTH_SHORT).show()
            } else {

                Toast.makeText(this, "ERROR EN REGISTRO", Toast.LENGTH_SHORT).show()
                Log.wtf("FIREBASE-DEV", "error: ${resultado.exception}")
            }
        }
    }

    fun clickTextViewLogin(view: View?) {
        /*
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
         */
    }
}