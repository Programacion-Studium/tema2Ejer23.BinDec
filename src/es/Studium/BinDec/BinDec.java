package es.Studium.BinDec;

import java.util.Scanner;

public class BinDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Introduzca el Binario");
		String cad = teclado.next();
		teclado.close();
		
		String[] parts = cad.split("", 5);
		String part1 = parts[0]; 
		String part2 = parts[1]; 
		String part3 = parts[2];
		String part4 = parts[3];
		String part5 = parts[4];
		
		int a = Integer.parseInt(part5);
		int b = Integer.parseInt(part4);
		int c = Integer.parseInt(part3);
		int d = Integer.parseInt(part2);
		int e = Integer.parseInt(part1);
		
		System.out.println("El numero introducio convertido a decimal es "+FuncConv(a,b,c,d,e));
		
		
	}
	public static int FuncConv(int a, int b, int c, int d, int e)
	{
		return (e*16)+(d*8)+(c*4)+(b*2)+(a*1);
	}
}
