package com.omar.kotlinproject1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.util.*

class MainActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        txtView1.text = "Kotlin: Bienvenue !!\nBonjour tout le monde"
        /*
        btnGetAge.setOnClickListener {
        }
        */
    }//fin onCreate()

    fun btnGetAgeClicked(view: View){
        var msg:String?
        try {
            var yearOfBirth = editTextAge.text.toString().toInt()
            var currentYear = Calendar.getInstance().get(Calendar.YEAR)
            if (yearOfBirth > currentYear){
                msg = "Veuillez entrer une année de naissance valide !!"
            }else{
                msg = "Vous avez " + (currentYear - yearOfBirth).toString() + " ans"
            }
        }catch (e: Exception){
            Log.e("Erreur date naissance", e.message)
            msg = "Entrez l'année de naissance dans la zone en haut !!"
        }
        textView.text = msg
    }

}//fin classe