package com.example.imagerecyclerview.adapter



import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.imagerecyclerview.R
import com.example.imagerecyclerview.model.Person
import com.example.imagerecyclerview.model.Person2
import kotlinx.android.synthetic.main.perosn_item.view.*
import kotlinx.android.synthetic.main.person_item2.view.*

class PersonAdapter2(var personBList: ArrayList<Person2>) :
    RecyclerView.Adapter<PersonAdapter2.PersonViewHolder>() {



    class PersonViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {


        fun bindPerson(person2: Person2) {
           itemView.txtName1.text = person2.name
            itemView.txtName2.text = person2.name1
            itemView.txtName3.text = person2.name2
            itemView.txtName4.text = person2.name3
            itemView.imageView5.setImageResource(person2.image)


        }


    }

    //choose layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(
            R.layout.person_item2,
            parent, false
        )
        return PersonViewHolder(view)
    }

    //count
    override fun getItemCount(): Int {
        return personBList.size

    }

    //position
    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bindPerson(personBList[position])
    }


}



