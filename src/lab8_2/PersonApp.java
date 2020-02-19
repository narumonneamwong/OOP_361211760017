package lab8_2;

public class PersonApp {
    public static void main(String[] args) {

        //create objects
        Person P1 = new Person("narumon neamwong","1997");
        Person P2 = new Sheriff("dawny","1997","Thungsong");
        Person P3 = new Police("Ponly","1997","Kabi");


        P1.introduce();
        P2.introduce();
        P3.introduce();
    }
}
