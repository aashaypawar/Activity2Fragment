package com.aashay.activity2fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class MyCustomFragment: Fragment() {

    // Declaring TextView fro the custom fragment layout
    private lateinit var myTextView: TextView

    // Override function when the view is being created
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        // Inflates the custom fragment layout
        val view: View = inflater.inflate(R.layout.my_custom_fragment, container, false)

        // Finds the TextView in the custom fragment
        myTextView = view.findViewById<View>(R.id.fragmentTextView) as TextView

        // Gets the data from the passed bundle
        val bundle = arguments
        val message = bundle!!.getString("mText")

        // Sets the derived data (type String) in the TextView
        myTextView.text = message

        return view
    }
}