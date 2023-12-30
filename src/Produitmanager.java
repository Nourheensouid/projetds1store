import java.util.HashMap;
import java.util.Map;

public class Produitmanager {

    private Map<String, Produit> produits;

    public Produitmanager() {
        this.produits = new HashMap<>();
    }

    public void ajouterProduit(String reference, String nom, double prix) {
        Produit produit = new Produit(reference, nom, prix);
        produits.put(reference, produit);
        System.out.println("Produit ajouté : " + produit);
    }

    public void modifierProduit(String reference, String nouveauNom, double nouveauPrix) {
        if (produits.containsKey(reference)) {
            Produit produit = produits.get(reference);
            produit.setNom(nouveauNom);
            produit.setPrix(nouveauPrix);
            System.out.println("Produit modifié : " + produit);
        } else {
            System.out.println("Le produit avec la référence " + reference + " n'existe pas.");
        }
    }

    public void supprimerProduit(String reference) {
        if (produits.containsKey(reference)) {
            Produit produit = produits.remove(reference);
            System.out.println("Produit supprimé : " + produit);
        } else {
            System.out.println("Le produit avec la référence " + reference + " n'existe pas.");
        }
    }

    public void afficherProduits() {
        System.out.println("Liste des produits :");
        for (Produit produit : produits.values()) {
            System.out.println(produit);
        }
    }
}