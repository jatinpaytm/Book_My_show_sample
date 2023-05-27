package io.bootify.my_app.repos;

import io.bootify.my_app.domain.Show;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShowRepository extends JpaRepository<Show, Integer> {
}
