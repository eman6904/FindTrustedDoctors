package com.example.doctorsapp.models

data class DoctorModel(
    val profile_image:Int,
    val ratingBar:Int,
    val doctorName:String,
    val doctorSpecialist:String,
    val doctorExperience:String,
    var doctor_following:String,
    var availableTimeList:ArrayList<AppointmentDetails>,
    var beforeRememberList:ArrayList<AppointmentDetails>
    )
