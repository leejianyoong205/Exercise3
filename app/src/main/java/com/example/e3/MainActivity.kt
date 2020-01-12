package com.example.e3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener {
            calculation()
        }
        buttonReset.setOnClickListener {
            result.text = ""
            radioButtonMale.isChecked = false
            radioButtonFemale.isChecked = false
            checkBoxSmoker.isChecked = false
        }
    }

    fun calculation() {
        val age = spinnerAge.selectedItemPosition.toString().toInt()


        if (age == 0) {
            val premium = 60
            result.setText("RM"+premium)
        }
        else if(age == 1){
            if(radioButtonMale.isChecked && checkBoxSmoker.isChecked){
                val premium =  70 + 50 + 100
                result.setText("RM"+premium)
            }else if(radioButtonMale.isChecked){
                val premium =  70 + 50
                result.setText("RM"+premium)
            }else if (radioButtonFemale.isChecked && checkBoxSmoker.isChecked){
                val premium =  70 + 100
                result.setText("RM"+premium)
            }else if (radioButtonFemale.isChecked){
                val premium =  70
                result.setText("RM"+premium)
            }
        }
        else if(age == 2){
            if(radioButtonMale.isChecked && checkBoxSmoker.isChecked){
                val premium =  90 + 100 + 150
                result.setText("RM"+premium)
            }else if(radioButtonMale.isChecked){
                val premium =  90 + 100
                result.setText("RM"+premium)
            }else if (radioButtonFemale.isChecked && checkBoxSmoker.isChecked){
                val premium =  90 + 150
                result.setText("RM"+premium)
            }else if (radioButtonFemale.isChecked){
                val premium =  90
                result.setText("RM"+premium)
            }
        }
        else if(age == 3){
            if(radioButtonMale.isChecked && checkBoxSmoker.isChecked){
                val premium =  120 + 150 + 200
                result.setText("RM"+premium)
            }else if(radioButtonMale.isChecked){
                val premium =  120 + 150
                result.setText("RM"+premium)
            }else if (radioButtonFemale.isChecked && checkBoxSmoker.isChecked){
                val premium =  120 + 200
                result.setText("RM"+premium)
            }else if (radioButtonFemale.isChecked){
                val premium =  120
                result.setText("RM"+premium)
            }
        }
        else if(age == 4){
            if(radioButtonMale.isChecked && checkBoxSmoker.isChecked){
                val premium =  150 + 200 + 250
                result.setText("RM"+premium)
            }else if(radioButtonMale.isChecked){
                val premium =  150 + 200
                result.setText("RM"+premium)
            }else if (radioButtonFemale.isChecked && checkBoxSmoker.isChecked){
                val premium =  150 + 250
                result.setText("RM"+premium)
            }else if (radioButtonFemale.isChecked){
                val premium =  150
                result.setText("RM"+premium)
            }
        }
        else if(age == 5){
            if(radioButtonMale.isChecked && checkBoxSmoker.isChecked){
                val premium =  150 + 200 + 300
                result.setText("RM"+premium)
            }else if(radioButtonMale.isChecked){
                val premium =  150 + 200
                result.setText("RM"+premium)
            }else if (radioButtonFemale.isChecked && checkBoxSmoker.isChecked){
                val premium =  150 + 300
                result.setText("RM"+premium)
            }else if (radioButtonFemale.isChecked){
                val premium =  150
                result.setText("RM"+premium)
            }
        }

    }

}


