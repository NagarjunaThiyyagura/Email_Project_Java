package EmailApp;

//to store all the Objects for the application


import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailCapacity;
    private String alterEmail;
    private String companyDomain = "abc.com";

    //Constructor to get the name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println(this.firstName + ' '+ this.lastName);

        //set Department using method
        this.department = setDepartment();
        //System.out.println("Dept: "+ this.department);

        //Set email
        setEmail();

        //set random password
        this.password = randomString();
        //System.out.println("password: "+ this.password);

    }

    //Ask for the department

    private String setDepartment(){
        System.out.print("Department Codes:\n" +
                "1. Sales\n2. Development\n3. Accounting\nAny Letter for None\nEnter Department Code: ");
        Scanner in = new Scanner((System.in));
        switch (in.next()){
            case "1": return "Sales";
            case "2": return "Development";
            case "3": return "Accounting";
            default:
                return "None";
        }


    }

    //Generate email in firstname.lastname@department.company.domain


    private void setEmail() {
        StringBuilder email = new StringBuilder(firstName.toLowerCase() + ".");
        email.append(lastName.toLowerCase())
                .append("@");
        if(department == "None"){
            email.append(companyDomain);
        }
        else{
            email.append(department).append("."+ companyDomain);
        }
        this.email = String.valueOf(email);
    }

    //generate random Password
    private String randomString(){
        char[] password = new char[10];
        for( int i=0; i<10; i++){
            int rand = (int) Math.round(Math.random()*91+33);
            //System.out.println(rand);
            password[i] = (char) rand;
        }
        return String.valueOf(password);
    }

    //set Mailbox capacity


    public void setMailCapacity(int mailCapacity) {
        this.mailCapacity = mailCapacity;
    }

    //Set alternate email

    public void setAlterEmail(String alterEmail) {
        this.alterEmail = alterEmail;
    }

    //Change password
    public void setPassword(String password) {
        this.password = password;
    }
    //get methods

    public int getMailCapacity() {
        return mailCapacity;
    }

    public String getAlterEmail() {
        return "Alternate Email: " + alterEmail;
    }

    public String getPassword() {
        return "Password: " + password;
    }

    public String getEmail() {
        return "Email: " + email;
    }

    public String getName() {
        return firstName+" "+lastName;
    }

    public String getDepartment() {
        return "Department: " +department;
    }

    public String info(){
        return "Name:"+ firstName +" "+ lastName+
                "\nCompany Email: "+ email+ "\nPassword: " + password;
    }
}
