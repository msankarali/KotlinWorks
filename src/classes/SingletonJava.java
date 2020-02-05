package classes;

import kotlin.jvm.Synchronized;
import kotlin.jvm.Volatile;

public class SingletonJava {
    // bir tane instancea ihtiyacimiz oldugu zaman kullanilir.

    @Volatile // bu değişkene aynı anda sadece bir adet erişebilir
    private static SingletonJava newInstance = null; //
    public String color = "";

    private SingletonJava() {

    }

    // multitreat calisirken sikinti cikabilir
    @Synchronized // Multitreat çalışılırken tekrar üretip patlamaması için synchronized. sadece 1 treat girebilir
    public static SingletonJava getNewInstance() { // static -> disaridan nesne olusturulmadan cagrilabilir demek
        if (newInstance == null) {
            newInstance = new SingletonJava();
        }

        return newInstance;
        //return new SingletonJava();
    }

    /*
    herhangi bir classtan obje oluşturmak istediğimizde
    ikinci bir obje 2. 3...



     */

    public void getMemoryObject() {
        for (int i = 0; i < 1000; i++) {
            int number = i;
            int number2 = i + 1;
            int number3 = i + 1;
            int number4 = i + 1;
            int number5 = i + 1;

        }
    }
}
