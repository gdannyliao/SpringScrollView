package com.ggdsn.springscrollview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 0..20) {
            val textView = layoutInflater.inflate(android.R.layout.simple_list_item_1, linearLayout, false) as TextView
            textView.text = i.toString()
            linearLayout.addView(textView)
        }
    }
}
