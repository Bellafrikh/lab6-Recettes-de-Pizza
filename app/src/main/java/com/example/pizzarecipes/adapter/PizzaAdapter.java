package com.example.pizzarecipes.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {

    private final Context contexte;
    private final List<Produit> listePizzas;

    public PizzaAdapter(Context contexte, List<Produit> listePizzas) {
        this.contexte = contexte;
        this.listePizzas = listePizzas;
    }

    @Override
    public int getCount() {
        return listePizzas.size();
    }

    @Override
    public Object getItem(int position) {
        return listePizzas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listePizzas.get(position).getIdentifiant();
    }

    @Override
    public View getView(int position, View vueRecyclee, ViewGroup parent) {
        // Initialisation de la vue de l'item si elle n'existe pas encore
        if (vueRecyclee == null) {
            vueRecyclee = LayoutInflater.from(contexte).inflate(R.layout.row_pizza, parent, false);
        }

        // Récupération des composants graphiques
        ImageView imageVignette = vueRecyclee.findViewById(R.id.vignette_pizza);
        TextView texteDesignation = vueRecyclee.findViewById(R.id.nom_pizza_item);
        TextView texteDetails = vueRecyclee.findViewById(R.id.info_pizza_item);

        // Liaison des données du produit avec la vue
        Produit pizzaActuelle = listePizzas.get(position);

        if (pizzaActuelle != null) {
            imageVignette.setImageResource(pizzaActuelle.getVignette());
            texteDesignation.setText(pizzaActuelle.getDesignation());
            
            String infos = pizzaActuelle.getTempsPreparation() + " - " + pizzaActuelle.getTarifUnitaire() + " DH";
            texteDetails.setText(infos);
        }

        return vueRecyclee;
    }
}
