package classes;


public class SingletonJavaTest {
    public static void main(String[] args) {
        //SingletonJava singletonJava = new SingletonJava();
        //SingletonJava singletonJava2 = new SingletonJava();
        //SingletonJava singletonJava3 = new SingletonJava();
        //SingletonJava singletonJava4 = new SingletonJava();

        //singletonJava.getNewInstance();
        SingletonJava.getNewInstance().color = "blue";
        System.out.println(SingletonJava.getNewInstance().color);

        SingletonJava.getNewInstance().color = "red";
        System.out.println(SingletonJava.getNewInstance().color);
        // singleton ve memory leak kesin sorulur
        // retrofit - singleton kullanacagiz

        //singletonJava.color = "mavi";
        //singletonJava2.color = "green";
        //singletonJava3.color = "yellow";
        //singletonJava4.color = "rec";

        //System.out.println(singletonJava.color);
        //System.out.println(singletonJava2.color);
        //System.out.println(singletonJava3.color);
        //System.out.println(singletonJava4.color);

        SingletonJava.getNewInstance().getMemoryObject();
    }
}
