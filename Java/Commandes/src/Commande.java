import java.time.LocalDate;
import java.util.ArrayList;

public class Commande {
    private int id;
    private LocalDate date;
    private boolean type = false; // 1 = express | 0 = normale
    private boolean payee;
    private Client client;

    private static int staticID = 0;

    Commande(LocalDate date, boolean type, boolean payee, Client client) {
        this.id = staticID + 1;
        this.date = date;
        this.type = type;
        this.payee = payee;
        this.client = client;
    }

    int GetID() {
        return id;
    }

    LocalDate GetDate() {
        return date;
    }

    void SetDate(LocalDate date) {
        this.date = date;
    }

    boolean GetType() {
        return type;
    }

    void SetType(boolean type) {
        this.type = type;
    }

    boolean GetPyee() {
        return payee;
    }

    void SetPayee(boolean payee) {
        this.payee = payee;
    }

    Client GetClient() {
        return client;
    }

    void SetPayee(Client client) {
        this.client = client;
    }

    double calculTotalComande(ArrayList<LigneCommande> ligneCommandeList) {
        double totale = 0;
        for (LigneCommande ligneCommande : ligneCommandeList) {
            totale = totale + ligneCommande.calculTotalProduit();
        }
        return totale;
    }
}