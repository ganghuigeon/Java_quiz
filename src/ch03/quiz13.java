package ch03;

public class quiz13 {
    public static void main(String[] args) {
        char ch = 'A';
        char lowerCase = (ch < 'a') ? 'a' : ((ch > 'a') ? 'b' : 'c');
        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}
