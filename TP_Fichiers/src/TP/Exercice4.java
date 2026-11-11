package TP;
import java.io.*;
import java.util.*;
public class Exercice4 {

	public static void main(String[] args) throws Exception {
		ArrayList<Produit> liste= new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("C:/tp_fichiers/produits.txt"));
		String s;
		while((s=br.readLine())!=null){
			String[] r=s.split(";");
        	int num=Integer.parseInt(r[0]);
        	String designation=r[1];
        	float prix= Float.parseFloat(r[2]);
        	
        	liste.add(new Produit(num,designation,prix));
		}
		br.close();
	}

}
