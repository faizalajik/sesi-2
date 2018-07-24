
package ggg;

import java.util.Scanner;

public class Ggg {

    public static void main(String[] args) {
        String pilih;
        Scanner masuk = new Scanner (System.in);
        pilih = masuk.nextLine();
        if ("kaki".equals(pilih)){
        Kucing k = new Kucing();
        k.kakikucing();
        k.kaki();
        Ayam a = new Ayam();
        a.kakiayam();
        a.kaki();
      }

    }
    
}
