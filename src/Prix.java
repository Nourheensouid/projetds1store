public class Prix {
    private String typeOp;
    private double montant;
    private Date dateOp;

    public Prix(String typeOp, double montant, Date dateOp) {
        this.typeOp = typeOp;
        this.montant = montant;
        this.dateOp = dateOp;
    }

    public String toString() {
        return "[" + typeOp + " , " + montant + " DT , " + dateOp.toString() + "]";
    }

    public String getTypeOp() {
        return typeOp;
    }

    public void setTypeOp(String typeOp) {
        this.typeOp = typeOp;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDateOp() {
        return dateOp;
    }

    public void setDateOp(Date dateOp) {
        this.dateOp = dateOp;
    }

}