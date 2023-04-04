package org.example;

public class MaDemoClassChaises extends Chaises {

    public static void MaDemoClassChaises() {

        Chaises chaises = new Chaises(0, 4, "bleue", "bois");
        System.out.println( "Je suis une Chaise avec " + chaises.NbrPieds +" pieds et de couleur "+ chaises.Couleur);
        Chaises chaises1 = new Chaises(1, 4, "blanche","metal");
        System.out.println("Je suis une Chaise avec " + chaises1.NbrPieds +" pieds, en "+ chaises1.Materiaux + " et de couleur "+ chaises1.Couleur);
        Chaises chaises2 = new Chaises(2, 1, "blanche", "plexiglass");
        System.out.println("Je suis une Chaise avec " + chaises2.NbrPieds +" pieds, en "+ chaises2.Materiaux + " et de couleur "+ chaises2.Couleur);




    }
}
