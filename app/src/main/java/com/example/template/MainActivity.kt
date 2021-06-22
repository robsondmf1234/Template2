package com.example.template

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.template.model.Filme
import com.example.template.ui.ListaFilmesAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaFilmes = listOf(
            Filme(
                "Rei Leao(2019)", "Aventura, Familia", "United States of America", """
            Este desenho animado da Disney mostra as aventuras de um leão jovem de nome Simba, o herdeiro de seu pai, Mufasa. O tio malvado de Simba, Oscar, planeja roubar o trono de Mufasa atraindo pai e filho para uma emboscada. Simba consegue escapar e somente Mufasa morre. Com a ajuda de seus amigos,Timon e Pumba, ele reaparece como adulto para recuperar sua terra, que foi roubada por seu tio Oscar.
        """.trimIndent()
            ),
            Filme(
                "Parasita(2020)", "Aventura, Familia", "Korea do Sul", """
            Toda a família de Ki-taek está desempregada, vivendo em um porão sujo e apertado, mas uma obra do acaso faz com que ele comece a dar aulas de inglês a uma garota de família rica. Fascinados com a vida luxuosa destas pessoas, pai, mãe e filhos bolam um plano para se infiltrarem também na família burguesa, um a um. No entanto, os segredos e mentiras necessários à ascensão social custam caro a todos.
        """.trimIndent()
            )
        )

        list_view_filmes.setAdapter(ListaFilmesAdapter(listaFilmes, this))

    }
}