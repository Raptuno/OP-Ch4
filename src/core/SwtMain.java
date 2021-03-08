package core;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import java.util.*;

public class SwtMain {

	protected Shell shlReto4;
	private Datos s;
	private Metodos hmi;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SwtMain window = new SwtMain();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlReto4.open();
		shlReto4.layout();
		while (!shlReto4.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		s=new Datos();
		hmi=new Metodos();
		shlReto4 = new Shell();
		shlReto4.setSize(450, 300);
		shlReto4.setText("Reto 4");
		
		hmi.printer(s.valArrays, s.sab, s.semesters);
	}

}
