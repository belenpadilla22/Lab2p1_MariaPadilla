/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_mariapadilla;
import java.util.Scanner;

/**
 *
 * @author belen
 */
public class Lab2P1_MariaPadilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=  new Scanner(System.in);
        char respuesta='s';
        int opcion;
        System.out.println(" L a b C A D");
        System.out.println(" 1. Creacion de triagulos ");
        System.out.println(" 2. Calcular el area de una figura");
        System.out.println(" 3. Clasificacion de numeros ");
        System.out.println(" Ingrese una opcion: ");
        opcion=leer.nextInt();
        while (opcion>0&&opcion<4){
            int numero;
            int numero1;
            int numero2;
            int numero3;
            double base;
            double altura;
            double area;
            if (opcion==1){
                System.out.println(" Ingrese a : ");
                numero1=leer.nextInt();
                System.out.println(" Ingrese b : ");
                numero2=leer.nextInt();
                System.out.println(" Ingrese c : ");
                numero3=leer.nextInt();
                while (numero1>0&&numero2>0&&numero3>0){
                    int suma;

                    if (numero1+numero2>numero3&&numero2+numero3>numero1&&numero3+numero1>numero2){
                        System.out.println(" Las longitudes ingresadas forman un triangulo ");
                    }
                    else {
                            System.out.println(" Las longitudes ingresas no forman un triangulo ");   

                }
            System.out.println(" Ingrese a : ");
            numero1=leer.nextInt();
            System.out.println(" Ingrese b : ");
            numero2=leer.nextInt();
            System.out.println(" Ingrese c : ");
            numero3=leer.nextInt();         

        }
                System.out.println(" Las longitudes no pueden ser negativas ");
            }
            if (opcion==2){
                int figura;
                while (respuesta=='s'||respuesta=='S'){
                System.out.println(" Figura 1 : Triangulo ");
                System.out.println(" Figura 2:  Rectangulo ");
                System.out.println(" Figura 3:  Circulo");
                System.out.println(" Ingrese la figura que desea calcular: ");
                figura=leer.nextInt();
                    if ( figura==1){
                        System.out.println(" Ingrese la base: ");
                        base=leer.nextDouble();
                        System.out.println(" Ingrese la altura: ");
                        altura=leer.nextDouble();
                        area= 0.5*base*altura; 
                        System.out.println(" El area es: "+ area );
                    }
                    if ( figura==2){
                        System.out.println(" Ingrese la base: ");
                        base=leer.nextDouble();
                        System.out.println(" Ingrese la altura: ");
                        altura=leer.nextDouble();
                        area= base*altura;
                        System.out.println(" El area es: "+ area );
                    }
                    if( figura==3){
                        System.out.println(" Ingrese el radio: ");
                        double radio=leer.nextDouble();
                        area= 3.1416*radio*radio;
                        System.out.println(" El area es: "+ area ); 
                    }
                 System.out.println(" Desea calcular el area de otra figura? [s/n]: ");
                 respuesta=leer.next().charAt(0);
                }
        }
            if (opcion==3){
                System.out.println(" Ingrese el numero a evaluar: ");
                numero=leer.nextInt();
                int c=1;
                int c2=0;
                while (c<=numero){
                    if (numero%c==0){
                        c2=c2+1;
                    }
                    c=c+1;
                }
                if (c2<=2&&numero%2==0){
                    System.out.println(" El numero ingresado par y primo");
                }
                else if (c2<=2&&numero%2!=0){
                    System.out.println(" El numero ingresado impar y primo");
                }
                else
                if (numero%2==0){
                    System.out.println(" El numero ingresado par");
                }
                else
                if (numero%2!=0){
                    System.out.println(" El numero ingresado es impar");
                }
                
                
            }
System.out.println(" L a b C A D");
System.out.println(" 1. Creacion de triagulos ");
System.out.println(" 2. Calcular el area de una figura");
System.out.println(" 3. Clasificacion de numeros ");
System.out.println(" Ingrese una opcion: ");
opcion=leer.nextInt();
}
}
    }
    
