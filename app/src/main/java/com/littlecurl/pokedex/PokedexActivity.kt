package com.littlecurl.pokedex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class PokedexActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokedex)
    }
/*
    fun pokemonClick(view: View) {
        val button: ImageButton = view as ImageButton
        val tag: String = button.tag.toString()

        // jump to DetailsActivity
        val myIntent = Intent(this, DetailActivity::class.java)
        myIntent.putExtra("pokemon_name", tag)
        startActivity(myIntent)
    }
*/
}
