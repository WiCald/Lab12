package com.example.lab12

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val myDataset: Array<String>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    // Proporciona una referencia al tipo de vistas que estás utilizando
    // (personalizado ViewHolder).
    class MyViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    // Crea nuevas vistas (invocadas por el layout manager).
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Crea una nueva vista, que define la UI del elemento de la lista
        val textView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent, false) as TextView
        return MyViewHolder(textView)
    }

    // Reemplaza el contenido de una vista (invocada por el layout manager).
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // Obtiene el elemento de tu dataset en esta posición y reemplaza
        // el contenido de la vista con ese elemento
        holder.textView.text = myDataset[position]
    }
}

// Retorna el tamaño de tu dataset (