package com.commigo.metaclass.MetaClass.gestioneutenza.service;

import com.commigo.metaclass.MetaClass.entity.Utente;
import com.commigo.metaclass.MetaClass.gestioneutenza.repository.UtenteRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
@Slf4j    //serve per stampare delle cose nei log
@Transactional    //ogni operazione è una transazione
public class GestioneUtenzaServiceImpl implements GestioneUtenzaService{

    private final UtenteRepository utenteRepository;
    @Override
    public boolean loginMeta(Utente u) {
        try {
            //cerca l'utente per verificare se registrato o meno
            Optional<Utente> existingUser = utenteRepository.findById(u.getId());

            if (existingUser.isEmpty()) {
                // Utente non presente nel database, lo salva
                utenteRepository.save(u);
            }

            return true;
        } catch (Exception e) {
            e.printStackTrace(); // Stampa la traccia dell'eccezione per debugging
            return false;
        }
    }


}
