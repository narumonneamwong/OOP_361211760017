package lab4;

public class Method_Overloading {

    //Method_Overloading คือ เมธอดที่มีชื่อเหมือนกัน
    // แต่มีการรับค่าพารามิเตอร์และการคืนค่ากลับที่แตกต่างกัน


    public static void main(String[] args) {
      System.out.println(sum(10,10));
      System.out.println(sum(10.5,20.4));
      System.out.println(sum(10,50.50));
    }

    public static int sum (int x, int y){
        return x+y;
    }
    public static double sum (double x,double y){
        return x+y;
    }
}

