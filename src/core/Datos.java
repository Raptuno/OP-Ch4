package core;
import java.util.*;

public class Datos {
	
	public void getSize(int [][]thing) {
		System.out.println(thing.length);
	}

	String[] sab= {"Chocolate", "Vainilla", "Fresa", "Oreo"};
	String[] semesters= {"Enero-Marzo", "Abril-Junio", "Julio-Septiembre", "Octubre-Diciembre"};
	int[] chocoVals= {111, 483, 471, 427};
	int[] vanillaVals= {192, 500, 355, 158};
	int[] sbVals= {289, 470, 474, 160};
	int[] oreoVals= {415, 114, 161, 308};
	
	int[][] valArrays= {chocoVals, vanillaVals, sbVals, oreoVals};
	
	HashMap<String, Integer> choco=new HashMap<>();
	HashMap<String, Integer> vanilla=new HashMap<>();
	HashMap<String, Integer> sberry=new HashMap<>();
	HashMap<String, Integer> oreo=new HashMap<>();
	
	Object [] o= {choco, vanilla, sberry, oreo};
}
