import java.util.HashMap;
import java.util.Map;

public class Personnemanager {

    private Map<String, Personne> personnes;

    public Personnemanager() {
        this.personnes = new HashMap<>();
    }

    public void ajouterPersonne(String id, String nom, String prenom, String num, String addresse, String ville) {
        Personne personne = new Personne(id, nom, prenom, num, addresse, ville);
        personnes.put(id, personne);
        System.out.println("Personne ajoutée : " + personne);
    }

    public void supprimerPersonne(String id) {
        if (personnes.containsKey(id)) {
            Personne personne = personnes.remove(id);
            System.out.println("Personne supprimée : " + personne);
        } else {
            System.out.println("La personne avec l'ID " + id + " n'existe pas.");
        }
    }

    public void afficherPersonnes() {
        System.out.println("Liste des personnes :");
        for (Personne personne : personnes.values()) {
            System.out.println(personnes);
        }
    }

}