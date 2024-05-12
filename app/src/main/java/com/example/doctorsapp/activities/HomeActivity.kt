package com.example.doctorsapp.activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import android.widget.SearchView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorsapp.R
import com.example.doctorsapp.models.AwarenessAdapter
import com.example.doctorsapp.models.ListsGroup
import com.example.doctorsapp.models.LiveAdapter
import com.example.doctorsapp.models.PostAdapter

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val title=findViewById<TextView>(R.id.title)

        //val search_view=findViewById<SearchView>(R.id.searchView)
        val recycler1=findViewById<RecyclerView>(R.id.recycler1)
        val recycler2=findViewById<RecyclerView>(R.id.recycler2)
        val recycler3=findViewById<RecyclerView>(R.id.recycler3)

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
        //////////////////////////////////////////////////////////////////////////
        val listsGroup=ListsGroup()
        listsGroup.setDoctorsLive()
        val adapter = LiveAdapter(listsGroup.doctorsLive)
        recycler1.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        recycler1.adapter = adapter
        //////////////////////////////////////////////////////////////////////////
        listsGroup.setAwareness()
        val adapter2 = AwarenessAdapter(listsGroup.awareness)
        recycler2.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        recycler2.adapter = adapter2
        /////////////////////////////////////////////////////////////////////////
        listsGroup.setPosts()
        val adapter3 = PostAdapter(listsGroup.doctorsPosts)
        recycler3.layoutManager = LinearLayoutManager(this)
        recycler3.adapter = adapter3
        ///////////////////////////////////////////////////////////////////////
        title.setOnClickListener(){
            val intent=Intent(this,FindDoctorsActivity::class.java)
            startActivity(intent)
        }
    }
}