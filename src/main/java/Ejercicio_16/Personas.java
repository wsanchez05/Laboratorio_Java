package Ejercicio_16;

public class Personas {

    private String nombre;
    private double edad;
    private String DNI;
    private String Sexo;
    private double peso;
    private double altura;
    private double indice;
    private final char[] letras = {  'T', 'R', 'W',
                                  'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                                 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
                                 'V', 'H', 'L', 'C', 'K', 'E'};

    public Personas(String nombre, double edad, String DNI, String sexo, double peso, double altura)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        Sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Personas() {
    }

    public Personas(String nombre, double edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        Sexo = sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.Sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int CalcularIMC()
    {
        int variable=0;
        indice = (this.peso)/(Math.pow(this.altura,2));
        if(indice<20)
        { variable = -1;}
        if(indice>=20 && indice<=25)
        { variable = 0;}
        if(indice>25)
        { variable = 1;}

        return  variable;
    }

    public boolean esMayorDeEdad()
    {
        boolean mayorEdad= false;

        if(this.edad >= 18)
        {
            mayorEdad = true;
        }
        return mayorEdad;
    }

    public String comprobarSexo()
    {
        String sex = "H";
        if(this.Sexo =="H" || this.Sexo == "M")
        {
            sex = this.Sexo;
        }
        return sex;
    }
    public void informacion()
        {
            System.out.println("Información ingresada ");
            System.out.println("Nombre: "+ this.nombre);
            System.out.println("edad: " + this.edad);
            System.out.println("Sexo: " +this.Sexo);
            System.out.println("Peso: " +this.peso);
            System.out.println("Altura: " + this.altura);
            System.out.println("Indice: " +CalcularIMC());
        }

    public void generarDNI()
    {
        int num = (int) (100000000 * Math.random());
        int resto = num % 23;
        this.DNI = "" + num + "" + letras[resto];
    }
}
