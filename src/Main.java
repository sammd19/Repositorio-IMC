import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*-18,5 peso bajo,
        18,5--24.9 peso normal,
         25--26.9 sobrepeso grado1;
        27--29.9 sobrepeso grado 2;
        30--34,9 obesidad tipo 1
         35-39,9 obesidad tipo 2;
        40--49,9 obesidad morbida,
        +50 obesidad extrema*/
        Scanner lector = new Scanner(System.in);
        double a;
        double b;
        double s;
        System.out.println("Digite Peso");
        a = lector.nextDouble();
        System.out.println("Digite Estatura");
        b = lector.nextDouble();
        s = a/(b*b);
        System.out.println("El indice de masa corporal es: "+s);
        if (s<=18.5){
            System.out.println("Peso Bajo");}
        if (s>=18.5 && s<=24.9){
            System.out.println("Peso Normal");
        }
        if (s>=25 && s<=26.9){
            System.out.println("Sobrepeso grado 1");
        }
        if (s>=27 && s<=29.9){
            System.out.println("Sobrepeso grado 2");
        }
        if (s>=30 && s<=34.9){
            System.out.println("Obesidad Tipo 1");
        }
        if (s>=35 && s<=39.9){
            System.out.println("Obesidad Tipo 2");
        }
        if (s>=40 && s<=49.9){
            System.out.println("Obesidad morbida");
        }
        if (s>=50){
            System.out.println("Obesidad extrema");
        }
        if (s<=0){
            System.out.println("Peso No Existe");
        }


    }
}

