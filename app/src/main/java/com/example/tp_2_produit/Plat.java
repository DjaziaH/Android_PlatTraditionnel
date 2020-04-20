package com.example.tp_2_produit;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Plat {

    private String nom;
    private int prixAvecLivraison;
    private int prixSansLivraison;
    private ArrayList<String> ingredients;
    private String preparation;
    private String lien;
    private int img ;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Plat() {
    }

    public Plat(String nom, int prixAvecLivraison, int prixSansLivraison, ArrayList<String> ingredients, String preparation, String lien, int img) {
        this.nom = nom;
        this.prixAvecLivraison = prixAvecLivraison;
        this.prixSansLivraison = prixSansLivraison;
        this.ingredients = ingredients;
        this.preparation = preparation;
        this.lien = lien;
        this.img = img;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrixAvecLivraison() {
        return prixAvecLivraison;
    }

    public void setPrixAvecLivraison(int prixAvecLivraison) {
        this.prixAvecLivraison = prixAvecLivraison;
    }

    public int getPrixSansLivraison() {
        return prixSansLivraison;
    }

    public void setPrixSansLivraison(int prixSansLivraison) {
        this.prixSansLivraison = prixSansLivraison;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }



}
