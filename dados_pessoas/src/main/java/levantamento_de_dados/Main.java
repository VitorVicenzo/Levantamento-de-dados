package levantamento_de_dados;


import java.util.Locale;
import java.util.Scanner;

import levantamento_de_dados.entities.Person;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        Person[] vect_Person = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da "+(i+1)+"a pessoa: ");
            double height = sc.nextDouble();
            System.out.print("Genero da "+(i+1)+"a pessoa: ");
            String sex = sc.next();
            vect_Person[i] = new Person(height, sex);
        }

        double min_Height = 3.0;
        double grt_Height = 0.0;
        double sum_Height_Women = 0.0;
        int women_Index = 0;
        
        int count_Men = 0;
        for (int i = 0; i < n; i++) {
            if (vect_Person[i].getHeight()<min_Height) {
                min_Height = vect_Person[i].getHeight();
            }
            if (vect_Person[i].getHeight()>grt_Height) {
                grt_Height = vect_Person[i].getHeight();
            }
            if (vect_Person[i].getSex().equals("F")) {
                sum_Height_Women += vect_Person[i].getHeight();
                women_Index++;
            }
            if (vect_Person[i].getSex().equals("M")) {
                count_Men++;
            }
        }
        double average_Women = sum_Height_Women/women_Index;
        System.out.println("Menor altura = " + min_Height);
        System.out.println("Maior altura = " + grt_Height);
        System.out.printf("Média das alturas das mulheres = %.2f%n", average_Women);
        System.out.println("Numero de homens = " + count_Men);
    }
}