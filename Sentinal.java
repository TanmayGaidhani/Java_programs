import java.util.Scanner;
public class Sentinal 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int total =0;
        double average;
        int grade; 
        int gradecount=0;
       while(true)
        {
            System.out.println("enter the grades");
            grade=sc.nextInt();
            if(grade==-1)                   // sentinal condition
            {
                break;
            }
           if(grade<0 ||grade>100)
           {
            System.out.println("invalid grade");
            continue;
           }
           total+=grade;
           gradecount++;
        }
        if(gradecount > 0)
        {
            average=total/gradecount;
            System.out.println("Total is :"+total);
            System.out.println("average grade is:"+average);
        }
        else
        {
            System.out.println("no grade you enterd");
        }
         sc.close();
    }
}
