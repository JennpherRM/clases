import java.util.Scanner;

public class Persona {
    private String nombre;
    private char sexo;
    private double peso;
    private double altura;
    private int edad;
    private String rfc;

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void getNombre()
    {
        return nombre;
    }

    public void setPeso( double peso){
        this.peso=peso;
    }
    public void getPeso(double peso){
        return peso;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    public void getAltura(double altura){
        return altura;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void getEdad(int edad){
        return edad;
    }
    public void setRfc(String rfc){
        this.rfc=rfc;
    }
    public void getRfc(String rfc){
        return rfc;
    }



    public int calcularImc(){
        double imc = peso / Math.pow(altura,2);
        int res = 0;
        if (imc<20){
            res= -1;
        }else if (imc >=20 && imc <=25){
            res= 0;
        } else {
            res=1;
        }
        return res;
    }
    
    public boolean esMayordeEdad(){
        boolean mayor = false;
        if(edad>=18) 
            mayor=true;
        
        return mayor;
    }

    public toString(){
        System.out.println("Nombre"+nombre+
            "\n sexo:"+sexo+
            "\n RFC:"+rfc+
            "\n peso:"+peso+
            "\n altura:"+altura+
            "\n edad:"+edad);
        }
            public static void main(String[] args) {
                Persona persona1 =new Persona();
                System.out.println("Ingresa tu nombre ");
                Scanner
        
            
    }