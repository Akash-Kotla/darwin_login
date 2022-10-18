package com.example.medium_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.medium_login.auth.SessionManager
import com.example.medium_login.databinding.ActivityLogOutBinding

class LogOutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLogOutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_log_out)

        binding.btnLogout.setOnClickListener{
            SessionManager.clearData(this)
            val intent =Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY)
            startActivity(intent)
        }



    }
}