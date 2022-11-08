
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

        var samiaso = samiCifri.text.toString()
        var tele = telefoni.text.toString()


    dasruleba.setOnClickListener {

        val symbols = "0123456789"

        if(pirveliOri.length() != 2 || pirveliOri.text.any { it in symbols }) {

                pirveliOri.error = "შეიყვანეთ სწორი მონაცემები"
                return@setOnClickListener

        }

        if(TextUtils.isEmpty(samiaso) || Integer.parseInt(samiaso)>999){

                samiCifri.error = "შეიყვანეთ სწორი მონაცემები"
                return@setOnClickListener
        }

        if(bolo2.length() != 2 || pirveliOri.text.any { it in symbols }){

                bolo2.error = "შეიყვანეთ სწორი მონაცემები"
                return@setOnClickListener
        }

        if (piradi.length() != 11){

                piradi.error = "შეიყვანეთ სწორი პირადი ნომერი"
                return@setOnClickListener
        }

        if ( (tele.length != 9) || !(tele.startsWith("5")) ) {

                telefoni.error = "შეიყვანეთ სწორი ტელეფონის ნომერი"
                return@setOnClickListener
        }



        Toast.makeText (this, "მონაცემები წარმატებით გადაიგზავნა", Toast.LENGTH_LONG).show()


        }


    }

}