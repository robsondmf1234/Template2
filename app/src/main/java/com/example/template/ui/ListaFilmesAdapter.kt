package com.example.template.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.template.R
import com.example.template.model.Filme
import kotlinx.android.synthetic.main.layout_list_filmes.view.*

class ListaFilmesAdapter(
    filmes: List<Filme>,
    context: Context
) : BaseAdapter() {

    private val filmes = filmes
    private val context = context

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val viewCriada =
            LayoutInflater.from(context).inflate(R.layout.layout_list_filmes, parent, false)

        val filme = filmes[position]

        viewCriada.text_titulo.setText(filme.titulo)
        viewCriada.text_categoria.setText(filme.categoria)
        viewCriada.text_pais.setText(filme.pais)
        viewCriada.text_sinopse.setText(filme.sinopse)

        return viewCriada
    }

    override fun getItem(position: Int): Filme {
        return filmes[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return filmes.size
    }
}