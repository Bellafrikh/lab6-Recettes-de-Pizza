package com.example.pizzarecipes.classes;

public class Produit {
    // Variable statique pour la gestion automatique des IDs
    private static long sequenceId = 1;

    private long identifiant;
    private String designation;
    private double tarifUnitaire;
    private int vignette;
    private String tempsPreparation;
    private String composition;
    private String detailDescription;
    private String instructionsRecette;

    // Constructeur par défaut : initialise l'identifiant unique
    public Produit() {
        this.identifiant = sequenceId++;
    }


    public Produit(String designation, double tarif, int vignette, String temps,
                   String ingredients, String description, String etapes) {
        this.identifiant = sequenceId++;
        this.designation = designation;
        this.tarifUnitaire = tarif;
        this.vignette = vignette;
        this.tempsPreparation = temps;
        this.composition = ingredients;
        this.detailDescription = description;
        this.instructionsRecette = etapes;
    }

    // --- Méthodes d'accès (Getters et Setters) ---

    public long getIdentifiant() {
        return identifiant;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getTarifUnitaire() {
        return tarifUnitaire;
    }

    public void setTarifUnitaire(double tarifUnitaire) {
        this.tarifUnitaire = tarifUnitaire;
    }

    public int getVignette() {
        return vignette;
    }

    public void setVignette(int vignette) {
        this.vignette = vignette;
    }

    public String getTempsPreparation() {
        return tempsPreparation;
    }

    public void setTempsPreparation(String tempsPreparation) {
        this.tempsPreparation = tempsPreparation;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getDetailDescription() {
        return detailDescription;
    }

    public void setDetailDescription(String detailDescription) {
        this.detailDescription = detailDescription;
    }

    public String getInstructionsRecette() {
        return instructionsRecette;
    }

    public void setInstructionsRecette(String instructionsRecette) {
        this.instructionsRecette = instructionsRecette;
    }

    @Override
    public String toString() {
        return "Produit : " + designation + " | Prix : " + tarifUnitaire + " DH";
    }
}
