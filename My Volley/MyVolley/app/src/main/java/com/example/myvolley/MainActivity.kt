package com.example.myvolley

import android.app.ProgressDialog
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private val URL_DATA: String =
        "https://api.github.com/search/users?q=language:java+location:nairobi"
    private var myAdapter: DevelopersAdapter? = null
    private var developerList: MutableList<DevelopersList> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        developerList = ArrayList()
        loadUrlData()
    }

    private fun loadUrlData() {
        val progressDialog = ProgressDialog(this)
        progressDialog.setMessage("Loading....")
        progressDialog.show()
        val stringRequest = StringRequest(Request.Method.GET, URL_DATA,
            Response.Listener<String> { response ->
                Log.w("res", "Response:" + response)
                progressDialog.dismiss()
                try {
                    val jsonObject = JSONObject(response)
                    val array = jsonObject.getJSONArray("items")
                    for (i in 0 until array.length()) {
                        val jo = array.getJSONObject(i)
                        val developers = DevelopersList(
                            jo.getString("login"),
                            jo.getString("html_url"),
                            jo.getString("avatar_url")
                        )
                        developerList?.add(developers)
                        Log.d("res", "developers$developers")
                    }
                    myAdapter = DevelopersAdapter(developerList, applicationContext)
                    recyclerView.adapter = myAdapter
                } catch (e: JSONException) {
                    e.printStackTrace()
                }
                Log.d("Tag", response)
            },
            Response.ErrorListener { error ->
                Toast.makeText(this, "Error" + error.toString(), Toast.LENGTH_SHORT).show()
            })
        val requestQueue = Volley.newRequestQueue(this)
        requestQueue.add(stringRequest)
    }
}
