import java.util.Scanner;

class Main {

    public static void calculateGrade() {
        float sub1, sub2, sub3, sub4, sub5, TotalMarks, percentage;

        Scanner sc = new Scanner(System.in);
        //input Marks of all subjects
        System.out.print("Enter Marks of First Subject(out of 100):");
        sub1 = sc.nextFloat();
        System.out.print("Enter Marks of Second Subject(out of 100):");
        sub2 = sc.nextFloat();
        System.out.print("Enter Marks of Third Subject(out of 100):");
        sub3 = sc.nextFloat();
        System.out.print("Enter Marks of Fourth Subject(out of 100):");
        sub4 = sc.nextFloat();
        System.out.print("Enter Marks of Fifth Subject(out of 100):");
        sub5 = sc.nextFloat();
        // Sum of Subjects
        TotalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        percentage = (TotalMarks / 500) * 100;
         
        // Check ToatlMarks for Grade Level
        if (TotalMarks >= 400) {
            System.out.println("Your Grade is: A++ \t Total Marks : " + TotalMarks + " Percent : " + percentage + "%");
        } else if (TotalMarks >= 300) {
            System.out.println("Your Grade is: A \t Total Marks : " + TotalMarks + " Percent : " + percentage + "%");
        } else if (TotalMarks >= 225) {
            System.out.println("Your Grade is: B \t Total Marks : " + TotalMarks + " Percent : " + percentage + "%");
        } else if (TotalMarks >= 150) {
            System.out.println("Your Grade is: C \t Total Marks : " + TotalMarks + " Percent : " + percentage + "%");
        } else {
            System.out.println("Your Grade is: --A \t Total Marks : " + TotalMarks + " Percent : " + percentage + "%");
        }
    }

        public static void main(String[] args)
        { 
            calculateGrade(); // call calculateGrade Method
        }

}