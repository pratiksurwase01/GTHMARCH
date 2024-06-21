import java.util.*;

class Mul{
    private int a,b;
    public void SetData(int a,int b){
        this.a=a;
        this.b=b;

        System.out.println("Multiplication is = "+a*b);
    }
}

public class Multiplication{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two values");
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        Mul m=new Mul();
        m.SetData(x, y);
    }
}