package com.msis.loanmaster

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val textView = findViewById<TextView>(R.id.textView7)
        val text = "Don't you have an account? Register"

        val spanString = SpannableString(text)
        val blueSpan = ForegroundColorSpan(Color.BLUE)

        spanString.setSpan(blueSpan, 27, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.text = spanString
    }
}