package com.msis.loanmaster

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.widget.TextView

class Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val textView = findViewById<TextView>(R.id.textView4)
        val text = "Already have an account?Log in."

        val spanString = SpannableString(text)
        val blueSpan = ForegroundColorSpan(Color.YELLOW)

        spanString.setSpan(blueSpan, 24, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.text = spanString
    }
}