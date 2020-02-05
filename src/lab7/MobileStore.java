package lab7;

public class MobileStore {
    public static void main(String[] args) {

        Mobile Mobile1 = new Mobile();

        Mobile1.setMobileID(1001);
        Mobile1.setBrand("Wiko");
        Mobile1.setGeneration("Sunny 4 Plus");
        Mobile1.setPrice(2090);
        Mobile1.setOperatingSystem("Android 9 Go");

        System.out.println(Mobile1.getMobileID());
        System.out.println(Mobile1.getBrand());
        System.out.println(Mobile1.getGeneration());
        System.out.println(Mobile1.getPrice());
        System.out.println(Mobile1.getOperatingSystem());

        Mobile Mobile2 = new Mobile(2002,"Apple","iPhone11Pro",35900,"iOS13");
        System.out.println(Mobile2.getMobileID());
        System.out.println(Mobile2.getBrand());
        System.out.println(Mobile2.getGeneration());
        System.out.println(Mobile2.getPrice());
        System.out.println(Mobile2.getOperatingSystem());

        Mobile Mobile3 = new Mobile(3003,"Samsung","Galaxy E7",11500,"Android4.4");
        System.out.println(Mobile3.getMobileID());
        System.out.println(Mobile3.getBrand());
        System.out.println(Mobile3.getGeneration());
        System.out.println(Mobile3.getPrice());
        System.out.println(Mobile3.getOperatingSystem());

    }//main
}//class
