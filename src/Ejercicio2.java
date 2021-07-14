/*Enunciado Ejercicio 2:
    Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar
    en otra matriz. Los valores y la longitud, seran insertados por el usuario. 
    Mostrar las matrices originales y el resultado.
*/

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);

        //Leemos el tamaño de las matrices todas de nxn: n filas x n columnas
        System.out.println("Ingrese el tamaño de las matrices: ");
        int n =  lector.nextInt();

        //Creamos las matrices de tamaño nxn
        int [][] mt1 = new int[n][n]; //Matriz 1
        int [][] mt2 = new int[n][n];//Matriz 2
        int [][] mtResultado = new int[n][n];//Matriz que alamacenara el resultado de la suma de las matrices 1 y 2

        //Llenamos con datos la matriz 1 y 2
        System.out.println("Ingresando los datos de la matriz 1");
        for(int fila = 0;fila<n;fila++){
            for(int col=0;col<n;col++){
                System.out.printf("Datos de la posición [%s][%s]: ",fila,col);
                mt1[fila][col]=lector.nextInt();
            }
        }

        System.out.println("Ingresando los datos de la matriz 2");
        for(int fila = 0;fila<n;fila++){
            for(int col=0;col<n;col++){
                System.out.printf("Datos de la posición [%s][%s]: ",fila,col);
                mt2[fila][col]=lector.nextInt();
            }
        }

        //Procedemos a realizar la suma de la matriz 1 (mt1) y la matriz 2 (mt2)
        for(int fila = 0;fila<n;fila++){
            for(int col=0;col<n;col++){
                mtResultado[fila][col] = mt1[fila][col] + mt2[fila][col];
            }
        }


        //Mostrando los datos la matriz 1 y 2
        System.out.println("Datos de la matriz 1 (mt1)");
        for(int fila = 0;fila<n;fila++){
            for(int col=0;col<n;col++){
                System.out.print(mt1[fila][col]+" ");
            }
            System.out.println("");
        }

        System.out.println("Datos de la matriz 2 (mt2)");
        for(int fila = 0;fila<n;fila++){
            for(int col=0;col<n;col++){
                System.out.print(mt2[fila][col]+" ");
            }
            System.out.println("");
        }

        //Mostrando los datos de la matriz resultado de la suma de matrices
        System.out.println("Datos de la matriz resultado de la suma de las matrices mt1 + mt1");
        for(int fila = 0;fila<n;fila++){
            for(int col=0;col<n;col++){
                System.out.print(mtResultado[fila][col]+" ");
            }
            System.out.println("");
        }
    }
}
