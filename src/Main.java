import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String applicantName;
        String dateOfBirth;
        String expiryDate;
        int principalAmount;
        int loanRent;
        double loanRepaymentTime;

        // System Title
        System.out.println("LOAN CALCULATION SOFTWARE!!");

        // importing Scanner class
        Scanner Scanner = new Scanner(System.in);

        // reading from the keyboard

        // applicant Name
        System.out.print("Enter applicant Name: ");
        applicantName = Scanner.nextLine();

        // applicant date of birth
        ;System.out.print("Enter applicant's Date of Birth: ");
        dateOfBirth = Scanner.nextLine();

        // expiryDate
        System.out.print("Enter loan's expiryDate: ");
        expiryDate = Scanner.nextLine();

        // principal Amount
        System.out.print("Enter principal amount: ");
        principalAmount = Scanner.nextInt();

        // loan Rent
        System.out.print("Enter loan rent: ");
        loanRent = Scanner.nextInt();

        // loan repayment Time
        System.out.print("Enter loan repayment time: ");
        loanRepaymentTime = Scanner.nextDouble();

        // calculating simple interest
        double simpleInterest = principalAmount * loanRent * loanRepaymentTime;

        // displaying applicant information
        System.out.println("***** APPLICANT DETAILS ******");
        System.out.println("applicant Name: " + applicantName );
        System.out.println("applicant Date of Birth: " + dateOfBirth);
        System.out.println("applicant loan expiryDate: " + dateOfBirth);
        System.out.println("applicant Principal Amount " + principalAmount);
        System.out.println("applicant loan rent " + loanRent);
        System.out.println("applicant loanRepayment Time " + loanRepaymentTime + " years");
        System.out.println("simple interest " + Math.round(simpleInterest));
        System.out.print("total amount payable " + (principalAmount + simpleInterest));




    }
}