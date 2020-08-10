package com.example.imagerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.imagerecyclerview.adapter.PersonAdapter
import com.example.imagerecyclerview.adapter.PersonAdapter1
import com.example.imagerecyclerview.adapter.PersonAdapter2
import com.example.imagerecyclerview.model.Person
import com.example.imagerecyclerview.model.Person1
import com.example.imagerecyclerview.model.Person2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var personList = ArrayList<Person>()
        personList.add(Person(R.drawable.a,"Chairs","2135 item"))
        personList.add(Person(R.drawable.v,"Chairs","324 item"))
        personList.add(Person(R.drawable.r,"Chairs","218 item"))
        personList.add(Person(R.drawable.e,"Chairs","3123 item"))
        personList.add(Person(R.drawable.f,"Chairs","3453 item"))
        personList.add(Person(R.drawable.g,"Chairs","2343 item"))

        var personAList = ArrayList<Person1>()
        personAList.add(Person1(R.drawable.f,"Ivonno Chair green","$29.00","Shop"))
        personAList.add(Person1(R.drawable.g,"Snakeskin Pattern ","$29.00","Shop"))
        personAList.add(Person1(R.drawable.h,"Armchair Ko green","$29.00","Shop"))

        var personBList = ArrayList<Person2>()
        personBList.add(
            Person2("Collection","New Arrival",
            "Winter","shop now",R.drawable.p)
        )
        personBList.add(
            Person2("Collection","New Arrival",
                "Winter","shop now",R.drawable.w)
        )
        personBList.add(
            Person2("Collection","New Arrival",
                "Winter","shop now",R.drawable.l)
        )
        personBList.add(
            Person2("Collection","New Arrival",
                "Winter","shop now",R.drawable.m)
        )
        personBList.add(
            Person2("Collection","New Arrival",
                "Winter","shop now",R.drawable.o)
        )





//        var personAdapter = PersonAdapter(personList)
//        Log.d("personlist",personAdapter.toString())
//        recycleView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,
//        false)
//        recycleView1.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,
//            false)
//
////        recycleView.layoutManager = GridLayoutManager(this,3)
//
//        recycleView.adapter = PersonAdapter(personList)

        recycleView.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
//            layoutManager = GridLayoutManager(context,3)
            adapter = PersonAdapter(personList)
        }


        recycleView1.apply {
            layoutManager = LinearLayoutManager(context)
//            layoutManager = GridLayoutManager(context,3)
            adapter = PersonAdapter1(personAList)
        }

        recycleView2.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter = PersonAdapter2(personBList)
        }



        recycleView3.apply {
            layoutManager = LinearLayoutManager(context)
//            layoutManager = GridLayoutManager(context,3)
            adapter = PersonAdapter1(personAList)
        }








    }




}