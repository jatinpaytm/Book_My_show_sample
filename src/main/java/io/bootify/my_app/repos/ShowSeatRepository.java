package io.bootify.my_app.repos;

import io.bootify.my_app.domain.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShowSeatRepository extends JpaRepository<ShowSeat, Integer> {
}
