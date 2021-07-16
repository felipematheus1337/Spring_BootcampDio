package com.live.live.repository;

import com.live.live.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JornadaTrabalhoRepository extends JpaRepository<JornadaTrabalho,Long> {


}
