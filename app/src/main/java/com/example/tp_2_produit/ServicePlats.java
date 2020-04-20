package com.example.tp_2_produit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ServicePlats {
    private Map<String,Plat> plats = new HashMap<>();
    private ArrayList<String> ingredients  = new ArrayList<>();

//    public Plat(String nom, Float prixAvecLivraison, Float prixSansLivraison, ArrayList<String> ingredients, Text preparation, String lien) {

    public Map<String,Plat> getPlats(){
        ingredients.add("ingredient 1");
        ingredients.add("ingredient 2");
        ingredients.add("ingredient 3");
        ingredients.add("ingredient 4");
        ingredients.add("............");

        plats.put("hlou", new Plat("hlou",1000,800,ingredients,".........................................................","https://www.cuisineaz.com/recettes/lham-hlou-87781.aspx",R.drawable.hlou));
        plats.put("mtewem", new Plat("mtewem",1000,800,ingredients,".........................................................","https://www.cuisineaz.com/recettes/recherche_terme.aspx?recherche=mtewem",R.drawable.mtewem));
        plats.put("rechta", new Plat("rechta",1000,800,ingredients,".........................................................","https://www.cuisineaz.com/recettes/recherche_terme.aspx?recherche=rechta",R.drawable.rechta));


        return plats;
    }

}
