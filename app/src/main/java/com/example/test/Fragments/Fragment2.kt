package com.example.test.Fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.MainActivity
import com.example.test.viewModel.EjemploFragment2ViewModel
import com.example.test.R
import com.example.test.adapter.MoviesAdapter
import com.example.test.entities.Movie
import com.example.test.entities.MovieRepository
import com.example.test.viewModel.MovieListViewModel

class Fragment2 : Fragment() {

    companion object{
        fun newInsatance()=Fragment2()
    }

    private lateinit var viewModel: MovieListViewModel
    private lateinit var v : View
    private lateinit var recMovie: RecyclerView
    private var repository = MovieRepository()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        v = inflater.inflate(R.layout.ejemplo_fragment2_fragment, container, false)
        recMovie=v.findViewById(R.id.recMovie)
        return v
    }

    override fun onStart() {
        super.onStart()

        recMovie.setHasFixedSize(true);
        recMovie.layoutManager = LinearLayoutManager(context)
        recMovie.adapter = MoviesAdapter(repository.getMovies()){ index ->
            onItemClick(index)
        }
    }

    private fun onItemClick(pos: Int) {

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProvider(this).get(MovieListViewModel::class.java)
    }
}