package com.example.simplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //1.adapter view:listview
        var listView=findViewById<ListView>(R.id.list_view);
        //2. data source
        var world_cup_array= arrayOf("Germany","Brazil","England","Spain","Qatar")
        //3.adapter - layout of adapter not adapter view - predefined view
//        var arrayAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,world_cup_array)
        var arrayAdapter=ArrayAdapter(this,R.layout.list_item,R.id.textView,world_cup_array)
        //4. connect adapter to adapter view
        listView.adapter=arrayAdapter
    }
}