package com.example.imagerecyclerview.adapter


import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.imagerecyclerview.R
import com.example.imagerecyclerview.model.Person
import kotlinx.android.synthetic.main.perosn_item.view.*

class PersonAdapter(var personList: ArrayList<Person>) :
    RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {



   class PersonViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {


        fun bindPerson(person: Person) {
            itemView.imageView.setImageResource(person.image)
            itemView.textView.text = person.name
            itemView.textView1.text  = person.name1






        }


    }

    //choose layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(
            R.layout.perosn_item,
            parent, false
        )
        return PersonViewHolder(view)
    }

    //count
    override fun getItemCount(): Int {
        return personList.size

    }

    //position
    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bindPerson(personList[position])
    }


}



