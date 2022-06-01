package com.example.orderfood.presentation.login

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.orderfood.OrderFoodApp
import com.example.orderfood.R
import com.example.orderfood.databinding.ActivityLoginBinding
import com.example.orderfood.presentation.main.MainActivity
import com.example.orderfood.presentation.signup.SignupActivity
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {

    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            if (binding.tietEmail.editableText.toString().isEmpty()
                || binding.tietPassword.editableText.toString().isEmpty()
                || binding.tietConfirmPassword.editableText.toString().isEmpty()) {
                Snackbar.make(binding.root, "Please enter all fields", Snackbar.LENGTH_SHORT).show()
            } else {
                if (binding.tietPassword.editableText.toString().length < 6
                    || binding.tietConfirmPassword.editableText.toString().length < 6) {
                    Snackbar.make(binding.root, "Enter 6 characters password at least!", Snackbar.LENGTH_SHORT).show()
                } else {
                    if(binding.tietPassword.editableText.toString() != binding.tietConfirmPassword.editableText.toString()) {
                        Snackbar.make(binding.root, "Password does not match with confirm password", Snackbar.LENGTH_SHORT).show()
                    } else {
                        showDialog()
                        Handler(Looper.getMainLooper()).postDelayed({
                            navigateToMainScreen()
                        }, 2000)
                    }
                }
            }
        }

        binding.tvSignup.setOnClickListener {
            binding.tietEmail.editableText.clear()
            binding.tietPassword.editableText.clear()
            binding.tietConfirmPassword.editableText.clear()
            startActivity(Intent(this, SignupActivity::class.java))
        }
    }

    @SuppressLint("SetTextI18n")
    private fun showDialog() {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialog)
        val tvSuccess: TextView = dialog.findViewById(R.id.tvSuccess)
        tvSuccess.text = "Congratulations! You are signed up successfully!"
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
    }

    private fun navigateToMainScreen() {
        val sharedPrefs = applicationContext.getSharedPreferences("SHARED_PREFERENCE", Context.MODE_PRIVATE)
        sharedPrefs.edit().putBoolean("LOGIN", true).apply()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}