package com.example.doctorsapp.models

import com.example.doctorsapp.R

class ListsGroup {

    val doctorsLive=ArrayList<LiveModel>()
    val doctorsDetails=ArrayList<DoctorModel>()
    val doctorsPosts=ArrayList<PostModel>()
    val awareness=ArrayList<AwarenessModel>()

    fun setDoctorsLive(){
        doctorsLive.add(LiveModel(R.drawable.d1,R.drawable.play_icon,R.drawable.live_icon2))
        doctorsLive.add(LiveModel(R.drawable.d2,R.drawable.play_icon,R.drawable.live_icon2))
        doctorsLive.add(LiveModel(R.drawable.d3,R.drawable.play_icon,R.drawable.live_icon2))
        doctorsLive.add(LiveModel(R.drawable.d5,R.drawable.play_icon,R.drawable.live_icon2))
    }
    fun setAwareness(){
        awareness.add(AwarenessModel(R.drawable.teeth))
        awareness.add(AwarenessModel(R.drawable.teeth))
        awareness.add(AwarenessModel(R.drawable.teeth))
        awareness.add(AwarenessModel(R.drawable.teeth))
        awareness.add(AwarenessModel(R.drawable.teeth))
        awareness.add(AwarenessModel(R.drawable.teeth))
        awareness.add(AwarenessModel(R.drawable.teeth))
        awareness.add(AwarenessModel(R.drawable.teeth))
    }
    fun setPosts(){
        doctorsPosts.add(PostModel(R.drawable.dd1,"Amira Ahmed",
            R.drawable.menu_icon,"Hello every one",R.drawable.dd1,"12 : 30 PM"))
        doctorsPosts.add(PostModel(R.drawable.dp1,"Ali Samir",
            R.drawable.menu_icon,"Hello every one",R.drawable.dp1,"10 : 11 PM"))
        doctorsPosts.add(PostModel(R.drawable.dp2,"Sona Salem",
            R.drawable.menu_icon,"Hello every one",R.drawable.dp2,"3 : 15 PM"))
    }
    fun setDoctorDetails(){

        val arr1=ArrayList<AppointmentDetails>()
        arr1.add(AppointmentDetails("02:00\nPM",true))
        arr1.add(AppointmentDetails("03:00\nPM",true))
        arr1.add(AppointmentDetails("04:00\nPM",true))
        arr1.add(AppointmentDetails("09:30\nAM",true))
        arr1.add(AppointmentDetails("010:30\nAM",true))
        arr1.add(AppointmentDetails("11:00\nAM",true))
        val arr2=ArrayList<AppointmentDetails>()
        arr2.add(AppointmentDetails("30\nMns",true))
        arr2.add(AppointmentDetails("60\nMns",true))
        arr2.add(AppointmentDetails("120\nMns",true))
        arr2.add(AppointmentDetails("360\nMns",true))
        arr2.add(AppointmentDetails("40\nMns",true))
        arr2.add(AppointmentDetails("90\nMns",true))
        doctorsDetails.add(DoctorModel(R.drawable.dd1,4,"Dr.Amira Ali", "dentist","7 Years experience","follow",arr1,arr2))
        doctorsDetails.add(DoctorModel(R.drawable.dp1,3,"Dr.Ali Samir", "Cardiologist","5 Years experience","follow",arr1,arr2))
        doctorsDetails.add(DoctorModel(R.drawable.dp2,2,"Dr.Sona Salem", "Otolaryngology ","2 Years experience","follow",arr1,arr2))
        doctorsDetails.add(DoctorModel(R.drawable.dd1,3,"Dr.Amira Ali", "dentist","4 Years experience","follow",arr1,arr2))
        doctorsDetails.add(DoctorModel(R.drawable.dd1,4,"Dr.Amira Ali", "dentist","3 Years experience","follow",arr1,arr2))
        doctorsDetails.add(DoctorModel(R.drawable.dd1,3,"Dr.Amira Ali", "dentist","3 Years experience","follow",arr1,arr2))
    }
}