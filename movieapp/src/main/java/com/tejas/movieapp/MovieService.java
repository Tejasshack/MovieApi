//package com.tejas.movieapp;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class MovieService {
//
//    @Autowired
//    private MovieRepository movieRepository;
//
//    public List<Movie> allMovies() {
//        return movieRepository.findAll();
//    }
//
//
//    public Optional<Movie> findMovieByImdbId(String imdbId) {
//        return movieRepository.findMovieByImdbId(imdbId);
//    }
//
//
//
//}
package com.tejas.movieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> findMovieByImdbId(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
