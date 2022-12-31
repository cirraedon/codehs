import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        // The company's secret code
        // DO NOT change this value
        String companyCode = "1298";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your password: "); 
        String pw = scanner.nextLine();
        System.out.println("Enter the company's secret code: ");
        String cc = scanner.nextLine();
        
        String scc = pw + cc;
        String scC = pw + companyCode;
        
        if (scc.equals(scC)) {
            System.out.println("Access granted");
        }
        else {
            System.out.println(scc + " is denied");
        }
    }
}