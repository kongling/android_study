package com.konling.study.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var doneButton: Button
    private lateinit var editText: EditText
    private lateinit var nicknametext: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        doneButton = findViewById(R.id.done_button)
        editText = findViewById(R.id.nickname_edit)
        nicknametext = findViewById(R.id.nickname_text)
        doneButton.setOnClickListener { addNickname() }
        nicknametext.setOnClickListener { updateNickName() }
    }

    private fun addNickname() {
        nicknametext.text = editText.text
        editText.visibility = View.GONE
        doneButton.visibility = View.GONE
        nicknametext.visibility = View.VISIBLE
        // Hide the keyboard.
        val inputMethodManager =
            getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(doneButton.windowToken, 0)
    }

    private fun updateNickName() {
        editText.visibility = View.VISIBLE
        doneButton.visibility = View.VISIBLE
        nicknametext.visibility = View.GONE
        editText.setText("")
        // Set the focus to the edit text.
        editText.requestFocus()
        // Show the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, 0)
    }
}