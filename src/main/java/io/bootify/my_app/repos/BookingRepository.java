package io.bootify.my_app.repos;

import io.bootify.my_app.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
