import java.util.Scanner;

public class PrecioVenta {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el valor de venta");
        double valor = leer.nextDouble();

        double iva = valor * 0.18;
        double pv = valor + iva;

        System.out.println("Valor de venta: " + valor);
        System.out.println("Iva: " + iva);
        System.out.println("Precio de venta: " + pv);

    }
}
