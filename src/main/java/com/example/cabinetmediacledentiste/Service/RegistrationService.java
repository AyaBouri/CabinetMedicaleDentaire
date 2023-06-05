package com.example.cabinetmediacledentiste.Service;
import com.example.cabinetmediacledentiste.Repository.RegistrationRepository;
import com.example.cabinetmediacledentiste.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepository repo;
    public Utilisateur saveUtilisateur(Utilisateur utilisateur){
        return repo.save(utilisateur);
    }
    public Utilisateur fetcUtilisateurByEmail(String email){
        return repo.findByEmail(email);
    }
    public Utilisateur fetchUtilisateurByEmailAndPassword(String email,String password){
        return repo.findByEmailAndPassword(email,password);
    }
}