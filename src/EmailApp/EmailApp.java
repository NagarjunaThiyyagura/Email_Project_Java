package EmailApp;

public class EmailApp {

    public static void main(String[] args){
        Email em1 = new Email("John", "Smith");
        em1.setAlterEmail("john@gmail.com");
        em1.setMailCapacity(200);
        em1.changePassword("abcdefg");

        System.out.println("---------------------------------------------------------------------------------------");

        System.out.println(em1.getName());
        System.out.println(em1.getDepartment());
        System.out.println(em1.getEmail());
        System.out.println(em1.getAlterEmail());
        System.out.println(em1.getPassword());
        System.out.println(em1.getMailCapacity());
    }

}
