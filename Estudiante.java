import java.util.Scanner;
public class Estudiante {

        //Atributos
	String nombre;
	double anioN;
	short annioNacimiento;
    public short ANNIO=2019;

    public double obtenerEdad(){
        return ANNIO-anioN;
    }

    public String toString(){
        return "Nombre "+nombre+"\edad"+obtenerEdad()+"\"
    }
    //Metodos 
    
    
    /* public double sumarNumeros(){
        return a + b;
    }

    public double restarNumeros(){
        return a - b;
    }

    public double mulktiplicarNumeros(){
        return a * b;
    }
 
    public static void main(String[]args){
        Operaciones operaciones1= new Operaciones();

        Scanner scanner= new Scanner(System.in);

         System.out.println("Numero 1:");
         operaciones1.a = scanner.nextDouble();

         System.out.println("Numero 2:");
         operaciones1.b = scanner.nextDouble(); 


       double suma= operaciones1.sumarNumeros();

        System.out.println("El resultado es " + suma);*/

    }
}