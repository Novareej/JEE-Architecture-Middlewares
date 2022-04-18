package ma.enset.mvcsecurityetudiants.Web;

import lombok.AllArgsConstructor;
import lombok.Data;
import ma.enset.mvcsecurityetudiants.Repositories.EtudiantRepository;
import ma.enset.mvcsecurityetudiants.entities.Etudiant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Data
@AllArgsConstructor
public class EtudiantController {

    private EtudiantRepository etudiantRepository;

    @GetMapping(path="/index")
    public String etudiants(Model model){
        List<Etudiant> etudiants = etudiantRepository.findAll();
        model.addAttribute("listEtudiants",etudiants);
        return "etudiants";

    }
}
