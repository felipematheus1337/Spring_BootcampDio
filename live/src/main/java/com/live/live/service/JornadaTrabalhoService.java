package com.live.live.service;


import com.live.live.model.JornadaTrabalho;
import com.live.live.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {


    @Autowired
    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    /* pode ser feito dessa maneira, como no video foi mostrado
    @Autowired
    public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaTrabalhoRepository) {
        this.jornadaTrabalhoRepository = jornadaTrabalhoRepository;
    }
    */

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public Optional<JornadaTrabalho> getbyId(Long idJornada) {
        return jornadaTrabalhoRepository.findById(idJornada);

    }


    public List<JornadaTrabalho> findAll() {
        return jornadaTrabalhoRepository.findAll();
    }



    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }


    public void delete(Long id) {
             jornadaTrabalhoRepository.deleteById(id);

    }

}
