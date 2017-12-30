package objectorienteddemo;

public class ObjectOrientedDemo {

    public static void main(String[] args) {
        Staff staff1 = new Staff("Bill", "Williams");
        staff1.setHoursWorked(150);
        int pay = staff1.calculatePay(1000, 400);
        System.out.println("Pay = " + pay);

        Staff staff2 = new Staff("John", "Smith");
        staff2.setHoursWorked(200);
        pay = staff2.calculatePay();
        System.out.println("Pay = " + pay);
    }

}
