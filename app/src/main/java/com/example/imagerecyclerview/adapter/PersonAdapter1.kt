package com.example.imagerecyclerview.adapter



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.imagerecyclerview.R
import com.example.imagerecyclerview.model.Person1
import kotlinx.android.synthetic.main.perosn_item.view.*
import kotlinx.android.synthetic.main.person_item1.view.*

class PersonAdapter1(var personAList: ArrayList<Person1>) :
    RecyclerView.Adapter<PersonAdapter1.PersonViewHolder>() {



    class PersonViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {


        fun bindPerson(person1: Person1) {
            itemView.imageView1.setImageResource(person1.imageA)
            itemView.textView3.text = person1.nameA
            itemView.textView4.text  = person1.nameA1
            itemView.btn1.text = person1.button

        }


    }

    //choose layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(
            R.layout.person_item1,
            parent, false
        )
        return PersonViewHolder(view)
    }

    //count
    override fun getItemCount(): Int {
        return personAList.size

    }

    //position
    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bindPerson(personAList[position])
    }


}



