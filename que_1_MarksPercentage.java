import java.util.Scanner;
public class que_1_MarksPercentage {
    public static void main(String[] args) {
        System.out.println("Enter your marks to calculate percentage");
        Scanner input = new Scanner(System.in);
        System.out.print("English : ");
        int english = input.nextInt();
        System.out.print("Maths : ");
        int maths = input.nextInt();
        System.out.print("science : ");
        int science = input.nextInt();
        System.out.print("social Science : ");
        int socialScience = input.nextInt();
        System.out.print("Hindi : ");
        int hindi = input.nextInt();
        int total = english + maths + science + socialScience + hindi;
        System.out.print("Total marks : ");
        System.out.println(total);
        double percentage = ((double)total/500)*100;
        System.out.print("Percentage : "+percentage+"%");

    }
}
