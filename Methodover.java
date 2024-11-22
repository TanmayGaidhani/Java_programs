/*
NAME : TANMAY SANJAY GAIDHANI
CLASS : SY'A'
BATCH : I
ROLL NO: 114
*/

public class Methodover
{
    static int method(int x,int y)
    {
        int z=x+y;
        return z;
    }
    static double suha(double a,double b)
    {
        double k=a-b;
        return k;
    }
    public static void main(String[] args) {
        int num1=34;
        int num2=32;
        int sum =method(num1,num2);
        double num3 =33.33;
        double num4 =44.44;
        double sub=suha(num3,num4);
        
        System.out.println("Addition is:"+sum);
        System.out.println("Subtraction is:"+sub);
    }
}

/*

OUTPUT

PS C:\Users\tanma\OneDrive\Desktop\my java program> cd "c:\Users\tanma\OneDrive\Desktop\my java program\" ; if ($?) { javac Methodover.java } ; if ($?) { java Methodover }
Addition is:66
Subtraction is:-11.11
*/