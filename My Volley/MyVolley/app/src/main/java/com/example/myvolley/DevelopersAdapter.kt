package com.example.myvolley

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.LinearLayout

import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class DevelopersAdapter(
    private val developerList: List<DevelopersList>,
    private val mContext: Context
) : RecyclerView.Adapter<DevelopersAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.developers_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentDeveloper = developerList[position]

        holder.login.text = currentDeveloper.login
        holder.html_url.text = currentDeveloper.html_url

        Picasso.with(mContext)
            .load(currentDeveloper.avatar_url)
            .into(holder.avatar_url)

        holder.linearLayout.setOnClickListener { v ->
            val developersList1 = developerList[position]
            val skipIntent = Intent(v.context, ProfileActivity::class.java)

            skipIntent.putExtra(KEY_NAME, developersList1.login)
            skipIntent.putExtra(KEY_URL, developersList1.html_url)
            skipIntent.putExtra(KEY_IMAGE, developersList1.avatar_url)

            v.context.startActivity(skipIntent)
        }
    }


    override fun getItemCount(): Int {
        return developerList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val login: TextView = itemView.findViewById(R.id.username)
        val avatar_url: ImageView = itemView.findViewById(R.id.imageView)
        val html_url: TextView = itemView.findViewById(R.id.html_url)
        val linearLayout: LinearLayout = itemView.findViewById(R.id.linearLayout)
    }


    companion object {
        // Keys for our intents
        const val KEY_NAME = "name"
        const val KEY_IMAGE = "image"
        const val KEY_URL = "url"
    }
}
