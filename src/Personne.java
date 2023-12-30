public class Personne {
    private String num, nom, prenom, ville;
    private String addresse;
    private String id;


    public Personne(String num, String nom, String prenom, String ville, String addresse, String id) {
        this.num = num;
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.addresse = addresse;
        this.id = id;
    }

    public String toString() {
        return "num: " + num + ", nom: " + nom + ", prenom: " + prenom + "ville :" + ville + "addresse:" + addresse;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getnum() {
        return num;
    }

    public void setnum(String num) {
        this.num = num;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;}
    public String getville() {
        return ville;
    }
    public String getAddresse() {
        return addresse;
    }
    public void setville(String ville) {
        this.ville = ville;}
    public void setAddresse(String addresse) {
        this.addresse = addresse;}
}
