package ch06.quiz16;

public class Marine {
    //필드
    int x, y = 0; //Marine의 위치좌표
    int hp = 60; //현재 체력
    static int weapon = 6;//현재 공격력
    static int armor = 0; //현재 방어력

    //1. 공격력 증가시키는 메소드
    static void weaponUp() {
        weapon++;
    }
    //2. 방어력 증가시키는 메소드
    static void armorUp() {
        armor++;
    }
    //3. 캐릭터의 위치 움직이는 메소드
    void  move(int x,int y) {
        this.x = x;
        this.y = y;
    }

}
