package com.msis.loanmaster

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.widget.TextView

class OtpVerify : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_verify)

        val textView = findViewById<TextView>(R.id.textView3)
        val text = "Did't receive the OTP? RESEND"

        val spanString = SpannableString(text)
        val blueSpan = ForegroundColorSpan(Color.BLUE)

        spanString.setSpan(blueSpan, 23, 29, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.text = spanString
    }
}