/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccirecursive;

import java.util.Scanner;

/**
 *
 * @author Sinarik
 */
public class FibonacciRecursive {
    
    public static long fibonacci(long sayi) {
    if ((sayi == 0) || (sayi == 1)) //Bu satırda başlangıç için gerekli olan ilk iki fibonacci sayısını döndürüyoruz.
      return sayi;
    else//ilk iki fibonacci sayımızdan sonrasının hesaplandığı recursive kısım.
      return fibonacci(sayi - 1) + fibonacci(sayi - 2);
  }
    
  public static void main(String[] args) {
      
        System.out.println("Kaç tane Fibonacci sayısı bulmak istiyorsunuz?:");
        Scanner sc=new Scanner(System.in); //Klavyeden kaç tane fibonacci sayısı oluşturmak istediğimizi yazabilmemiz için gereken nesne oluşturdugumuz kısım
        int aranan=sc.nextInt();
        
        long startTime = System.nanoTime();//zamanı hesaplamaya başlıyoruz.
        //zamanını hesaplamak istediğimiz işlemleri bu kısma yazıyoruz. 
        for (long i = 0; i <= aranan; i++) //Bu döngü sayesinde istediğimiz sayıda fibonacci sayısı üretebiliriz.
        {
            System.out.printf("\n"+fibonacci(i));
        }
        
        long endTime = System.nanoTime();//hesaplamayı bitiriyoruz.
        long estimatedTime = endTime - startTime; // Geçen süreyi nanosaniye cinsinden elde ediyoruz.
        double seconds = (double)estimatedTime/1000000000; // saniyeye çevirmek için 1000000000'e bölüyoruz.
        System.out.println("\n"+seconds);
  }
}

