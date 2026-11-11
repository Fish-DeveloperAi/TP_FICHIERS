package TP;

import java.io.*;
public class Execrice1 {

	public static void main(String[] args) throws IOException{
		int nbRep=0;
		int nbF=0;
		File f = new File("C:\\tp_fichiers");
		if(!f.exists()) {
			f.mkdir();
		}
		System.out.println(f.getAbsoluteFile());
		
		File a = new File(f,"a.txt");
		File b = new File(f,"b.txt");
		a.createNewFile();
		b.createNewFile();
		
		File archives = new File(f,"archives");
		archives.mkdir();
		
		String[] l= f.list();
		for(int i=0;i<l.length;i++) {
			File fx = new File(f,l[i]);
			if(fx.isDirectory()) {
				System.out.println("[REP]"+fx.getName());
				nbRep++;
			}
			else {
				System.out.println("[FICHIER]"+fx.getName()+",");
				nbF++;
			}
			
		}
		System.out.println(nbF+"fichier(s),"+nbRep+"répertoire(s)");
	}

}
