package ma.enset.mvcthymeleaf.Web;

import lombok.AllArgsConstructor;
import ma.enset.mvcthymeleaf.Repositories.PatientRepository;
import ma.enset.mvcthymeleaf.entities.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {

    private PatientRepository patientRepository;

    @GetMapping(path="/index")
    public String patient(Model model){
        List<Patient> patients=patientRepository.findAll() ;
        model.addAttribute("ListPatients",patients);
        return "patients"; //View based on thymeleaf (resources/templates)
    }
}
