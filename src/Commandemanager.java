import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Commandemanager {

    private Map<String, Commande> commandes;
    private static int nextCommandeId = 1;

    public Commandemanager() {
        this.commandes = new HashMap<>();
    }

    public String ajouteComm(String produitId, int quantite) {
        String commandeId = "CMD" + nextCommandeId++;
        Commande nouvelleCommande = new Commande(new Date(), null, quantite, produitId);
        commandes.put(commandeId, nouvelleCommande);
        return commandeId;
    }

    public void supprimerComm(String commandeId) {
        if (commandes.containsKey(commandeId)) {
            Commande commandeSupprimee = commandes.remove(commandeId);
            System.out.println("Commande supprimée : " + commandeSupprimee);
        } else {
            System.out.println("La commande avec l'ID " + commandeId + " n'existe pas.");
        }
    }
}
