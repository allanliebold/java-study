package inheritencedemo;
import java.util.Scanner;

public class InheritenceDemo {

    public static void main(String[] args) {
        NormalMember mem1 = new NormalMember("Zeke", 1, 2012);
        VIPMember mem2 = new VIPMember("Doggo", 2, 2015);

        mem1.calculateAnnualFee();
        mem2.calculateAnnualFee();

        mem1.displayMemInfo();
        mem2.displayMemInfo();

        mem1.setDiscount();
        mem1.calculateAnnualFee();
        mem1.displayMemInfo();
    }

}
