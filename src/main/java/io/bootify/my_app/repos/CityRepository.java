package io.bootify.my_app.repos;

import io.bootify.my_app.domain.City;
import io.bootify.my_app.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface CityRepository extends JpaRepository<City, Integer> {

    Optional<City> findById(Integer integer);

    @Query("SELECT city FROM City city")
    List<City> findAllCities();
}
