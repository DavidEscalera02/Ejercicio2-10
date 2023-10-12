package Ejercicio10;

public class Main {
    public static void main(String[] args) {
        Suma suma1 = new Suma();
        int sumadevalores= suma1.sumar(1,5);
        System.out.println("la suma de varios metodos es :"+sumadevalores);
        int sumaenteros= suma1.sumar(3,5,6);
        System.out.println("la suma de enteros es :"+sumaenteros);
       double sumadecimales=suma1.sumar(2.5,3.5);
        System.out.println("la suma con decimales es:"+sumadecimales);
        double sumaNdecimales=suma1.sumar(3.5,3.6,5.5);
        System.out.println("la suma de varios numeros con decimales es:"+sumaNdecimales);


    }
}
