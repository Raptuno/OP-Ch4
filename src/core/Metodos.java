package core;
import java.util.*;

public class Metodos {
	
	public static void hashMapInit(HashMap<String, Integer> hm, String[] sms, int[] vals) {
		for (int i=0; i<hm.getClass().getConstructors().length; i++) {
			System.out.println("Constructor "+(i+1)+": "+hm.getClass().getConstructors()[i]);
		}
		for(int i=0; i<sms.length; i++) {
			
		}
	}
	
	public void printer(int[][] vals, String[] sab, String[] sms) {
		for(int i=0; i<vals.length; i++) {
			for(int j=0; j<vals.length; j++) {
				System.out.println("Ventas "+sab[i]+" del semestre "+sms[j]+": "+vals[i][j]);
			}
		}
	}
	
	public static void main(String[] args) {
		Datos s=new Datos();
		Metodos m=new Metodos();
		//hashMapInit(s.choco, s.semesters, s.valArrays);
		
		/*for(int i=0; i<s.chocoVals.length; i++) {
			s.choco.put(s.semesters[i], s.chocoVals[i]);
		}*/
		for (String sms : s.semesters) {
			for(int val : s.chocoVals) {
				System.out.println(sms+": "+val);
			}
		}
		System.out.println("Variable choco: "+s.choco);
	}
}
