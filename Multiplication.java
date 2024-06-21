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
        
        Mul m=new Mul();
        m.SetData(5, 4);
    }
}