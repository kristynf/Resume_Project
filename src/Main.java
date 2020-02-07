import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ResumeDB a = new ResumeDB();
        Resume b = new Resume();


        a.welcome();

        System.out.println("What is your first and last name? ");
        b.setName(sc.nextLine());
        System.out.println("What is your email address? ");
        b.setEmailAddress(sc.nextLine());
        System.out.println("Where was your degree obtained from? ");
        b.setUniversityName(sc.nextLine());
        System.out.println("What type of degree was obtained? ");
        b.setDegreeType(sc.nextLine());
        System.out.println("What did you major in? ");
        b.setMajor(sc.nextLine());
        System.out.println("What year did you graduate? ");
        b.setGradYear(sc.nextInt());
        sc.nextLine();
        System.out.println("What company did you work for? ");
        b.setCompany(sc.nextLine());
        System.out.println("What was your job title? ");
        b.setJobTitle(sc.nextLine());
        System.out.println("What was your start date MM/DD/YYYY? ");
        b.setStartDate(sc.nextLine());
        System.out.println("What was your end date MM/DD/YYYY? ");
        b.setEndDate(sc.nextLine());
        System.out.println("Describe your job duties: ");
        b.setDescription(sc.nextLine());
        for (int i = 0; i < 3; i++) {
            if (i < 3) {
                System.out.println("Enter your skill: ");
                b.setSkillName(sc.nextLine());
                System.out.println("Enter your proficiency at your skill: ");
                b.setSkillProficiency(sc.nextLine());

            } else {
                break;
            }

        }


        System.out.println("Please enter your name to retrieve your spiffy resume: ");
             String input = sc.nextLine();
             ResumeDB database = new ResumeDB(input);




    }
}