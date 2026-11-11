package TP;

import java.io.*;

public class Exercice3 {

    static void copierAvecNumeros(String source, String dest) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(source));
        BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
        String s;
        int num = 1;
        while ((s = br.readLine()) != null) {
            bw.write(num + ": " + s);
            num++;
            bw.newLine();
        }
        br.close();
        bw.close();
    }

    static long copierBinaire(String source, String dest) throws Exception {
        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(dest);
        int c;
        long nboct = 0;
        while ((c = fis.read()) != -1) {
            fos.write(c);
            nboct++;
        }
        fis.close();
        fos.close();
        return nboct;
    }

    public static void main(String[] args) throws Exception {
        String original = "C:\\tp_fichiers\\produits.txt";
        String copieNum = "C:\\tp_fichiers\\produits_num.txt";
        String copieBinaire = "C:\\tp_fichiers\\archives\\produits_copie.txt";

        copierAvecNumeros(original, copieNum);
        copierBinaire(original, copieBinaire);

        System.out.println(new File(copieNum).length());
        System.out.println(new File(copieBinaire).length());
    }
}