/*
Enunciado Ejercicio 3:
    Nos piden crear una matriz de 4×4 de números enteros que inicialmente esta vacía,
    nos piden hacer un menú con estas opciones:

        1. Rellenar TODA la matriz de números, debes pedírselo al usuario.
        2. Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
        3. Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
        4. Sumar la diagonal principal (ver ejemplo)
        5. Sumar la diagonal inversa (ver ejemplo)
        6. La media de todos los valores de la matriz
        7. Salir
    Nota: El programa dejara de ejecutarse cuando el usuario lo indique
*/

import java.util.Scanner;
public class Ejercicio3 {
    
    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);
        int [][] datos = new int[4][4];
        byte opc;
        do{
            System.out.println("**********************************************");
            System.out.println("\t       MENÚ PRINCIPAL");
            System.out.println("----------------------------------------------");
            System.out.println(" 1. Llenar matriz.");
            System.out.println(" 2. Sumar datos de una fila.");
            System.out.println(" 3. Sumar datos de una columna.");
            System.out.println(" 4. Sumar datos de la diagonal Principal");
            System.out.println(" 5. Sumar datos de la diagonal inversa");
            System.out.println(" 6. Calcular media de los datos de la matriz");
            System.out.println(" 7. Salir");
            System.out.println("********************************************** \n");

            System.out.println("Elija una opción: ");
            opc = lector.nextByte();

            switch(opc){
                case 1:

                    System.out.println("Ingrese los datos de la matriz...");
                    for(int f=0;f<4;f++){
                        for(int c=0;c<4;c++){
                            System.out.printf("Ingrese el dato de la posición [%s][%s]: ",f,c);
                            datos[f][c] = lector.nextInt();
                            System.out.println("");
                        }
                    }
                    System.out.println("Datos ingresado con exito...");

                break;

                case 2:

                    System.out.println("Elija la fila [1-4] que desea mostrar su suma de datos: ");
                    byte fila = lector.nextByte();
                    if (fila>= 1 && fila <=4){
                        int sumatoria=0;
                        for(int c=0;c<4;c++){
                            sumatoria = sumatoria + datos[fila-1][c];
                        }
                        System.out.printf("Sumatoria de la fila #%s es: %s \n",fila,sumatoria);
                    }else{
                        System.out.println("La fila elegida no esta disponible, intente de nuevo...");
                    }

                break;

                case 3:

                    System.out.println("Elija lacolumna [1-4] que desea mostrar su suma de datos: ");
                    byte col = lector.nextByte();
                    if (col>= 1 && col <=4){
                        int sumatoria=0;
                        for(int f=0;f<4;f++){
                            sumatoria = sumatoria + datos[f][col-1];
                        }
                        System.out.printf("Sumatoria de la columna #%s es: %s \n",col,sumatoria);
                    }else{
                        System.out.println("La columna elegida no esta disponible, intente de nuevo...");
                    }

                break;

                case 4:

                    int sumatoria=0;
                    for(int f=0;f<4;f++){
                        for(int c=0;c<4;c++){
                            if(f == c){
                                sumatoria = sumatoria + datos[f][c];
                            }
                        }
                    }
                    System.out.printf("La suma de los datos de la diagonal principal es: %s",sumatoria);
                
                break;
                case 5:
                    int sumatoriads=0;
                    for(int f=0;f<4;f++){
                        for(int c=0;c<4;c++){
                            if(f+c == 3){
                                sumatoriads = sumatoriads + datos[f][c];
                            }
                        }
                    }
                    System.out.printf("La suma de los datos de la diagonal secundaria es: %s \n",sumatoriads);

                break;
                case 6:
                    int sumatoriaAll=0;
                    for(int f=0;f<4;f++){
                        for(int c=0;c<4;c++){
                            
                            sumatoriaAll = sumatoriaAll + datos[f][c];
                        }
                    }
                    System.out.printf("La suma de los datos de la diagonal secundaria es: %s \n",((float)sumatoriaAll/(float)16));

                break;
                case 7:
                System.out.println("Hasta Pronto...");
                break;
                default:
                    System.out.println("Opción invalida... Intente nuevamente");
            }


        }while(opc != 7);

    }
}
