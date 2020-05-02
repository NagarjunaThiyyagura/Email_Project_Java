package EmailApp;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Name and Last Name: ");
        Email em1 = new Email(in.next(), in.next());
        System.out.println("Enter Alternate Email: ");
        em1.setAlterEmail(in.next());
        em1.setMailCapacity(200);
        em1.setPassword("abcdefg");

        System.out.println("---------------------------------------------------------------------------------------");

        System.out.println(em1.getName());
        System.out.println(em1.getDepartment());
        System.out.println(em1.getEmail());
        System.out.println(em1.getAlterEmail());
        System.out.println(em1.getPassword());
        System.out.println("Mailbox Capacity: "+ em1.getMailCapacity());
    }

}
