package com.littlecurl.pokedex


import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TableRow
import kotlinx.android.synthetic.main.fragment_pokedex.*


class PokedexFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pokedex, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        for (i in 0 until table_layout.childCount) {
            val row = table_layout.getChildAt(i) as TableRow
            for (j in 0 until row.childCount) {
                val button = row.getChildAt(j) as ImageButton
                button.setOnClickListener{
                    pokemonClick(it)
                }
            }
        }
    }

    fun pokemonClick(view: View) {
        val button: ImageButton = view as ImageButton
        val tag: String = button.tag.toString()

        if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
            // jump to DetailsActivity
            val myIntent = Intent(activity, DetailActivity::class.java)
            myIntent.putExtra("pokemon_name", tag)
            startActivity(myIntent)
        } else {
            // landscape mode
            val detailsFragment = fragmentManager!!.findFragmentById(R.id.details_fragment) as DetailsFragment
            detailsFragment.displayPokemon(tag)
        }
    }

}
