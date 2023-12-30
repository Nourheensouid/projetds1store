import java.util.Scanner;

public class Main {

    private Produitmanager produitManager;
    private Commandemanager commandeManager;

    public Main(Produitmanager produitManager, Commandemanager commandeManager) {
        this.produitManager = produitManager;
        this.commandeManager = commandeManager;
    }

    public void afficherMenuClient() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Client Interface - Menu");
            System.out.println("1. Afficher produits");
            System.out.println("2. Passer une commande");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option : ");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    produitManager.afficherProduits();
                    break;
                case 2:
                    passerCommande(scanner);
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }

    private void passerCommande(Scanner scanner) {
        System.out.print("Entrez l'ID du produit que vous souhaitez commander : ");
        String produitId = scanner.next();

        System.out.print("Entrez la quantité souhaitée : ");
        int quantite = scanner.nextInt();

        commandeManager.ajouteComm(produitId, quantite);
    }
        public static void main(String[] args) {
        Produitmanager produitManager = new Produitmanager();
        Commandemanager commandeManager = new Commandemanager();

        Main clientInterface = new Main(produitManager, commandeManager);
        clientInterface.afficherMenuClient();
    }
}

