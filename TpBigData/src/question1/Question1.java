package question1;

import java.io.*;
import java.util.*;

public class Question1 {

	String path= "E:\\Dev\\BigData\\u.data";
	String line;
	BufferedReader br;
	int cpt1=0,cpt2=0,cpt3=0,cpt4=0,cpt5=0;
	Scanner sc;
	
	public void doJob() throws IOException{
		System.out.println("\nStarting count");
		try {
			br = new BufferedReader(new FileReader(path));
			while(br.ready()){
				line = br.readLine();
				if(line.contains("\t1\t"))
					cpt1++;					
				if(line.contains("\t2\t"))
					cpt2++;				
				if(line.contains("\t3\t"))
					cpt3++;										
				if(line.contains("\t4\t"))
					cpt4++;
				if(line.contains("\t5\t"))
					cpt5++;					
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("\nNb de film ayant 1 étoile : "+cpt1
					+"\nNb de film ayant 2 étoile : "+cpt2
					+"\nNb de film ayant 3 étoile : "+cpt3
					+"\nNb de film ayant 4 étoile : "+cpt4
					+"\nNb de film ayant 5 étoile : "+cpt5);
			
			int cptTotal = cpt1+cpt2+cpt3+cpt4+cpt5;
			System.out.println("\nNb de films testes : "+cptTotal);
			
		}
	}
}
