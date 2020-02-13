package com.littlecurl.pokedex


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_details.*

class DetailsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val act = activity
        // if (act != null && act.intent != null)
        if(act?.intent != null) {
            // load the image/text/file data about this pokemon
            // default pokemonName
            val pokemonName = act.intent.getStringExtra("pokemon_name") ?: "a"
            displayPokemon(pokemonName)
        }
    }

    fun displayPokemon(pokemonName: String) {
        val imageID = resources.getIdentifier(pokemonName.toLowerCase(), "drawable",activity!!.packageName)
        val textFileID = resources.getIdentifier(pokemonName.toLowerCase(), "raw", activity!!.packageName)
        val fileText = resources.openRawResource(textFileID).bufferedReader().readText()
        pokemon_name.text = pokemonName
        pokemon_image.setImageResource(imageID)
        pokemon_detail.text = fileText
    }

}
