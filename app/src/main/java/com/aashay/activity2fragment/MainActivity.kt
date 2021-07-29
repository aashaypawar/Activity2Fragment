package com.aashay.activity2fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring and initializing the EditText and Button from the layout
        val mEditText = findViewById<EditText>(R.id.editText)
        val mButton = findViewById<Button>(R.id.button)

        // Declaring fragment manager from making data transactions using the custom fragment
        val mFragmentManager = supportFragmentManager
        val mFragmentTransaction = mFragmentManager.beginTransaction()
        val mFragment = MyCustomFragment()

        // On button click, a bundle is initialized and the text from the EditText is passed in the custom fragment using this bundle
        mButton.setOnClickListener {
            val mBundle = Bundle()
            mBundle.putString("mText",mEditText.text.toString())
            mFragment.arguments = mBundle
            mFragmentTransaction.add(R.id.frameLayout, mFragment).commit()
        }
    }
}