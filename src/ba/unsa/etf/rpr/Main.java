package ba.unsa.etf.rpr;



import java.util.Scanner;

public class Main {


    public static int sumaCifara(int n){

        int suma=0;

        while(n>0){
            suma+=n%10;
            n/=10;
        }

    return suma;
    }

    public static void main(String[] args) {
        System.out.println("Unesite broj n");
        int n=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.println(sumaCifara(i));

        }

    }
}
