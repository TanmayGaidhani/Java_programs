public class Counter_Control 
{
    public static void main(String[] args) 
    {
        int student=10;
        int total =0;
        double average;
        int grade;
        Scanner sc =new Scanner(System.in);
        for(int i=1;i<=student;i++)
        {
           System.out.println("enter the grade of student"+i); //(i+1)
           grade=sc.nextInt();
           while(grade<0 ||grade>100)
           {
            System.out.println("invlid grade");
            grade=sc.nextInt();
           }
           total+=grade;
        }
        average=total/student;
        System.out.println("Total is :"+total);
        System.out.println("average grade is:"+average);
    }

}

