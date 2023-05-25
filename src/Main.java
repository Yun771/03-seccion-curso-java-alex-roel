import  java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // ? variables
        //	String nombre;
        //	int a, b, c;
        //
        //	nombre = "Ever";
        //	int edad = 25;
        //
        //	a = 1;
        //	b = 2;
        //	c = 3;
        //
        //	System.out.println(nombre);
        //	System.out.println(edad);
        //
        //	edad = 26;
        //
        //	System.out.println(edad);
        //	System.out.println(a + b + c);
        //
        //
        // * nueva forma de declarar las variables
        //	var primerNombre = "Alex ";
        //	var segundoNombre = "Roel";
        //
        //	var misNombres = primerNombre + segundoNombre;

        // ? primitivos
        // byte edad = 26;
        // System.out.println(edad);
        //
        // long numeroGrandes = 213123L;
        // System.out.println(numeroGrandes);
        //
        // float nd = 3.5f;
        // System.out.println(numeroGrandes);
        //
        // char letra = 'a';
        // char codigo = 66;
        //
        // System.out.println(letra);
        // System.out.println(codigo);
        //
        // boolean opcion = true;
        // opcion	= false;
        //
        // System.out.println(opcion);
        //
        // ? Es un objeto
        // String nombreCompleto = "Alex Role";
        // System.out.println(nombreCompleto);

        // ? Operadores matematicos
        //        int a = 50;
        //        int b = 6;
        //        int c = 5;
        //
        //        System.out.println(a % b);
        //        System.out.println((a - b * c) / 4);
        //
        //
        //		a = 10;
        //		// 	a = a  + 5;
        //			//? simplificado
        //		a += 5;
        //
        //		System.out.println(a);

        // ? Operadores lógicos

        //        int a = 3;
        //        int b = 2;
        //
        //        System.out.println(a <= b);
        //
        //        // ? incremento y decremento
        //        int  c = 0;
        //
        //        c++;
        //        c++;
        //        c++;
        //        c++;
        //
        //        System.out.println(c);
        //
        //        c--;
        //        c--;
        //        c--;
        //        c--;
        //        c--;
        //        c--;
        //
        //        System.out.println(c);
        //            // ? predremento
        //        ++c;
        //        ++c;
        //        ++c;
        //        ++c;
        //        ++c;


        // ? Entrada de datos

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = leer.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad =  leer.nextInt();

        System.out.print("Ingrese un carácter: ");
        char c = leer.next().charAt(0);

        System.out.printf("Nombre: %s, Edad: %d\n" , nombre, edad);
        System.out.println("Caracter: " + c);






    }
}
