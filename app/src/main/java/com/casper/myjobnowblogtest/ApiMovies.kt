package com.casper.myjobnowblogtest

import io.reactivex.Observable
import retrofit2.http.GET


interface ApiMovies {
    @GET("/filippella/Sample-API-Files/master/json/movies-api.json")// The endpoint
    fun getMovies() : Observable<MovieResponse>
}