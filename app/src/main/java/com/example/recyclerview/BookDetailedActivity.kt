package com.example.recyclerview

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.imageview.ShapeableImageView

class BookDetailedActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_book_detailed)

        val bookCover : ShapeableImageView = findViewById(R.id.title_imageD)
        val bookTitle : TextView = findViewById(R.id.tvTitleD)
        val bookAuthor : TextView = findViewById(R.id.tvAuthorD)
        val bookDescript : TextView = findViewById(R.id.tvDescriptionD)

        val bundle: Bundle? = intent.extras
        //get the data
        val selTitle = bundle!!.getString("Book Title")
        val selImageId = bundle.getInt("Book ImageID")
        val selAuthor = bundle.getString("Book Author")
        val selDescription = bundle.getString("Book Description")

        //set the data to our view elements
        bookCover.setImageResource(selImageId)
        bookTitle.text = selTitle
        bookAuthor.text = selAuthor
        bookDescript.text = selDescription




    }
}