package inheritencedemo;
import java.util.Scanner;

public class InheritenceDemo {

    public static void main(String[] args) {
      
        Member[] clubMembers = new Member[6];

        clubMembers[0] = new NormalMember("Jimbob", 1, 2010);
        clubMembers[1] = new NormalMember("Arfur", 2, 2011);
        clubMembers[2] = new NormalMember("Bruce", 3, 2011);
        clubMembers[3] = new VIPMember("Coral", 4, 2012);
        clubMembers[4] = new VIPMember("Nermel", 5, 2013);
        clubMembers[5] = new VIPMember("Velma", 6, 2015);

        for (Member m : clubMembers) {
            m.calculateAnnualFee();
            m.displayMemInfo();
        }
      }
}
