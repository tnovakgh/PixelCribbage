package com.novak.android.pixelcribbage

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    // create variable button images to allow for shading effect upon click
    lateinit var playButton: ImageView
    lateinit var dealFacesButton: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize 'button' images
        playButton = findViewById(R.id.play_button)
        dealFacesButton = findViewById(R.id.deal_faces_button)

        // set click listeners
        playButton.setOnClickListener{playGame()}
        dealFacesButton.setOnClickListener{dealFaces()}
    }

    private fun playGame(){
        playButton.setImageResource(R.drawable.play_button)

        // create intent to start new activity
        val intent = Intent(this, BirthdayMessage::class.java)
        startActivity(intent)
    }

    private fun dealFaces(){
        dealFacesButton.setImageResource(R.drawable.deal_faces_button)

        // create intent to start new activity
        val intent = Intent(this, FaceCards::class.java)
        startActivity(intent)
    }
}
