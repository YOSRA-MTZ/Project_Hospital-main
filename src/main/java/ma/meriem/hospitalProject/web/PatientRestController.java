package ma.meriem.hospitalProject.web;

import ma.meriem.hospitalProject.entities.Patient;
import ma.meriem.hospitalProject.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientRestController {
    @Autowired
    private PatientRepository patientRepository;
    @GetMapping("/patient")
    public List<Patient> patientList(){
        return patientRepository.findAll();

    }
}
