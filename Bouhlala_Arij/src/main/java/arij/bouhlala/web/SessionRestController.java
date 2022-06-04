package arij.bouhlala.web;

import arij.bouhlala.entités.Conference;
import arij.bouhlala.entités.Session;
import arij.bouhlala.repositories.ConferenceRepository;
import arij.bouhlala.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class SessionRestController {

    @Autowired
    private SessionRepository sessionRepository;
    @Autowired
    private ConferenceRepository conferenceRepository;

    @GetMapping("/sessions")
    public List<Session> sessionList(){
        return sessionRepository.findAll();
    }

    @GetMapping("/conferences")
    public List<Conference> conferenceList(){
        return conferenceRepository.findAll();
    }

    @PostMapping(path = "/sessions/{ti}")
    public Session saveSession(@RequestBody Session s,@PathVariable String ti){
        s.setId(UUID.randomUUID().toString());
        s.setNom(ti);
        return sessionRepository.save(s);
    }


    @PutMapping("/sessions/{id}")
    public Session updateSession(@RequestBody Session session,@PathVariable String id){
        session.setId(id);
        return sessionRepository.save(session);
    }

    @DeleteMapping("/sessions/{id}")
    public void deleteSession(@PathVariable String id){
        sessionRepository.deleteById(id);
    }
}
