import java.util.*;

class Add{
    private int a,b;
    public void setNum(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("addition is : "+a+b);
    }
}

public class CalculatorApp{
    public static void main(String[] args) {
         Add ad= new Add();
         ad.setNum(5,4);
    }
}