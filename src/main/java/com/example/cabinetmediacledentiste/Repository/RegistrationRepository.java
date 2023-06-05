package com.example.cabinetmediacledentiste.Repository;
import com.example.cabinetmediacledentiste.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RegistrationRepository extends JpaRepository<Utilisateur, Long> {
    public Utilisateur findByEmail(String email);
    public Utilisateur findByEmailAndPassword(String email, String password);
}