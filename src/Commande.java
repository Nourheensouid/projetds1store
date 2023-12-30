import java.util.Date;

public class Commande {

    private Date datecomm;
    private String statut;
    private int quantite;
    private String produitid;

    public Commande(Date datecomm, String statut, int quantite, String produitid) {
        this.datecomm = datecomm;
        this.statut = statut;
        this.quantite = quantite;
        this.produitid = produitid;
    }

    public Date getDatecomm() {
        return datecomm;
    }

    public String getProduitid() {
        return produitid;
    }

    public void setProduitid(String produitid) {
        this.produitid = produitid;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setDatecomm(Date datecomm) {
        this.datecomm = datecomm;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "datecomm=" + datecomm +
                ", statut='" + statut + '\'' +
                ", quantite=" + quantite +
                ", produitid='" + produitid + '\'' +
                '}';
    }
}
