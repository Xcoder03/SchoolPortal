package School;

import java.util.Random;
import java.util.Scanner;

public class StudentDashB implements ConfeHigh{

    @Override
    public void signUp(Register register) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Please Enter Students first name");
        String fn = input.nextLine();
        register.setFirstname(fn);
        System.out.println("Please Enter Students last name");
        String sn = input.nextLine();
        register.setLastname(sn);
        System.out.println("Please Enter student gender");
        String gd = input.nextLine();
        register.setSex(gd);
        System.out.println("Please Enter Students class");
        String cls = input.nextLine();
        register.setGrade(cls);
        System.out.println("Please Enter Students Email");
        String ad = input.nextLine();
        register.setEmail(ad);
        System.out.println("Please Enter Students Address");
        String ads = input.nextLine();
        register.setAddress(ads);
        System.out.println("Please Enter student phone number");
        long pno = input.nextLong();
        register.setPhoneNo(pno);
        System.out.println("Please Enter a password");
        String pss = in.nextLine();
        register.setPassword(pss);
        System.out.println(register.getPassword());


        int id_random = rand.nextInt(25);
        register.setId(id_random);
        System.out.println("Welcome to Confex High School: "+register.getFirstname()+ " "+register.getLastname());
        // Generating random characters from the student first name

        int random = rand.nextInt(register.getFirstname().length());
        String N = "CHS";
        char[]  us = {register.getFirstname().charAt(0),register.getFirstname().charAt(1), register.getFirstname().charAt(random),register.getFirstname().charAt(random)};
       String user = "";
        for (int i = 0; i <us.length ; i++) {
            user+=us[i];

        }
        System.out.println("Your username is: "+ N+user+random+random+random);


    }

    @Override
    public void signIn(String email, String password, String grade) {
        // this area will be a ui
        System.out.println("welcome "+ email);
        System.out.println("Welcome what would you like to do");
        System.out.println("1: Check Result ");
        System.out.println("2: Check Class Time Table ");
        System.out.println("3: School Gallery ");
        System.out.println("4: School Blog ");


    }
}
