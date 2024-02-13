package ch03;

public class quiz13 {
    public static void main(String[] args) {
        char ch = 'A';
        char lowerCase = (ch < 'a') ? 'a' : ((ch > 'a') ? 'b' : 'c');
        //실제 답 char lowerCase('A' <= ch && ch <= 'Z') ? (char)(ch+32) : ch;
        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}
