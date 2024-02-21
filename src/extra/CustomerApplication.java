package extra;

import java.util.Scanner;

public class CustomerApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static Customer[] customerArray = new Customer[50];

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("================");
            System.out.println("1. 고객등록 | 2. 등록된 고객 리스트 확인 | 3. 포인트 사용 | 4. 포인트 적립| 5. 종료");
            System.out.println("================");
            System.out.println("번호를 입력해 선택해주세요");
            int selectNo = scanner.nextInt();

            switch (selectNo) {
                case 1:
                    userRegistry();
                    break;
                case 2:
                    userList();
                    break;
                case 3:
                    usePoint();
                    break;
                case 4:
                    stackingPoint();
                    break;
                case 5:
                    run = false;
                    break;
            }
        }
    }

    private static void userRegistry() {
        System.out.println("================");
        System.out.println("고객등록");
        System.out.println("================");

        System.out.println("성함을 입력해주세요: ");
        String username = scanner.next();

        System.out.println("전화번호를 입력해주세요: ");
        String userPhoneNumber = scanner.next();

        System.out.println("주소를 입력해주세요: ");
        String userAddress = scanner.next();


        Customer newCustomer = new Customer(username, userPhoneNumber, userAddress);

        for (int i = 0; i < customerArray.length; i++) {
            if (customerArray[i] == null) {
                customerArray[i] = newCustomer;
                System.out.println("고객님 등록이 완료 되었습니다.");
                break;
            }

        }
    }

    private static void userList() {
        System.out.println("================");
        System.out.println("등록된 고객 리스트");
        System.out.println("================");

        for (int i = 0; i < customerArray.length; i++) {
            Customer customer = customerArray[i];

            if (customer != null) {
                System.out.println(customer.getUserName() + " " + customer.getUserPhoneNumber() + " " + customer.getUserAddress() + " " + customer.getPoint());
            } else break;
        }

    }

    private static void usePoint() {
        System.out.println("================");
        System.out.println("포인트 사용");
        System.out.println("================");

        System.out.println("전화번호를 입력해주세요");
        String userPhoneNumber = scanner.next();

        System.out.println("사용하실 포인트를 입력해주세요");
        int userPoint = scanner.nextInt();

        if (userPoint < 500) {
            System.out.println("사용이 불가합니다. 최소 500점 이상을 입력해주세요.");
            return;
        }

        Customer customer = findCustomer(userPhoneNumber);

        if (customer == null) {
            System.out.println("포인트 사용이 불가합니다. 고객등록이 되었는지 확인 해주세요");
            return;
        }

        int currentPoint = customer.getPoint();
        if (currentPoint < userPoint) {
            System.out.println("보유한 포인트보다 많은 포인트를 사용할 수 없습니다.");
            return;
        }

        customer.setPoint(currentPoint - userPoint);
        System.out.println("포인트 사용이 완료되었습니다.");

    }

    private static void stackingPoint() {
        System.out.println("================");
        System.out.println("포인트 적립");
        System.out.println("================");

        System.out.println("전화번호를 입력해주세요");
        String userPhoneNumber = scanner.next();

        System.out.println("적립하실 포인트를 입력해주세요");
        int userPoint = scanner.nextInt();

        int additionalPoint;

        if (userPoint >= 2000) {
            additionalPoint = (int) (userPoint * 0.1);
        } else {
            additionalPoint = 0;
        }

        Customer customer = findCustomer(userPhoneNumber);

        if (customer == null) {
            System.out.println("포인트 적립이 불가합니다. 고객등록이 되었는지 확인 해주세요");
            return;
        }

        customer.setPoint(customer.getPoint() + userPoint + additionalPoint);

        System.out.println("적립이 완료되었습니다.");
    }

    private static Customer findCustomer(String userPhoneNumber) {
        Customer customer = null;

        for (int i = 0; i < customerArray.length; i++) {
            if (customerArray[i] != null) {
                String dbuserPhoneNumber = customerArray[i].getUserPhoneNumber();
                if (dbuserPhoneNumber.equals(userPhoneNumber)) {
                    customer = customerArray[i];
                    break;
                }
            }
        }
        return customer;
    }
}
