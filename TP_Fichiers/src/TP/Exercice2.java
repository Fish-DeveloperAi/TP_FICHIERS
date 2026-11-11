package TP;

import java.io.*;

public class Exercice2 {

    public static void main(String[] args) throws IOException {
        PrintWriter f = new PrintWriter(new File("C:/tp_fichiers/produits.txt"));

        f.println("1;Ordinateur;5600.0");
        f.println("2;Imprimante;1200.5");
        f.println("3;Clavier;150.0");
        f.println("4;Ecran;1800.0");

        f.close();
        
        BufferedReader br = new BufferedReader(new FileReader("C:/tp_fichiers/produits.txt"));
        String s;
        int id;
        String nom;
        double prix;
        double prix_total=0;
        int nbProduit=0;
        double prix_max=0;
        while ((s = br.readLine()) != null) {
        	String[] r=s.split(";");
        	id=Integer.parseInt(r[0]);
        	nom=r[1];
        	prix=Double.parseDouble(r[2]);
        	nbProduit++;
        	
        	System.out.println(id+"-- "+nom+" -- "+prix+" DH");
        	prix_total+=prix;
        	if(prix_max<prix) {
        		prix_max=prix;
        	}
        }
        System.out.println("Produits : "+nbProduit+" Prix total : "+prix_total+" DH Plus cher : "+prix_max+" DH");
        br.close();
        FileWriter fw = new FileWriter("C:/tp_fichiers/produits.txt",true);
        fw.write("5;Souris;80.0 \n");
        fw.close();
        FileReader fr = new FileReader("C:/tp_fichiers/produits.txt");
        int c;
        int nbLigne=0;
        int nbCar=0;
        while((c=fr.read())!=-1) {
        	nbCar++;
        	if(c=='\n') {
        		nbLigne++;
        	}
        }
        System.out.println("Nombre de Caractere : "+nbCar+" Nombre de ligne : "+nbLigne);
    }
}