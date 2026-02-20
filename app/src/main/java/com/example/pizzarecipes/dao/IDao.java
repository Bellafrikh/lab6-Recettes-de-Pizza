package com.example.pizzarecipes.dao;

import java.util.List;

public interface IDao<T> {
    T ajouter(T entite);
    T modifier(T entite);
    boolean supprimer(long identifiant);
    T rechercherParId(long identifiant);
    List<T> obtenirTout();
}
