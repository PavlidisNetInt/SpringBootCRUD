package com.intrasoft.netcompany.epavlid.crud.service;

import com.intrasoft.netcompany.epavlid.crud.dto.Movie;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class MovieService {

    private List<Movie> movies = new ArrayList<>(Arrays.asList(
            new Movie(0L, "Die Hard", "John McTiernan", 1988),
            new Movie(1L, "Bladerunner", "Ridley Scott",1982),
            new Movie(2L, "The Godfather", "Francis Ford Coppola", 1972),
            new Movie(3L, "Malcolm & Marie", "Sam Levinson", 2021)
    ));
    public List<Movie> getAllMovies(){
        return movies;
    }

    public Movie getMovieById(Long id){
        return movies.stream().filter(m->m.getId().equals(id)).findFirst().get();
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public Movie updateMovie(Long id, Movie movie){
        int i = 0;
        for(Movie m : movies){
            if(m.getId().equals(id)) {
                movies.set(i, movie);
                return movie;
            }
            i++;
        }
        return null;
    }

    public void deleteMovieById(Long id){
        movies.removeIf(m -> m.getId().equals(id));
    }

    public void deleteAllMovies(){
        movies.clear();
    }

}
