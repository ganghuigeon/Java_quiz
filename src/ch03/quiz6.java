package ch03;

public class quiz6 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        System.out.println( (x>7) && (y<= 5) );
        System.out.println( (x%3 == 2) || (y%2 != 1) );
        //x는 7보다 크고, 5와 같기 때문에 true가 출력이 되며
        //x는 3으로 나누어 2가 남지 않고, y는 2로 나누었을 때 1이 남기 때문에 false가 출력이 된다.
    }
}
