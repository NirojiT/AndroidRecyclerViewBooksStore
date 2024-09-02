package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView : RecyclerView
    private lateinit var newArrayList: ArrayList<Book>
    lateinit var imageId : Array<Int>
    lateinit var title : Array<String>
    lateinit var author : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
            R.drawable.k,
            R.drawable.l,
            R.drawable.m,
            R.drawable.n,
            R.drawable.o,
            R.drawable.p,
            R.drawable.q,
            R.drawable.r,
            R.drawable.s,
            R.drawable.t
        )
        title = arrayOf(
            "SE",
            "OS",
            "DBMS",
            "MAD",
            "SPM",
            "IWT",
            "DS",
            "SE",
            "OS",
            "DBMS",
            "MAD",
            "SPM",
            "IWT",
            "DS",
            "SE",
            "OS",
            "DBMS",
            "MAD",
            "SPM",
            "IWT"
        )
        author = arrayOf(
            "SE",
            "OS",
            "DBMS",
            "MAD",
            "SPM",
            "IWT",
            "DS",
            "SE",
            "OS",
            "DBMS",
            "MAD",
            "SPM",
            "IWT",
            "DS",
            "SE",
            "OS",
            "DBMS",
            "MAD",
            "SPM",
            "IWT"
        )
         newRecyclerView = findViewById(R.id.myrecyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Book>()
        getUserData()

    }

    private fun getUserData() {

        for(i in imageId.indices){

            val books = Book(imageId[i],title[i],author[i])
            newArrayList.add(books)
        }
        newRecyclerView.adapter = MyAdapter(newArrayList)
    }

}