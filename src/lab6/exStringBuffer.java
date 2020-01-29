package lab6;

import java.util.StringTokenizer;

public class exStringBuffer {
    public static void main(String[] args) {

        //StringBuffer เป็นคลาส ที่มีเมธอดต่างๆ
        //ที่สามารถปรับปรุงแก้ไขข้อมูลเป็น String ได้มากกว่า คลาส String ทั่วไป

        StringBuffer strBuf = new StringBuffer("Hello");

        //append () ใช้สำหรับต่อ String
        strBuf.append("Saiyai");
        System.out.println(strBuf);
        System.out.println(strBuf.reverse()); //การสลับข้อความจากหลังมาหน้า หน้าไปหลัง
       strBuf.delete(0,6); // การตัวอักษรตัวที่0ถึง6ในข้อความ
        System.out.println(strBuf);

        //StringTokenizer
        String s = "A UK car plant that directly and indirectly employs more than 6,000 people may be forced to close within days, a trade union leader has warned.\n" +
                "\n" +
                "Unite joint leader Tony Woodley refused to name the facility in question, but said it needed urgent state aid to stay open.\n" +
                "\n" +
                "Business secretary Lord Mandelson declined to comment, but urged people to “stop feeding the rumours”.\n" +
                "\n" +
                "The comments came after data showed UK car production slumped in January.\n" +
                "\n" +
                "“We’ve got a car plant that, within just a couple of days, would have run out of cash and needs serious financial help to stop over 6,000 people losing their jobs, ” said Mr. Woodley.\n" +
                "\n" +
                "He said the government had to act to prevent “a catastrophe”.\n" +
                "\n" +
                "Lord Mandelson said: “Rumours can very easily turn into a shockwave that destabilizes a company or an industry and brings about the very outcome that we are seeking to avoid.”\n" +
                "\n" +
                "He added that the government would help if it could.";

        StringTokenizer tokenizer = new StringTokenizer(s);
        int countWord = tokenizer.countTokens();
        System.out.println("Word count from message:"+countWord);

        //word cutting
        while (tokenizer.hasMoreElements()){
            System.out.println(tokenizer.nextElement());
        }




    }//main





}//class
