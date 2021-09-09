package Ejercicio_16;

import java.util.Scanner;

public class Text16 {

    public static void main(String[] args) {

        //Objetos
        Scanner informacion = new Scanner(System.in);
        Personas persona_1 = new Personas();
        Personas persona_2 = new Personas();
        Personas persona_3 = new Personas();

        //Variables
        String nombre="";
        double edad=0;
        String sexo ="H";
        double peso=0;
        double altura =0;
        String nombre_2="";
        double edad_2=0;
        String sexo_2 ="H";
        double peso_2=0;
        double altura_2 =0;
        String nombre_3="";
        double edad_3=0;
        String sexo_3 ="H";
        double peso_3=0;
        double altura_3 =0;

        //Ingresar informacion persona_1
        System.out.println("Persona_1 Por favor ingrese su nombre");
        nombre = informacion.nextLine();
        System.out.println("Persona_1 Por favor ingrese su edad");
        edad = informacion.nextDouble();
        System.out.println("Persona_1  favor ingrese su sexo");
        sexo = informacion.next();
        System.out.println("Persona_1 favor ingrese su peso");
        peso = informacion.nextDouble();
        System.out.println("Persona_1 favor ingrese su altura");
        altura = informacion.nextDouble();

        //Ingresar informacion persona_2
        System.out.println("Persona_2 Por favor ingrese su nombre");
        nombre_2 = informacion.next();
        System.out.println("Persona_2 Por favor ingrese su edad");
        edad_2 = informacion.nextDouble();
        System.out.println("Persona_2  favor ingrese su sexo");
        sexo_2 = informacion.next();
        System.out.println("Persona_2 favor ingrese su peso");
        peso_2 = informacion.nextDouble();
        System.out.println("Persona_2 favor ingrese su altura");
        altura_2 = informacion.nextDouble();

        //Ingresar informacion persona_3
        System.out.println("Persona_3 Por favor ingrese su nombre");
        nombre_3 = informacion.next();
        System.out.println("Persona_3 Por favor ingrese su edad");
        edad_3 = informacion.nextDouble();
        System.out.println("Persona_3  favor ingrese su sexo");
        sexo_3 = informacion.next();
        System.out.println("Persona_3 favor ingrese su peso");
        peso_3 = informacion.nextDouble();
        System.out.println("Persona_3 favor ingrese su altura");
        altura_3 = informacion.nextDouble();



        //Datos a objeto persona_1
        persona_1.setNombre(nombre);
        persona_1.setEdad(edad);
        persona_1.setSexo(sexo);
        persona_1.setPeso(peso);
        persona_1.setAltura(altura);

        //Datos a objeto persona_2
        persona_2.setNombre(nombre_2);
        persona_2.setEdad(edad_2);
        persona_2.setSexo(sexo_2);
        persona_2.setPeso(peso_2);
        persona_2.setAltura(altura_2);


        //Datos a objeto persona_3
        persona_3.setNombre(nombre_3);
        persona_3.setEdad(edad_3);
        persona_3.setSexo(sexo_3);
        persona_3.setPeso(peso_3);
        persona_3.setAltura(altura_3);

        //IMC para persona_1
        if(persona_1.CalcularIMC()==-1) {
            System.out.println("Persona_1 esta por debajo de su peso ideal");
        };
        if(persona_1.CalcularIMC()==0) {
            System.out.println("Persona_1 esta en su peso ideal");
        };
        if(persona_1.CalcularIMC()==1) {
            System.out.println("Persona_1 esta por encima de su peso ideal");
        };

        //IMC para persona_2
        if(persona_2.CalcularIMC()==-1) {
            System.out.println("Persona_2 esta por debajo de su peso ideal");
        };
        if(persona_2.CalcularIMC()==0) {
            System.out.println("Persona_2 esta en su peso ideal");
        };
        if(persona_2.CalcularIMC()==1) {
            System.out.println("Persona_2 esta por encima de su peso ideal");
        };
        //IMC para persona_3
        if(persona_3.CalcularIMC()==-1) {
            System.out.println("Persona_3 esta por debajo de su peso ideal");
        };
        if(persona_3.CalcularIMC()==0) {
            System.out.println("Persona_3 esta en su peso ideal");
        };
        if(persona_3.CalcularIMC()==1) {
            System.out.println("Persona_3 esta por encima de su peso ideal");
        };

        //Mayor de edad personas_1
        if(persona_1.esMayorDeEdad() == true){
            System.out.println("La persona_1 es mayor de edad");
        }

        //Mayor de edad personas_2
        if(persona_2.esMayorDeEdad() == true){
            System.out.println("La persona_2 es mayor de edad");
        }
        //Mayor de edad personas_3
        if(persona_3.esMayorDeEdad() == true){
            System.out.println("La persona_3 es mayor de edad");
        }

        //informacion persona_1
        persona_1.informacion();

        //informacion persona_2
        persona_2.informacion();

        //informacion persona_3
        persona_3.informacion();
    }



}
