package com.example.cabinetmediacledentiste.model;
import jakarta.persistence.*;
@Entity
@Table(name ="utilisateurs")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="prenom")
    private String prenom;
    @Column(name="nom")
    private String nom;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="profil")
    private String profil;

    public Utilisateur() {

    }

    public Utilisateur( String prenom, String nom, String email, String password, String profil) {
        super();
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.password = password;
        this.profil = profil;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfil() {
        return profil;
    }
    public void setProfil(String profil) {
        this.profil = profil;
    }
}