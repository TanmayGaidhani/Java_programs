public class Method
{
    static int method(int x,int y)
    {
        int z=x+y;
        return z;
    }
    public static void main(String[] args) {
        int num1=34;
        int num2=32;
        int sum =method(num1,num2);
        
        System.out.println("Addition is:"+sum);
    }
}
