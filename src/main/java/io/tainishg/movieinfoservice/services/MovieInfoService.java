package io.tainishg.movieinfoservice.services;

import io.tainishg.movieinfoservice.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MovieInfoService {

    private List<Movie> movies = new ArrayList<>(Arrays.asList(
            new Movie("1111", "Transformers"),
            new Movie("2222", "Titanic"),
            new Movie("3333", "Spiderman")
    ));

    public Movie getMovieInfoById(String movieId) {
        return movies.stream().filter(mov -> movieId.equals(mov.getMovieId())).
                findFirst().orElse(null);
    }

    public List<Movie> getMovieInfos() {
        return movies;
    }

    public List<Movie> getMoviesWatchedByUser(String userId) {
        return movies;
    }
}
