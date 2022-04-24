package ma.enset.mvcthymeleaf.Web;

import lombok.AllArgsConstructor;
import ma.enset.mvcthymeleaf.Repositories.PatientRepository;
import ma.enset.mvcthymeleaf.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {

    private PatientRepository patientRepository;

    @GetMapping(path="/index")
    public String patient(Model model,
                          @RequestParam(name="page",defaultValue = "0") int page,
                          @RequestParam(name="size",defaultValue = "5") int size){
        Page<Patient> pagePatients=patientRepository.findAll(PageRequest.of(page,size)) ;
        model.addAttribute("ListPatients",pagePatients.getContent());
        model.addAttribute("pages",new int[pagePatients.getTotalPages()]);
        model.addAttribute("currentPage",page);
        return "patients"; //View based on thymeleaf (resources/templates)
    }
}
