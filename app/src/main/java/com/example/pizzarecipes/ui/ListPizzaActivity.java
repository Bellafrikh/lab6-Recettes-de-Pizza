package com.example.pizzarecipes.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.adapter.PizzaAdapter;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.service.ProduitService;

import java.util.List;

public class ListPizzaActivity extends AppCompatActivity {

    private ListView vueListePizzas;
    private PizzaAdapter adaptateur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizza);

        // Liaison avec le composant graphique défini dans le XML
        vueListePizzas = findViewById(R.id.liste_pizzas_view);

        // Récupération des données via le service singleton
        List<Produit> recettesChargees = ProduitService.getInstance().obtenirTout();

        // Initialisation et configuration de l'adaptateur personnalisé
        adaptateur = new PizzaAdapter(this, recettesChargees);
        vueListePizzas.setAdapter(adaptateur);

        // Gestion de l'action lors d'un clic sur un élément de la liste
        vueListePizzas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long identifiant) {
                // Création d'une intention pour afficher les détails du produit
                Intent passageDetails = new Intent(ListPizzaActivity.this, PizzaDetailActivity.class);
                
                // Transmission de l'identifiant unique à l'activité de destination
                passageDetails.putExtra("pizza_id", identifiant);
                
                startActivity(passageDetails);
            }
        });
    }
}
