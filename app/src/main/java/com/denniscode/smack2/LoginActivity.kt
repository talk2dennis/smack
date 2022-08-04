package com.denniscode.smack2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun signUpBtnClicked (view: View) {
        val signUpIntent = Intent (this, SignupActivity::class.java)
        startActivity(signUpIntent)
    }
}