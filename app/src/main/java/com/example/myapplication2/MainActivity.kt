package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: UserAdapter
    lateinit var layoutManager: RecyclerView.LayoutManager
    var users = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Main", "oncreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        Log.i("Main", "onRestart")
        super.onResume()
        setupUserList()
    }

    private fun setupUserList() {
        Log.i("Main", "setupUserList")
        // TODO remove dummy data
        users.add(User(name = "User1"))
        users.add(User(name = "User2"))
        users.add(User(name = "User3"))
        users.add(User(name = "User4"))
        adapter = UserAdapter(this, users)
        rvUsers.adapter = adapter
        layoutManager = LinearLayoutManager(this)
        rvUsers.layoutManager = layoutManager
    }
}
