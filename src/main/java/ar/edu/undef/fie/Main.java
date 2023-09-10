package ar.edu.undef.fie;

public class Main {
    public static void main(String[] args) {

        int [] arreglo = {4, 3, 7, 8, 2, 1};

        int min = arreglo[0];
        int max = arreglo[0];


        for (var numero : arreglo){
            if (numero > max){
                max = numero;
            } if (numero < min){
                min = numero;
            }

        }
        System.out.println("Minimo: " + min);
        System.out.println("Maximo: " + max);

    }
}

/*
Definir el arreglo adentro del código. Encontrar el máximo y el minimo
 */
