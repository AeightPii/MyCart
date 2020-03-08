package com.example.mycart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycart.adapter.PersonAdapter
import com.example.mycart.model.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var personArray=ArrayList<Person>()
        personArray.add(Person("Sugar","$20.00",R.drawable.sgar,"50Kg"))
        personArray.add(Person("Peanuts","$25.00",R.drawable.peanuts,"55Kg"))
        personArray.add(Person("Rice","$70.00",R.drawable.rice,"60Kg"))
        personArray.add(Person("Sugar","$20.00",R.drawable.sgar,"50Kg"))
        personArray.add(Person("Peanuts","$25.00",R.drawable.peanuts,"55Kg"))
        personArray.add(Person("Rice","$70.00",R.drawable.rice,"60Kg"))
        var personAdapter= PersonAdapter(personArray)

        recyclerView.layoutManager= LinearLayoutManager(this)
        //recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        // recyclerView.layoutManager=GridLayoutManager(this,2)
        recyclerView.adapter=personAdapter
    }
}
