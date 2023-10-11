package com.example.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.boton.setOnClickListener{
            Toast.makeText(this,binding.email.text, Toast.LENGTH_LONG).show()
            Log.d("EMAIL: ", binding.email.text.toString())
        }




    }
}