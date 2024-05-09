package com.example.doctorsapp.activities

import android.app.DatePickerDialog
import android.content.Intent
import android.graphics.Paint
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.doctorsapp.R
import com.hbb20.CountryCodePicker
import java.util.*


class PatientSignUpActivity : AppCompatActivity() {

    val gender = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_sign_up)


        val codePicker = findViewById<CountryCodePicker>(R.id.country_code)
        val genderSpinner=findViewById<Spinner>(R.id.genderSpinner)
        val dateEdt = findViewById<EditText>(R.id.idEdtDate)
        val title = findViewById<TextView>(R.id.title)
        val signUp_btn=findViewById<CardView>(R.id.sign_up)

        // to hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar()!!.hide()
        }
       //to change status bar color
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.light_blue)
        }

        //to set underline with text
        title.paintFlags = Paint.UNDERLINE_TEXT_FLAG

        signUp_btn.setOnClickListener(){

            val intent= Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
        // Getting the country code
        val countryCode = codePicker.selectedCountryCode

        // Getting the country name
        val countryName = codePicker.selectedCountryName

        // Getting the country name code
        val countryNameCode = codePicker.selectedCountryNameCode

        // Toast to show information based on the selection
//        Toast.makeText(
//            this,
//            "Country Name: $countryName Country Name Code: $countryNameCode Country Code: $countryCode",
//            Toast.LENGTH_SHORT
//        ).show()
       ///////////////////////////////////////////////////////////////////////////////

        gender.add("Male")
        gender.add("Female")

    //    genderSpinner.onItemSelectedListener = this

        val adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_item,
            gender
        )
        adapter.setDropDownViewResource(
            android.R.layout.simple_spinner_dropdown_item
        )
        genderSpinner.adapter = adapter
        ///////////////////////////////////////////////////////////////////////////

        //for birthday date
        dateEdt.setOnClickListener {

            // Get the instance of Calendar
            val c = Calendar.getInstance()

            // Get the current year, month, and day
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            // Create a DatePickerDialog
            val datePickerDialog = DatePickerDialog(
                this,
                { view, selectedYear, selectedMonth, selectedDayOfMonth ->
                    // Format the selected date and set it as the text of the EditText
                    val selectedDate = "$selectedDayOfMonth-${selectedMonth + 1}-$selectedYear"
                    dateEdt.setText(selectedDate)
                },
                // Pass the current year, month, and day to the DatePickerDialog
                year,
                month,
                day
            )

            // Show the DatePickerDialog

            datePickerDialog.show()
        }
        ////////////////////////////////////////////////////////////////////////////////////////////

    }

}
