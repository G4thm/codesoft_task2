import java.util.Scanner;

public class task2{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of subjects: ");
        byte Subjects = in.nextByte();
        System.out.println("Enter Maximum mark of the subjects:");
        int n = in.nextInt();
        int[] Marks = new int[Subjects];
        for (int i = 0; i < Marks.length; i++) {

                System.out.println("Enter the Mark of Subject " + (i + 1) + " :");
                byte M = in.nextByte();
              if (M>n){
                  System.out.println("Invalid Mark!");
                System.out.println("Re-enter the correct Mark:");
                Marks[i]= in.nextByte();}
              else {Marks[i]=M;}

        }
            double f=(n*Subjects)/100.00;
            int Total=0 ;
            for (int i = 0; i < Subjects; i++) {
                Total += Marks[i];
            }
            System.out.println();
            System.out.println("YOUR TOTAL MARK IS :  " + Total + "/" +(n*Subjects));
            double avg = Total/f;
            System.out.println();
            System.out.println("YOUR AVERAGE SCORE IS  :" + avg + "%");
            System.out.println();
            if (avg >= 90.0) {
                System.out.println("YOUR ACQUIRED S GRADE");
            } else if (avg < 90.0 && avg >= 80.0) {
                System.out.println("YOUR ACQUIRED A GRADE");
            } else if (avg < 80.0 && avg >= 70.0) {
                System.out.println("YOUR ACQUIRED B GRADE");
            } else if (avg < 70.0 && avg >= 60.0) {
                System.out.println("YOUR ACQUIRED C GRADE");
            } else if (avg < 60.0 && avg >= 50.0) {
                System.out.println("YOUR ACQUIRED D GRADE");
            } else if (avg < 50.0 && avg >= 40.0) {
                System.out.println("YOUR ACQUIRED E GRADE");
            } else {
                System.out.println("YOUR ACQUIRED F GRADE");
            }
        }
    }