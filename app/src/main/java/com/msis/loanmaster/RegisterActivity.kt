package com.msis.loanmaster

import android.graphics.Color
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.SpannedString
import android.text.style.ForegroundColorSpan
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val textView = findViewById<TextView>(R.id.textView7)
        val text = "Already have a account login? Login."

        val spanString = SpannableString(text)
        val blueSpan = ForegroundColorSpan(Color.BLUE)

        spanString.setSpan(blueSpan, 30, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.text = spanString


        val textInputLayout = findViewById<TextInputLayout>(R.id.inputTextLayout1)
        val editText = textInputLayout.findViewById<EditText>(R.id.inputEditText5)
        val img: Drawable? = applicationContext.resources.getDrawable(R.drawable.password_toogle)
        editText.setCompoundDrawablesWithIntrinsicBounds(null, null, img, null)

    }
}