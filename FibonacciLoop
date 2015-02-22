/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciloop;

import java.util.Scanner;

/**
 *
 * @author Sinarik
 */
public class FibonacciLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long ilk=1,iki=1,gecici;
        System.out.println("Kaç tane Fibonacci sayısı bulmak istiyorsunuz?:");
        Scanner sc=new Scanner(System.in);
        int aranan=sc.nextInt();
        long startTime = System.nanoTime();//zamanı hesaplamaya başlıyoruz.
        //zamanını hesaplamak istediğimiz işlemleri bu kızma yazıyoruz.
 
        for(int i=0;i<aranan;i++) //Bu döngü sayesinde istediğimiz sayıda fibonacci sayısı üretebiliriz.
        {
            System.out.println("\n"+ilk);
            gecici=ilk+iki;
            ilk=iki;
            iki=gecici;
        }
        long endTime = System.nanoTime();//hesaplamayı bitiriyoruz.
        long estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
        double seconds = (double)estimatedTime/1000000000; // saniyeye çevirmek için 1000000000'e bölüyoruz.
        System.out.println("\n"+seconds);
    }
    
}
