package examen;
import java.util.Scanner;
import java.util.Arrays;
public class examen {
//egunon
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int numTrabajador = 0;
		
		
		System.out.println("Introduzca el numero de trabajadores de la empresa: ");
		numTrabajador = sc.nextInt();
		
		String[] nombreTrabajador = new String[numTrabajador];
		int[] antiguedadTrabajador = new int[numTrabajador];
		String[] oficioTrabajador = new String[numTrabajador];
		
		int sumaAntiguedad = 0;
		
	
		int media;
		
		//variable para buscar el de menor antiguedad
		String elMenosAntiguo = " ";
		int menor = 1000;
		
		//lo mismo para buscar el de mayor anitiguedad
		String elMasAntiguo = " ";
		int mayor = -1;
		
		for(int i = 0; i < numTrabajador; i++) {
			
			System.out.println("introduzca el nombre: " + i);
			nombreTrabajador[i] = sc.next();
			
			System.out.println("introduzca la antiguedad: " + i);
			antiguedadTrabajador[i] = sc.nextInt();
			//busco el menor
			if (menor > antiguedadTrabajador[i]) {
				elMenosAntiguo = nombreTrabajador[i];
				menor = antiguedadTrabajador[i];
			//busco el mayor
			} else if (mayor < antiguedadTrabajador[i]) {
				elMasAntiguo = nombreTrabajador[i];
				mayor = antiguedadTrabajador[i];
			}
			//la suma de la antiguedad de todos los empleados
			sumaAntiguedad = sumaAntiguedad + antiguedadTrabajador[i];
			
			System.out.println("introduzca el oficio : " + i);
			oficioTrabajador[i] = sc.next();
			//por cada iteracion muestro todos los datos de los trabajadores
			System.out.println("Los datos del trabajador/a son (nombre-edad-oficio): " + nombreTrabajador[i]+ "-" + antiguedadTrabajador[i] + "-" + oficioTrabajador[i]);
			
		} 
		
		System.out.println(sumaAntiguedad);
		System.out.println(numTrabajador);
		
		//calculo la media, suma de la antiguedad de todos entre el numero de trabajadores totales
		media = sumaAntiguedad / numTrabajador;
		
		System.out.println("El trabajador con mayor antiguedad es: " + elMasAntiguo + " y tiene "+ mayor + " años de oficio");
		System.out.println("El trabajador con menor antiguedad es: " + elMenosAntiguo + " y tiene "+ menor + " años de oficio");
		System.out.println("La media de la antiguedad de la empresa es: " + media);
		
		
		String input;
		System.out.println("El numero de trabajadores de que oficio quieres mostrar?");
		input = sc.next();
		int cantidad = 0;
		boolean existe = false;
		for(int i = 0; i < oficioTrabajador.length; i++ ) {
			
			existe = input.equalsIgnoreCase(oficioTrabajador[i]);
			
			if (existe == true){
				cantidad ++;
			} 
		}
		
		//muestro la cantidad del oficio consultado
		System.out.println("El numero de trabajadores del oficio " + input + " es: " + cantidad);
		
		//saco los oficios de los trabajadores y la cantidad por cada uno
		System.out.println("Los oficios de los trabajadores son lo siguientes: ");
		
		for (int j = 0; j < numTrabajador; j++) {
			System.out.println(oficioTrabajador[j]);

		
		}
		
	
	}
}
