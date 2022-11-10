
package com.example.manqana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.core.text.isDigitsOnly


class MainActivity : AppCompatActivity() {

    private lateinit var pirveliOri: EditText
    private lateinit var samiCifri: EditText
    private lateinit var bolo2: EditText
    private lateinit var piradi: EditText
    private lateinit var telefoni: EditText
    private lateinit var dasruleba: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar:  ActionBar? = supportActionBar
        actionBar?.hide()

        pirveliOri = findViewById(R.id.pirveliori)
        samiCifri = findViewById(R.id.samicifri)
        bolo2 = findViewById(R.id.bolo2)
        piradi = findViewById(R.id.id)
        telefoni = findViewById(R.id.phone)
        dasruleba = findViewById(R.id.finish)



    dasruleba.setOnClickListener {



        if(pirveliOri.length() != 2 || !pirveliOri.text.any {it.isLetter()}) {

                pirveliOri.error = "შეიყვანეთ სწორი მონაცემები"

        }

          else if(samiCifri.text.toString().length !=3 || !samiCifri.text.toString().isDigitsOnly() ){

                samiCifri.error = "შეიყვანეთ სწორი მონაცემები"

          }

          else if(bolo2.length() != 2 || !bolo2.text.any{ it.isLetter()}){

                bolo2.error = "შეიყვანეთ სწორი მონაცემები"

          }

          else if (piradi.length() != 11 || !piradi.text.toString().isDigitsOnly()){

                piradi.error = "შეიყვანეთ სწორი პირადი ნომერი"
          }

          else if ((telefoni.text.toString().length != 9) || !(telefoni.text.toString().startsWith("5")) ) {

                telefoni.error = "შეიყვანეთ სწორი ტელეფონის ნომერი"
          }



          else {
              Toast.makeText (this, "მონაცემები წარმატებით გადაიგზავნა", Toast.LENGTH_LONG).show()
          }


        }


    }

}