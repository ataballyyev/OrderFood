package com.example.orderfood.presentation.splash

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.orderfood.databinding.ActivitySplashBinding
import com.example.orderfood.presentation.login.LoginActivity
import com.example.orderfood.presentation.main.MainActivity

class SplashActivity : AppCompatActivity() {

    private var _binding: ActivitySplashBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // SplashLayout does not show anything if user logged in
        navigateToMainOrLogin()

        // When user click GetStarted button then goto login screen
        binding.buttonGetStarted.setOnClickListener {
            navigateToMainOrLogin()
        }
    }

    private fun navigateToMainOrLogin() {
        val sharedPrefs = applicationContext.getSharedPreferences("SHARED_PREFERENCE", Context.MODE_PRIVATE)
        val isLogin = sharedPrefs.getBoolean("LOGIN", false)
        if (isLogin) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}