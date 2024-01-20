package com.commigo.metaclass.MetaClass.gestionemeeting.repository;

import com.commigo.metaclass.MetaClass.entity.FeedbackMeeting;
import com.commigo.metaclass.MetaClass.entity.Meeting;
import com.commigo.metaclass.MetaClass.entity.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackMeetingRepository extends JpaRepository<FeedbackMeeting, Long> {
  /**
   * Metodo che permette di ricercare il questionario compilato da un determinato utente che fa
   * riferimento ad un determinato meeting
   *
   * @param utente Utente su cui si basa la ricerca
   * @param meeting meeting su cui si basa la ricerca
   * @return Questionario compilato dell'utente
   */
  FeedbackMeeting findFeedbackMeetingByUtenteAndMeeting(Utente utente, Meeting meeting);

  /**
   * Metodo che permette di ricercare tutti i questionari compilati da un determinato utente
   *
   * @param utente utente su cui si basa la ricerca
   * @return
   */
  List<FeedbackMeeting> findFeedbackMeetingByUtente(Utente utente);
}
