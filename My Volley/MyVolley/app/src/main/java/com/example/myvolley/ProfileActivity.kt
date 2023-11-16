package com.example.myvolley

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso


class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Initialize the views using the IDs you set in activity_profile.xml
        val profileImageView = findViewById<ImageView>(R.id.profileImageView)
        val userNameTextView = findViewById<TextView>(R.id.usernameTextView)
        val shareProfile = findViewById<ImageButton>(R.id.shareProfile)
        val developerUrl = findViewById<TextView>(R.id.developerUrl)
        val intent = intent
        val userName = intent.getStringExtra(DevelopersAdapter.KEY_NAME)
        val image = intent.getStringExtra(DevelopersAdapter.KEY_IMAGE)
        val profileUrl = intent.getStringExtra(DevelopersAdapter.KEY_URL) //Setting the views

        Picasso.with(this)
            .load(image)
            .into(profileImageView)
        userNameTextView.text = userName
        developerUrl.text = profileUrl
        developerUrl.setOnClickListener {
            val url = profileUrl!!
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)

        }
        //set onclickLister to the image button shareProfile and implement implicit intent for  sharing developers profile
        //set onclickLister to the image button shareProfile and implement implicit intent for  sharing developers profile
        shareProfile.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(
                Intent.EXTRA_TEXT, "Check out this awesome developer " + userName +
                        ", " + profileUrl
            )
            val chooser = Intent.createChooser(shareIntent, "Share via")
            if (shareIntent.resolveActivity(packageManager) != null) {
                startActivity(chooser)
            }
        }


    }

}
