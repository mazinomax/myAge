package com.example.myage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var calendar = Calendar.getInstance();
    var currentYear = calendar.get(Calendar.YEAR)
    var year:Int = currentYear

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        calcAge.setOnClickListener {

            val currentYear = enteryearID.text
            var newAge = year - currentYear.toString().toInt()

            resultId.text = "Your Age is: " + newAge.toString()

        }



    }

//    fun onSubmit(view:View){
//       // var enterDOB = enteryearID.text
//        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
//        resultId.text = " MY AGE Is :" + ( currentYear - enteryearID.text.toString().toInt())
//
//    }
}