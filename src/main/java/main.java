import Ejercicio_1.Comparador;
import Ejercicio_10.BorrarEspacios;
import Ejercicio_11.IndicarLongitud;
import Ejercicio_12.CompararFrases;
import Ejercicio_13.MostrarFecha;
import Ejercicio_14.ImprimirNumeros;
import Ejercicio_15.MostrarMenu;
import Ejercicio_16.Personas;
import Ejercicio_17.EjecutaElectrodomestico;
import Ejercicio_3.AreaCirculo;
import Ejercicio_4.PrecioProducto;
import Ejercicio_5.ParesImpares;
import Ejercicio_6.Par_ImparFor;
import Ejercicio_7.ComparadorCero;
import Ejercicio_8.DiaLaboral;
import Ejercicio_9.Reemplazar;

import java.util.Scanner;

public class main {

    public static void main(String[] args)
    {
        Scanner Entrada_1 = new Scanner(System.in);
        //Comparador compara_1 = new Comparador();
        System.out.println("Ingresa el ejercicio que desea mirar (del 1 al 18)");
        int opcion = Entrada_1.nextInt();

        switch (opcion)
        {
            case 1:
                Comparador compara = new Comparador();
                compara.comparar_numero(5,4);
                break;
            case 2:
                Scanner numero = new Scanner(System.in);
                Comparador comparar_2 = new Comparador();
                int numero_1;
                int numero_2;

                System.out.println("Ingrese el primer numero ");
                numero_1 = numero.nextInt();
                System.out.println("Ingrese el segundo numero ");
                numero_2 = numero.nextInt();

                comparar_2.comparar_numero(numero_1,numero_2);
                numero.close();

                break;
            case 3:
                double radio;
                double area;
                Scanner radios = new Scanner(System.in);
                AreaCirculo areacirculo  = new AreaCirculo();
                System.out.println("Ingrese el radio del Circulo");
                radio = radios.nextInt();
                areacirculo. area_circulo(radio);

                radios.close();

                break;
            case 4:
                Scanner numeroPrecio = new Scanner(System.in);
                PrecioProducto precio = new PrecioProducto();
                float valor =0;

                System.out.println("Por favor digite el precio del producto sin iva");
                valor = numeroPrecio.nextFloat();

                precio.precioProducto(valor);
                numeroPrecio.close();

                break;
            case 5:
                ParesImpares numeroParesImpares = new ParesImpares();
                numeroParesImpares.parimpar();
                break;

            case 6:
                Par_ImparFor numeroimparFor = new Par_ImparFor();
                numeroimparFor.parimpar();
                break;
            case 7:
                double numeroComparadorcero;
                ComparadorCero comparacero = new ComparadorCero();
                Scanner dato = new Scanner(System.in);
                do {
                    System.out.println("Ingrese un nunero mayor a cero");
                    numeroComparadorcero = Double.parseDouble(dato.nextLine());


                }while (numeroComparadorcero < 0);
                comparacero.comparar_numero(numeroComparadorcero);

                dato.close();

                break;
            case 8:
                Scanner datoDia = new Scanner(System.in);
                DiaLaboral dialaboral = new DiaLaboral();
                String dia = "";
                System.out.println("Ingrese por favor un dia de la semana");
                dia = datoDia.nextLine();
                dialaboral.CompararDia(dia);
                System.out.println(dia);

                datoDia.close();
                break;
            case 9:
                String fraseConcatena;
                Scanner palabra = new Scanner(System.in);

                System.out.println("ingrese frase a concatenar");
                fraseConcatena = palabra.nextLine();
                Reemplazar remplazo = new Reemplazar(fraseConcatena);
                remplazo.reemplazarLetraA();

                palabra.close();
                break;
            case 10:
                String frase;
                Scanner palabraFrase = new Scanner(System.in);

                System.out.println("ingrese frase");
                frase = palabraFrase.nextLine();
                BorrarEspacios remplazoEspacio = new BorrarEspacios(frase);
                System.out.println("La frase ingresada sin los espacios es: ");
                remplazoEspacio.borrarEspacio();

                palabraFrase.close();

                break;

            case 11:
                String fraseComparar;
                Scanner palabraComparaFrase = new Scanner(System.in);

                System.out.println("ingrese frase");
                fraseComparar = palabraComparaFrase.nextLine();
                IndicarLongitud cantidad = new IndicarLongitud(fraseComparar);
                System.out.println("La longitud de la frase ingresada es: " + cantidad.indicarLongitud());
                System.out.println("La cantidad de vocales es: " + cantidad.contarVocales());

                palabraComparaFrase.close();
                palabraComparaFrase.close();

                break;
            case 12:

                Scanner fraseCompara = new Scanner(System.in);
                String frase_1 = "";
                String frase_2 = "";


                System.out.println("ingrese frase 1");
                frase_1 = fraseCompara.nextLine();
                System.out.println("ingrese frase 2");
                frase_2 = fraseCompara.nextLine();
                CompararFrases entrada = new CompararFrases(frase_1,frase_2);
                entrada.comparaFrases();
                fraseCompara.close();
                break;

            case 13:

                MostrarFecha fecha = new MostrarFecha();
                System.out.println("La fecha de hoy (yyyy/MM/dd hh:mm) es: ");
                fecha.fecha();

                break;

            case 14:

                int numeroimprimir = 0;
                Scanner datoImprimir = new Scanner(System.in);
                System.out.println("Ingrese un numero");
                numeroimprimir = datoImprimir.nextInt();
                ImprimirNumeros imprimirnumero = new ImprimirNumeros(numeroimprimir);
                imprimirnumero.imprimir();
                datoImprimir.close();
                    break;
            case 15:
                MostrarMenu opcionMenu = new MostrarMenu();
                opcionMenu.opcionesmenu();

                break;

            case 16:
                InfoPerson();
                break;

            case 17:
                EjecutaElectrodomestico electro = new EjecutaElectrodomestico();
                electro.ArregloElectrodomestico();
                electro.PrecioElectrodomesticos();
                break;
        }
    }

    public static void InfoPerson()
    {
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
        persona_2.setPeso(100);
        persona_2.setAltura(1.5);


        //Datos a objeto persona_3
        persona_3.setNombre("William");
        persona_3.setEdad(28);
        persona_3.setSexo("H");
        persona_3.setPeso(74);
        persona_3.setAltura(1.72);

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
        }else System.out.println("La persona_1 es menor de edad");

        //Mayor de edad personas_2
        if(persona_2.esMayorDeEdad() == true){
            System.out.println("La persona_2 es mayor de edad");
        } else System.out.println("La persona_2 es menor de edad");

        //Mayor de edad personas_3
        if(persona_3.esMayorDeEdad() == true){
            System.out.println("La persona_3 es mayor de edad");
        } else System.out.println("La persona_3 es menor de edad");

        //informacion persona_1
        persona_1.informacion();

        //informacion persona_2
        persona_2.informacion();

        //informacion persona_3
        persona_3.informacion();

    }
}
