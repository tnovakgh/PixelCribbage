package com.novak.android.pixelcribbage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class FaceCards : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_face_cards)

        val kingDiamondsButton: ImageView = findViewById(R.id.king_diamonds)
        val kingSpadesButton: ImageView = findViewById(R.id.king_spades)
        val kingHeartsButton: ImageView = findViewById(R.id.king_hearts)
        val kingClubsButton: ImageView = findViewById(R.id.king_clubs)
        kingDiamondsButton.setOnClickListener{kingDiamonds()}
        kingSpadesButton.setOnClickListener{kingSpades()}
        kingHeartsButton.setOnClickListener{kingHearts()}
        kingClubsButton.setOnClickListener{kingClubs()}

        val queenDiamondsButton: ImageView = findViewById(R.id.queen_diamonds)
        val queenSpadesButton: ImageView = findViewById(R.id.queen_spades)
        val queenHeartsButton: ImageView = findViewById(R.id.queen_hearts)
        val queenClubsButton: ImageView = findViewById(R.id.queen_clubs)
        queenDiamondsButton.setOnClickListener{queenDiamonds()}
        queenSpadesButton.setOnClickListener{queenSpades()}
        queenHeartsButton.setOnClickListener{queenHearts()}
        queenClubsButton.setOnClickListener{queenClubs()}

        val jackDiamondsButton: ImageView = findViewById(R.id.jack_diamonds)
        val jackSpadesButton: ImageView = findViewById(R.id.jack_spades)
        val jackHeartsButton: ImageView = findViewById(R.id.jack_hearts)
        val jackClubsButton: ImageView = findViewById(R.id.jack_clubs)
        jackDiamondsButton.setOnClickListener{jackDiamonds()}
        jackSpadesButton.setOnClickListener{jackSpades()}
        jackHeartsButton.setOnClickListener{jackHearts()}
        jackClubsButton.setOnClickListener{jackClubs()}
    }

    private fun kingDiamonds(){
        // create intent to start new activity
        val intent = Intent(this, KingDiamonds::class.java)
        startActivity(intent)
    }
    private fun kingSpades(){
        // create intent to start new activity
        val intent = Intent(this, KingSpades::class.java)
        startActivity(intent)
    }
    private fun kingHearts(){
        // create intent to start new activity
        val intent = Intent(this, KingHearts::class.java)
        startActivity(intent)
    }
    private fun kingClubs() {
        // create intent to start new activity
        val intent = Intent(this, KingClubs::class.java)
        startActivity(intent)
    }

    private fun queenDiamonds() {
        // create intent to start new activity
        val intent = Intent(this, QueenDiamonds::class.java)
        startActivity(intent)
    }
    private fun queenSpades(){
        // create intent to start new activity
        val intent = Intent(this, QueenSpades::class.java)
        startActivity(intent)
    }
    private fun queenHearts(){
        // create intent to start new activity
        val intent = Intent(this, QueenHearts::class.java)
        startActivity(intent)
    }
    private fun queenClubs(){
        // create intent to start new activity
        val intent = Intent(this, QueenClubs::class.java)
        startActivity(intent)
    }

    private fun jackDiamonds() {
        // create intent to start new activity
        val intent = Intent(this, JackDiamonds::class.java)
        startActivity(intent)
    }
    private fun jackSpades() {
        // create intent to start new activity
        val intent = Intent(this, JackSpades::class.java)
        startActivity(intent)
    }
    private fun jackHearts() {
        // create intent to start new activity
        val intent = Intent(this, JackHearts::class.java)
        startActivity(intent)
    }
    private fun jackClubs() {
        // create intent to start new activity
        val intent = Intent(this, JackClubs::class.java)
        startActivity(intent)
    }
}
