package io.bootify.my_app.controller;

import io.bootify.my_app.domain.Cinema;
import io.bootify.my_app.domain.CinemaHall;
import io.bootify.my_app.domain.City;
import io.bootify.my_app.domain.Movie;
import io.bootify.my_app.repos.CinemaHallRepository;
import io.bootify.my_app.repos.CinemaRepository;
import io.bootify.my_app.repos.CityRepository;
import io.bootify.my_app.repos.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
public class HomeController {

    @Autowired
    public MovieRepository movieRepository;

    @Autowired
    public CityRepository cityRepository;

    @Autowired
    public CinemaHallRepository cinemaHallRepository;

    @Autowired
    public CinemaRepository cinemaRepository;

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World!";
    }


    @PostMapping("/AddMovie")
    public ResponseEntity<?> AddMovie(@RequestBody Movie movie)
    {
        movieRepository.save(movie);
        var isthere = movieRepository.findById(1);

        return ResponseEntity.ok(isthere);
    }

    @PostMapping("/AddCity")
    public ResponseEntity<?> AddCity(@RequestBody City city)
    {
        cityRepository.save(city);
        var isthere = cityRepository.findById(1);

        return ResponseEntity.ok(isthere);
    }

    @PostMapping("/AddCinemaHall")
    public ResponseEntity<?> AddCinemaHall(@RequestBody CinemaHall cinemaHall)
    {
        cinemaHallRepository.save(cinemaHall);
        var isthere = cinemaHallRepository.findById(1);

        return ResponseEntity.ok(isthere);
    }

    @PostMapping("/AddCinema")
    public ResponseEntity<?> AddCinema(@RequestBody Cinema cinema)
    {
        cinemaRepository.save(cinema);
        var isthere = cinemaRepository.findById(1);

        return ResponseEntity.ok(isthere);
    }

    @GetMapping("/GetAllMovies")
    public ResponseEntity<?> GetAllMovies()
    {
        var AllMovies = movieRepository.findAllMovies();

        return ResponseEntity.ok(AllMovies);
    }

    @GetMapping("/GetCity")
    public ResponseEntity<?> GetCity()
    {
        var AllCities = cityRepository.findAllCities();

        return ResponseEntity.ok(AllCities);
    }

}
