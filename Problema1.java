import javax.swing.JOptionPane;

public class Problema1 {
	
	public static void main(String[] args) {

        //Declaramos una constante
        final double IVA=0.20;
         
      
        String texto=JOptionPane.showInputDialog("¿Cual es el precio del producto?");
        //Pasamos el String a double
        double precio=Double.parseDouble(texto);

        //Obtenemos el precio final (precio+(precio*IVA))
        double precioFinal=precio+(precio*IVA);

        System.out.println("El precio es: "+precioFinal);
    }
}
