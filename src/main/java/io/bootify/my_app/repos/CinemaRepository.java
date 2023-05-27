package io.bootify.my_app.repos;

import io.bootify.my_app.domain.Cinema;
import io.bootify.my_app.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CinemaRepository extends JpaRepository<Cinema, Integer> {

    Optional<Cinema> findById(Integer integer);
}
