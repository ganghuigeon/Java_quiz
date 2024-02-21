package extra;

public class Customer {
   private String userName; //고객명
    private String userPhoneNumber; //고객전화번호
    private String userAddress; //고객집주소

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public int getPoint() {
        return point;
    }

    public Customer(String userName, String userPhoneNumber, String userAddress) {
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
        this.userAddress = userAddress;
        this.point = 0;
    }

    private int point;
}
