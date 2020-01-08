package lab4;

import com.sun.java_cup.internal.runtime.Scanner;

public class MethodsEx {


    //1. No return No parameter :คือ เมธอดที่ไม่มีการรับค่าพามาริเตอร์
    // และไม่มีการคืนค่าใดกลับจาก process
    //2. NO return 1 or more parameter : คือ เมธอดที่มีการรับพารามิเตอร์ตั้งแต่ 1 หรือมากกว่า
    //และไม่มีการคืนค่าใดกลับจาก process
    //3. Return 1 value, 1 or more parameter : คือ เมธอดที่มีการรับพารามิเตอร์ตั้งแต่ 1 หรือมากกว่า
    //และมีการคืนค่ากลับไปยังส่วนที่กรอกใช้งาน (เรียกใช้งานจากที่ไหน คืนค่าไปที่นั้น)

    public static void main(String[] args) {

        System.out.println("Hello from Main().");
        //calling mathod A()การเรียกใช้ฟอร์ม A
        A();
        A();
        A();
        //calling mathod B()
        B("MIT","RUTS");
        //calling mathod C()
        //1. ประกาศตัวแปรชนิดเดียวกันมาเก็บค่าที่เมธอดส่งกลับมาให้
        int summation = C(10,20);
        System.out.println("The summation of x and y:"+summation);
        //2. เรียกใช้เมธอดโดยไม่ประกาศตัวแปรใดๆมาเก็บที่ค่าที่ส่งกลับมา
        System.out.println("The summation of x and y(2):"+C(50,50));

        //main
    }

    public static void A() {
        System.out.println("Hello from A().");
    }//A

    public static void B(String msg,String msg2) {
        System.out.println("Hello from B().");
        System.out.println("Message:"+msg);
        System.out.println("Message:"+msg2);

    }//B

    public static int C (int x,int y){
        System.out.println("Hello from C().");
        int sum = x + y;
        return sum;
    }








}//class

