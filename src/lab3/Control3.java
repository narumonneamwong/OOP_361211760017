package lab3;

import java.util.Scanner;

public class Control3 {
    public static void main(String[] args) {
        //if-else-if -> เป็นคำสั่งที่ทีการทดสอบหลายเงื่อนไข เงื่อนไขใดเป็นจริงจะทำอย่างที่คำสั่งนั้นคำสั่งเดียว
        //ในกรณีที่เงื่อนไขทั้งหมดเป็นเท็จ if-else-if
        //if (เงื่อนไข1){
        //      คำสั่งเงื่อนไขที่ 1 เป็นจริง;
        // }eles if (เงื่อนไข 2){
        //      คำสั่งเงื่อนไข 2 เป็นจริง;
        // else if (เงื่อนไขที่ n){
        //      คำสั่งเมื่อเงื่อนไขที่ n เป็นจริง;
        //}else{
        //      คำสั่งเมื่อเงื่อนไขทั้งหมดเป็นเท็จ;
        //}

        // ถ้าอายุมากกว่า 60 คือแก่ ถ้าอายุระหว่าง 20-60 คือ วัยรุ่น ถ้าอายุต่ำกว่า 20 คือเด็ก

        Scanner sc = new Scanner(System.in);
        System.out.print("How old are you?");
        int age = sc.nextInt();


        //test condition
        if (age < 20) {
            System.out.println("You are young.");
        } else if (age <= 60) {
            ;
            System.out.println("You are teenager.");
        }else {
            System.out.println("You are old");
        }
    }
}
