package com.example.cabinetmediacledentiste.Controller;
import com.example.cabinetmediacledentiste.Repository.UtilisateurRepository;
import com.example.cabinetmediacledentiste.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class UtilisateurController {
    @Autowired
    private UtilisateurRepository utilisateurRepository;
    //Avoir tous les utilisateurs
    @GetMapping("/utilisateurs")
    public java.util.List<Utilisateur> getAllUtilisateur(){
        return utilisateurRepository.findAll();
    }
    //Créer un utilisateur restApi
    @PostMapping("/utilisateurs")
    public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }
    //Avoir un utilisateur par son id RestApi
    @GetMapping("/utilisateurs/{id}")
    public ResponseEntity< Utilisateur> getUtilisateurById(@PathVariable Long id) {
        Utilisateur utilisateur = utilisateurRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Aucun utilisateur ne  detient l'id :" + id));
        return ResponseEntity.ok(utilisateur);
    }
    //Mise à jour d'un utilisateur restApi
    @PutMapping("/utilisateurs/{id}")
    public ResponseEntity< Utilisateur> updateUtilisateur(@PathVariable Long id,@RequestBody Utilisateur utilisateurDetails){
        Utilisateur utilisateur = utilisateurRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Aucun utilisateur ne  detient l'id :" + id));
        utilisateur.setNom(utilisateurDetails.getNom());
        utilisateur.setPrenom(utilisateurDetails.getPrenom());
        utilisateur.setEmail(utilisateurDetails.getEmail());
        utilisateur.setProfil(utilisateurDetails.getProfil());
        Utilisateur updUtilisateur = utilisateurRepository.save(utilisateur);
        return ResponseEntity.ok(updUtilisateur);
    }
    //Supprimer un utilisateur rest api
    @DeleteMapping("/utilisateurs/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteUtilisateur(@PathVariable Long id){
        Utilisateur utilisateur = utilisateurRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Aucun utilisateur ne  detient l'id :" + id));
        utilisateurRepository.delete(utilisateur);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}