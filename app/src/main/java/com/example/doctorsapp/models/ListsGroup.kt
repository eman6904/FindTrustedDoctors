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
        doctorsPosts.add(PostModel(R.drawable.dp1,"Ali Samer",
            R.drawable.menu_icon,"Hello every one",R.drawable.dp1,"10 : 11 PM"))
        doctorsPosts.add(PostModel(R.drawable.dp2,"Sona Salem",
            R.drawable.menu_icon,"Hello every one",R.drawable.dp2,"3 : 15 PM"))
    }
}