import java.util.Scanner;
public class inform {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you're Name :");
        String Name = scanner.nextLine();
        System.out.print("Enter you're Age :");
        int Age = scanner.nextInt();
        System.out.print("Enter you're Lucky numbar :");
        int lucky_no = scanner.nextInt();
        System.out.println("Claint name is :"+ Name);
        System.out.println("Claint age is :"+ Age);
        System.out.println("Claint lucky number is :"+ lucky_no);
        scanner.close();
    } 
    
}
