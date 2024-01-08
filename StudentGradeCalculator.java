import java.util.Scanner;
class StudentGradeCalculator
{
    static int sub;
    //Taking number of subjects and marks as input
    int[] input()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of subjects:");
        sub=sc.nextInt();
        int marks[]=new int[sub];
        for(int i=1;i<=sub;i++)
        {
            System.out.print("Enter subject "+ i + " marks: ");
            marks[i-1]=sc.nextInt();
        }
        return marks;
    }
    //Method to calculate total marks
    int totalMarks(int marks[])
    {
        int sum=0;
        for(int i=0;i<marks.length;i++)
        {
            sum=sum+marks[i];
        }
        return sum;
    }
    //Method to calculate average
    double Average(int sum,int sub)
    {
        double avg=0.0;
        avg=sum/Double.valueOf(sub);
        return avg;
    }
    //Method to calculate grades
    char Grade(double avg)
    {
        char grade=' ';
        if(avg>=90)
           grade='S';
        else if(avg>=80&&avg<89)
            grade='A';
        else if(avg>=70&&avg<79)
            grade='B';
        else if(avg>=60&&avg<69)
            grade='C';
        else if(avg>=50&&avg<59)
            grade='D';
        else
            grade='F';
        return grade;
           
    }
    //Main method
    public static void main(String [] args)
    {
        StudentGradeCalculator obj=new StudentGradeCalculator();
        int marks[]=obj.input();
        int sum=obj.totalMarks(marks);
        double avg=obj.Average(sum, sub);
        char grade=obj.Grade(avg);
        System.out.println("\t Results \t");
        System.out.println("\t ------- \t");
        System.out.println("Total marks obtained = "+sum);
        System.out.println("Average = "+avg+"%");
        System.out.println("Grade obtained = "+grade);      
    }
}

