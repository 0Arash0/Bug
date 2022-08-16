package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.intent.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = binding.edt.text.toString()

        button.setOnClickListener {

            intent = Intent(applicationContext,SecondActivity::class.java)
            //intent.putExtra("Name",binding.edt.text.toString())

            Toast.makeText(applicationContext,name,Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
    }
}