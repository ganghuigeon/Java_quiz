package ch06.quiz16;

public class MarineExample {
    public static void main(String[] args) {

Marine.weaponUp();
Marine.armorUp();

        Marine marine1 = new Marine();
        marine1.move(100,200);
        marine1.weaponUp();
        marine1.weaponUp();
        marine1.weaponUp();
        marine1.armorUp();
        marine1.armorUp();
        marine1.armorUp();
        System.out.println("marine1의 공격력: " + marine1.weapon);
        System.out.println("marine1의 방어력: " + marine1.armor);

        Marine marine2 = new Marine();
        marine2.move(100,200);
        System.out.println("marine2의 공격력: " + marine2.weapon);
        System.out.println("marine2의 방어력: " + marine2.armor);

        Marine marine3 = new Marine();
        marine3.move(100,200);
        System.out.println("marine3의 공격력: " + marine3.weapon);
        System.out.println("marine3의 방어력: " + marine3.armor);

    }
}
