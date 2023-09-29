package com.vega.arian.lab1.views;

import com.vega.arian.lab1.controllers.EmpleadoController;

public class EmpleadoView {
	public static void main(String args[]) {
		// System.out.println(new EmpleadoController().createEmpleado("Haznovicj González", "Angela Ivanoa", (byte) 25,
		//		"Femenino", 4900.12));
		// System.out.println(new EmpleadoController().readEmpleado(1));
		// System.out.println(new EmpleadoController().updateEmpleado(1, "Kuznetsova Smirnovna", "Tatiana Ivanovna",
		//		(byte) 24, "Femenino", 5900.45));
		System.out.println(new EmpleadoController().deleteEmpleado(1));
	}
}
