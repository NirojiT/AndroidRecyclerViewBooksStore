package com.example.recyclerview

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
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
    lateinit var description : Array<String>

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

        description = arrayOf(
            getString(R.string.book_a),
            getString(R.string.book_b),
            getString(R.string.book_c),
            getString(R.string.book_d),
            getString(R.string.book_e)

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

        var adapter = MyAdapter(newArrayList)
        newRecyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener{
            @SuppressLint("SuspiciousIndentation")
            override fun onItemClick(Position: Int) {

               // Toast.makeText(this@MainActivity,"You clicked on item num.$Position ",Toast.LENGTH_SHORT).show()

                val intent = Intent(this@MainActivity,BookDetailedActivity::class.java)
                    intent.putExtra("Book Title",newArrayList[Position].bookTitle)
                    intent.putExtra("Book ImageID",newArrayList[Position].titleImage)
                intent.putExtra("Book Author",newArrayList[Position].bookAuthor)
                intent.putExtra("Book Description",description[Position])
                startActivity(intent)
            }


        })
    }

}