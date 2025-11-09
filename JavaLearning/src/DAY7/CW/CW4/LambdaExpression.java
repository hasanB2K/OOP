package DAY7.CW.CW5;

interface Operation{
    int execute(int a,int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        Operation add = (a,b) -> a+b;
        System.out.println(add.execute(10,20));

        Operation sub=(a,b)->a-b;
        System.out.println(sub.execute(50,20));


    }
}