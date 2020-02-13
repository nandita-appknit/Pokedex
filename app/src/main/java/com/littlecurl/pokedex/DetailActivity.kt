package com.littlecurl.pokedex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
/*
        if(intent != null) {
            // load the image/text/file data about the Pokemon
            val pokemonName = intent.getStringExtra("pokemon_name") ?: "Pikachu"
            val imageID = resources.getIdentifier(pokemonName.toLowerCase(), "drawable",packageName)
            val textFileID = resources.getIdentifier(pokemonName.toLowerCase(), "raw", packageName)
            val fileText = resources.openRawResource(textFileID).bufferedReader().readText()
            pokemon_name.text = pokemonName
            pokemon_image.setImageResource(imageID)
            pokemon_detail.text = fileText
        }
*/
    }
}
