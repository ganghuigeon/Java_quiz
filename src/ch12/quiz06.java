package ch12;

public class quiz06 {
    public static void main(String[] args) {
        String data = "아이디,이름,패스워드";
        String[] arr = data.split(",");
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
