package org.example;

public class Chaises {



    public Chaises(int id, int nbrPieds, String couleur, String materiaux) {
        this.id = id;
        NbrPieds = nbrPieds;
        Couleur = couleur;
        Materiaux = materiaux;
    }

    public Chaises() {
    this.id = counter;
    }

    protected int id;

    protected int NbrPieds;

    protected String Couleur;

    protected String Materiaux;

    private static int counter = 0;

    {
        ++counter;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Chaises.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbrPieds() {
        return NbrPieds;
    }

    public void setNbrPieds(int nbrPieds) {
        NbrPieds = nbrPieds;
    }

    public String getCouleur() {
        return Couleur;
    }

    public void setCouleur(String couleur) {
        Couleur = couleur;
    }

    public String getMateriaux() {
        return Materiaux;
    }

    public void setMateriaux(String materiaux) {
        Materiaux = materiaux;
    }

    public void queSuisje(){
        System.out.println("Je suis une chaise");
    }
    @Override
    public String toString() {
        return "Chaises{" +
                "id=" + id +
                ", NbrPieds=" + NbrPieds +
                ", Couleur='" + Couleur + '\'' +
                ", Materiaux='" + Materiaux + '\'' +
                '}';
    }
}
