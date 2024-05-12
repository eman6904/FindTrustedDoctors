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
        awareness.add(AwarenessModel(R.drawable.heart))
        awareness.add(AwarenessModel(R.drawable.bones))
        awareness.add(AwarenessModel(R.drawable.eye))
        awareness.add(AwarenessModel(R.drawable.fitness))
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

        val avaliableTimeList=ArrayList<AppointmentDetails>()
        avaliableTimeList.add(AppointmentDetails("02:00\nPM",true))
        avaliableTimeList.add(AppointmentDetails("03:00\nPM",true))
        avaliableTimeList.add(AppointmentDetails("04:00\nPM",true))
        avaliableTimeList.add(AppointmentDetails("09:30\nAM",true))
        avaliableTimeList.add(AppointmentDetails("010:30\nAM",true))
        avaliableTimeList.add(AppointmentDetails("11:00\nAM",true))
        val beforeRememberList=ArrayList<AppointmentDetails>()
        beforeRememberList.add(AppointmentDetails("30\nMns",true))
        beforeRememberList.add(AppointmentDetails("60\nMns",true))
        beforeRememberList.add(AppointmentDetails("120\nMns",true))
        beforeRememberList.add(AppointmentDetails("360\nMns",true))
        beforeRememberList.add(AppointmentDetails("40\nMns",true))
        beforeRememberList.add(AppointmentDetails("90\nMns",true))
        val servicesList=ArrayList<String>()
        servicesList.add("Patient care should be the first priority")
        servicesList.add("You can contact us at any time at the following number 01123456780")
        servicesList.add("patients can schedule follow-up appointments or \"recheck\" appointments with doctors\nto evaluate their response to treatment and monitor their health status")
        servicesList.add("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk")
        servicesList.add("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk")
        doctorsDetails.add(DoctorModel(R.drawable.dd1,4,"Dr.Amira Ali", "dentist","7 Years experience","follow"
            ,avaliableTimeList,beforeRememberList,servicesList,150))
        doctorsDetails.add(DoctorModel(R.drawable.dp1,3,"Dr.Ali Samir", "Cardiologist","5 Years experience","follow"
            ,avaliableTimeList,beforeRememberList,servicesList,200))
        doctorsDetails.add(DoctorModel(R.drawable.dp2,2,"Dr.Sona Salem", "Otolaryngology ","2 Years experience","follow"
            ,avaliableTimeList,beforeRememberList,servicesList,150))
        doctorsDetails.add(DoctorModel(R.drawable.dd1,3,"Dr.Amira Ali", "dentist","4 Years experience","follow",
            avaliableTimeList,beforeRememberList,servicesList,100))
        doctorsDetails.add(DoctorModel(R.drawable.dd1,4,"Dr.Amira Ali", "dentist","3 Years experience","follow"
            ,avaliableTimeList,beforeRememberList,servicesList,150))
        doctorsDetails.add(DoctorModel(R.drawable.dd1,3,"Dr.Amira Ali", "dentist","3 Years experience","follow"
            ,avaliableTimeList,beforeRememberList,servicesList,150))
    }
}