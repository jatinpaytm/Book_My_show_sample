package io.bootify.my_app.repos;

import io.bootify.my_app.domain.CinemaHall;
import io.bootify.my_app.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CinemaHallRepository extends JpaRepository<CinemaHall, Integer> {

    Optional<CinemaHall> findById(Integer integer);
}
