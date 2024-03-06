package ch12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class quiz09 {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 H시 m분 s초");


        System.out.println(date.format(now));
    }
}
