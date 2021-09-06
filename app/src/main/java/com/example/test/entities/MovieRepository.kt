package com.example.test.entities

class MovieRepository {
     private var movieList: MutableList<Movie> = mutableListOf()

    init{
        movieList.add(Movie("Terrible Peli","Una peli muy grosa", ""))
    }

    fun getMovies():MutableList<Movie>{
        return movieList
    }
}