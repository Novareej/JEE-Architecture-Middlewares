package arij.bouhlala.services;

import arij.bouhlala.dtos.ConferenceDTO;
import arij.bouhlala.dtos.SessionDTO;
import arij.bouhlala.entités.Conference;
import arij.bouhlala.entités.Session;
import arij.bouhlala.repositories.ConferenceRepository;
import arij.bouhlala.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ConfServiceImpl {

//        @Autowired
//        private ConferenceRepository conferenceRepository;
//        public ConferenceDTO save(ConferenceDTO conferenceDTO){
//            Conference conference = new Conference();
//            conference.setTitre(conferenceDTO.getTitre());
//            conference.setHeure_deb(9);
//            conference.setHeure_fin(12);
//            Session session= new Session();
//            session.setId(conferenceDTO.getSession().getId());
//            session.setNom(conferenceDTO.getSession().getNom());
//            conference.setSession(session);
//            Conference savedConf= conferenceRepository.save(conference) ;
//
//        }
}
