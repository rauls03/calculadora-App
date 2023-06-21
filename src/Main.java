import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Consola = new Scanner(System.in);
        while (true) {
            System.out.println("**** Aplicacion Calculadora ****");//Nombre del App
           //mostramos menu
            MostrarMenu();
            try {
                var operacion = Integer.parseInt(Consola.nextLine());
                //Revisar que este dentro de las opciones mencionadas.
                if (operacion >= 1 && operacion <= 4) {
                // Ejecutamos la operacion deseada
                    EjecutarOperacion(operacion,Consola);
                } else if (operacion == 5) {// salir
                    System.out.println("Hasta pronto");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                }//fin switch
                // imprimir un salto antes de repartir el ciclo
                System.out.println();
            }// fin try
            catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }//fin while
    }//Fin main

    private static void MostrarMenu(){
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    """);// menu
        System.out.println("Selecione una operacion: ");
    }
    private static void EjecutarOperacion(int operacion, Scanner Consola){
        System.out.print("Proporciona valor Operando1: ");// pedir al usuario el valor
        var Operando1 = Double.parseDouble(Consola.nextLine());//lo que el usiario escriba en consola se va almacenar en la variable de operando1
        System.out.print("proporciona valor operando2: ");//pedir al usuario el valor
        var Operando2 = Double.parseDouble(Consola.nextLine());
        double Resultado;
        switch (operacion) {
            case 1 -> {// Suma
                Resultado = Operando1 + Operando2;
                System.out.println("Resultado de la suma es: " + Resultado);
            }
            case 2 -> {// Resta
                Resultado = Operando1 - Operando2;
                System.out.println("Resultado de la resta es: " + Resultado);
            }
            case 3 -> {// Multiplicacion
                Resultado = Operando1 * Operando2;
                System.out.println("Resultado de la multiplicacion es: " + Resultado);
            }
            case 4 -> {// division
                Resultado = Operando1 / Operando2;
                System.out.println("Resultado de la division es: " + Resultado);
            }
            default -> System.out.println("Opcion erronea: " + operacion);
        }
    }
}// Fin clase