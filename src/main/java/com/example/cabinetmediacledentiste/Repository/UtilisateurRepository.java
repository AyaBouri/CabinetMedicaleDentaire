package com.example.cabinetmediacledentiste.Repository;
import com.example.cabinetmediacledentiste.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}