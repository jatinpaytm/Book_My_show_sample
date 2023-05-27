package io.bootify.my_app.repos;

import io.bootify.my_app.domain.CinemaSeat;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CinemaSeatRepository extends JpaRepository<CinemaSeat, Integer> {
}
