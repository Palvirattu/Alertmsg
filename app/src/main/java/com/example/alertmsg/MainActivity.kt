package com.example.alertmsg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    private lateinit var tvZero: TextView
    private lateinit var showAlert : Button
    var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvZero = findViewById(R.id.tvZero)
        showAlert = findViewById(R.id.showAlert)
        tvZero.setText(num.toString())
        showAlert.setOnClickListener {
            AlertDialog.Builder(this).setTitle("Class performence")
                .setMessage("Click here....")
                .setPositiveButton("yes"){_, _ ->
                    num=num+2
                    tvZero.setText(num.toString())
                    Toast.makeText(this,"Add a  number",Toast.LENGTH_LONG).show())
                }
                .setNegativeButton("No"){_ , _ ->
                    num=num-2
                    tvZero.setText(num.toString())
                    Toast.makeText(this,"Sub a number" ,Toast.LENGTH_LONG).show())

                }
                .setNeutralButton("Close"){_ , _ ->
                    num=0
                    tvZero.setText(num.toString())
                    Toast.makeText(this, "Close" , Toast.LENGTH_LONG).show())
                }
                .show()
        }



    }
}