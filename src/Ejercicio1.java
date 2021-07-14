/*
Se da solución al Ejercicio que se encuentra en el archivo word llamado
Sesión Practica #3.docx. Alojado en la carpeta principal
*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);

        /*Creamos el vector de codigos y las matricees en donde se encuentran los datos 
        de las tablas en el enunciado*/
        /*
            Debido a que los códigos de los productos son numero enteros de
            a lo sumo 3 digitos y caen perfectamente en el rango de número que pueden
            alamcenar los datos enteros de tipo short, y con el fin de optimizar recursos
            en este caso Espacio de "Memoria" declaramos elvector de enteros código como un tipo
            de datos short.
        */
        short [] codigos = new short[3];
        int [][] cantidadBodega = new int[4][3];
        short [][] cantidadMinima = new short[4][3];

        /*
        Pedimos los datos del vector de codigos en una sola linea separados por
        una coma, y luego aplicamos el split para separar dichos datos.
        Recorremos el vector que nos devuelve el split y vamos asigando esos datos
        parseandolos a su vez a enteros y asigandolos al vector de codigos.
        */
        System.out.println("Ingrese los datos de los códigos: ");
        String datosCodigos = lector.nextLine();//354,256,127
        String [] datosDivididos = datosCodigos.split(",");
        for(int i=0;i<datosDivididos.length;i++){
            codigos[i] = Short.parseShort(datosDivididos[i]);
        }

        /*Pedimos los datos de las matrices en el formato establecido en el
        enunciado 

        17 34 60;14 31 65;45 2 12;56 43 8
        */
        System.out.println("Ingrese los datos de la cantidad de unidades del producto en Bodega: ");
        String datosCantidadBodega = lector.nextLine();
        String [] datosDivididosFilas = datosCantidadBodega.split(";");
        byte indFila=0;
        for(String fila:datosDivididosFilas){
            String [] datosDivididosCol = fila.split(" ");//17 34 60
            for(int i=0;i<datosDivididosCol.length;i++){
                cantidadBodega[indFila][i] = Integer.parseInt(datosDivididosCol[i]);
            }
            indFila++; //indFila = indFila + 1 ó indFila += 1
        }

        System.out.println("Ingrese los datos de la cantidad de unidades minimas permitidas del producto en Bodega: ");
        String datosCantidaMin = lector.nextLine();
        datosDivididosFilas = datosCantidaMin.split(";");
        indFila=0;
        for(String fila:datosDivididosFilas){
            String [] datosDivididosCol = fila.split(" ");//17 34 60
            for(int i=0;i<datosDivididosCol.length;i++){
                cantidadMinima[indFila][i] = Short.parseShort(datosDivididosCol[i]);
            }
            indFila++; //indFila = indFila + 1 ó indFila += 1
        }


        //Salidas Esperadas
        for(int f=0;f<cantidadMinima.length;f++){
            for(int c=0;c<cantidadMinima[f].length;c++){
                if(cantidadBodega[f][c] < cantidadMinima[f][c]){
                    System.out.printf("Se debe solicitar producto %s en sede %s \n",codigos[c],f);

                }
            }
        }

        /* Hacemos los calculos de los promedios de la cantidad de productos en bodega
           para cada código, de esta forma hacemos un recorrido por columna de la matriz
           cantidadBodega.
        */
        for(int c=0;c<cantidadBodega[0].length;c++){
            int sumatoria = 0;
            for(int f=0;f<cantidadBodega.length;f++){
                
                sumatoria = sumatoria + cantidadBodega[f][c];
            }
            float promedio = (float)sumatoria / (float)cantidadBodega.length;
            System.out.printf("El promedio de productos del codigo %s es %s \n",codigos[c],promedio);
        }



        /*
        Se debe solicitar producto 256 en sede 0
        Se debe solicitar producto 127 en sede 0
        Se debe solicitar producto 256 en sede 1
        Se debe solicitar producto 354 en sede 2
        Se debe solicitar producto 256 en sede 2
        Se debe solicitar producto 354 en sede 3
        Se debe solicitar producto 127 en sede 3 
        
        El promedio de productos del codigo 354 es 27.75
        El promedio de productos del codigo 256 es 27.5
        El promedio de productos del codigo 127 es 14.75
        */

    }
}
