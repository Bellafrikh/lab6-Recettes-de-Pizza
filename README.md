# Application de Recettes de Pizza 🍕

Ce projet est une application Android native développée pour présenter un catalogue interactif de recettes de pizzas. L'application met l'accent sur une interface utilisateur propre et une architecture logicielle bien structurée.

## 🌟 Fonctionnalités principales

*   **Splash Screen animé** : Un écran d'accueil avec une animation de fondu pour une meilleure expérience utilisateur dès le lancement.

 <img width="287" height="632" alt="image" src="https://github.com/user-attachments/assets/c0cc49c8-4f05-4de7-b5c7-fa0dfd2c57fa" />

*   **Catalogue de Recettes** : Une liste élégante utilisant des `CardView` pour afficher les pizzas avec leur visuel, leur prix et leur temps de préparation.
<img width="362" height="788" alt="image" src="https://github.com/user-attachments/assets/87ee4c97-aa67-48b6-b2cf-5aed3e09b0de" />

*   **Détails Complets** : Chaque pizza possède sa propre fiche détaillée incluant :
    *   La liste des ingrédients.
<img width="353" height="600" alt="image" src="https://github.com/user-attachments/assets/35918207-aba5-4591-9388-eef3db0f5136" />
  
    *   Une description de l'histoire ou du goût de la pizza.
<img width="337" height="133" alt="image" src="https://github.com/user-attachments/assets/ba56ff42-646c-477d-a648-5c717a6c6ce1" />

    *   Les étapes de préparation pas à pas.

<img width="337" height="133" alt="image" src="https://github.com/user-attachments/assets/ba56ff42-646c-477d-a648-5c717a6c6ce1" />

## 🛠️ Détails Techniques

L'application a été conçue en suivant des principes de développement Android modernes :
*   **Langage** : Java.
*   **Pattern DAO (Data Access Object)** : Utilisation d'une interface générique `IDao` pour séparer la logique de persistance de la logique métier.
*   **Gestion des données** : Implémentation d'un service Singleton (`ProduitService`) pour centraliser la manipulation des objets `Produit` en mémoire.
*   **Interface Graphique** :
    *   Utilisation de `ListView` avec des adaptateurs personnalisés (`PizzaAdapter`).
    *   Mise en page via des Layouts XML optimisés (`RelativeLayout`, `LinearLayout`, `CardView`).
    *   Animations natives Android.

## 📂 Structure du Projet

L'organisation des fichiers respecte les conventions Android :
*   `com.example.pizzarecipes.classes` : Modèles de données.
*   `com.example.pizzarecipes.dao` : Interfaces d'accès aux données.
*   `com.example.pizzarecipes.service` : Logique métier et stockage temporaire.
*   `com.example.pizzarecipes.adapter` : Adaptateurs pour les vues de listes.
*   `com.example.pizzarecipes.ui` : Activités et gestion de l'interface utilisateur.

## 🚀 Installation et Test

1. Importer le projet dans **Android Studio**.
2. Synchroniser les fichiers **Gradle**.
3. Compiler et lancer l'application sur un appareil réel ou un émulateur (API 21+).

---
*Projet réalisé avec soin dans le cadre de l'apprentissage du développement mobile Android.*

