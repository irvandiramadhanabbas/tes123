package qwe;

import java.util.Scanner;

public class foto1 {
    public static void main(String []args) {
        int number = 0;
        int angka1 = 10;
        Scanner sc = new Scanner(System.in);
        System.out.print("angka 2 : ");
        int angka2 = sc.nextInt();

        if (angka1>= 1 && angka1 <=12){
            if (angka2 > 0) {
                number = angka1 + angka2;
                number = number + 2;
            } else {
                number = number + 2;
            }
        } else if (angka2 <= 0) {
            number = number - 1;
        } else {
            number = 0;
            number = number - 1;
        }
        System.out.println(number);
        }
    }
