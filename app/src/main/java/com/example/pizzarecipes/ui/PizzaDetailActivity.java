package com.example.pizzarecipes.ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.service.ProduitService;

public class PizzaDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        // Récupération de l'identifiant passé par l'activité précédente
        long identifiantRecette = getIntent().getLongExtra("pizza_id", -1);
        
        // Recherche du produit correspondant dans le catalogue
        Produit recetteSelectionnee = ProduitService.getInstance().rechercherParId(identifiantRecette);

        // Initialisation des composants de l'interface
        ImageView imagePrincipale = findViewById(R.id.visuel_pizza_detail);
        TextView nomRecette = findViewById(R.id.titre_recette);
        TextView informationsCout = findViewById(R.id.infos_prepa);
        TextView listeIngredients = findViewById(R.id.composition_liste);
        TextView descriptionLongue = findViewById(R.id.detail_description);
        TextView etapesFabrication = findViewById(R.id.etapes_preparation);

        // Remplissage des champs si la recette a bien été trouvée
        if (recetteSelectionnee != null) {
            imagePrincipale.setImageResource(recetteSelectionnee.getVignette());
            nomRecette.setText(recetteSelectionnee.getDesignation());
            
            String metaInfos = recetteSelectionnee.getTempsPreparation() + " • " + recetteSelectionnee.getTarifUnitaire() + " DH";
            informationsCout.setText(metaInfos);
            
            listeIngredients.setText(recetteSelectionnee.getComposition());
            descriptionLongue.setText(recetteSelectionnee.getDetailDescription());
            etapesFabrication.setText(recetteSelectionnee.getInstructionsRecette());
        } else {
            nomRecette.setText("Erreur : Produit introuvable");
        }
    }
}
