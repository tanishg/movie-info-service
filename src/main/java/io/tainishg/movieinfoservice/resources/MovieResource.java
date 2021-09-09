package io.tainishg.movieinfoservice.resources;

import io.tainishg.movieinfoservice.model.Movie;
import io.tainishg.movieinfoservice.services.MovieInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @Autowired
    private MovieInfoService movieInfoService;

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
        return movieInfoService.getMovieInfoById(movieId);
    }

    @RequestMapping
    public List<Movie> getMovieInfos() {
        return movieInfoService.getMovieInfos();
    }

    @RequestMapping("users/{userId}")
    public List<Movie> getMoviesWatchedByUser(@PathVariable("userId") String userId){
        return movieInfoService.getMoviesWatchedByUser(userId);
    }

}
