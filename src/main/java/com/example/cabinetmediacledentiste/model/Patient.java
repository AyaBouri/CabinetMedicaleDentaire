package com.example.cabinetmediacledentiste.model;
import jakarta.persistence.*;

@Entity
@Table(name="patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="nomPat")
    private String nomPat;
    @Column(name="prenomPat")
    private String prenomPat;
    @Column(name="age")
    private int age;
    @Column(name="sexe")
    private String sexe;
    @Column(name="tel")
    private int tel;
    @Column(name="profession")
    private String profession;
    @Column(name="nationalite")
    private String nationalite;
    @Column(name="adressePat")
    private String adressePat;
    @Column(name="maladie")
    private String maladie;
    @Column(name="medication")
    private String medication;
    @Column(name="contremedic")
    private String contremedic;
    public Patient() {

    }

    public Patient( String nomPat, String prenomPat, int age, String sexe, int tel, String profession,
                    String nationalite, String adressePat, String maladie, String medication, String contremedic) {
        super();
        this.nomPat = nomPat;
        this.prenomPat = prenomPat;
        this.age = age;
        this.sexe = sexe;
        this.tel = tel;
        this.profession = profession;
        this.nationalite = nationalite;
        this.adressePat = adressePat;
        this.maladie = maladie;
        this.medication = medication;
        this.contremedic = contremedic;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomPat() {
        return nomPat;
    }

    public void setNomPat(String nomPat) {
        this.nomPat = nomPat;
    }

    public String getPrenomPat() {
        return prenomPat;
    }

    public void setPrenomPat(String prenomPat) {
        this.prenomPat = prenomPat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getAdressePat() {
        return adressePat;
    }

    public void setAdressePat(String adressePat) {
        this.adressePat = adressePat;
    }

    public String getMaladie() {
        return maladie;
    }

    public void setMaladie(String maladie) {
        this.maladie = maladie;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getContremedic() {
        return contremedic;
    }

    public void setContremedic(String contremedic) {
        this.contremedic = contremedic;
    }
}