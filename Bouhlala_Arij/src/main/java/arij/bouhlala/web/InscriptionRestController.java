package arij.bouhlala.web;

import arij.bouhlala.entités.Conference;
import arij.bouhlala.entités.Inscription;
import arij.bouhlala.entités.Session;
import arij.bouhlala.repositories.ConferenceRepository;
import arij.bouhlala.repositories.InscriptionRepository;
import arij.bouhlala.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
public class InscriptionRestController {


    @Autowired
    private InscriptionRepository inscriptionRepository;

    @GetMapping("/inscription")
    public List<Inscription> inscriptionList(){
        return inscriptionRepository.findAll();
    }


    @PostMapping(path = "/inscription")
    public Inscription saveInscription(@RequestBody Inscription ins, @RequestBody Date date, @RequestBody Session session){
        ins.setId(UUID.randomUUID().toString());
        ins.setDate(date);
        ins.setSession(session);
        return inscriptionRepository.save(ins);
    }


    @PutMapping("/inscription/{id}")
    public Inscription updateInscription(@RequestBody Inscription inscription,@PathVariable String id){
        inscription.setId(id);
        return inscriptionRepository.save(inscription);
    }

    @DeleteMapping("/inscription/{id}")
    public void deleteSession(@PathVariable String id){
        inscriptionRepository.deleteById(id);
    }
}
