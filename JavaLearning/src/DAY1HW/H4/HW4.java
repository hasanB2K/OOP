package DAY1HW.H4;

public class HW4 {
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        System.out.println("Given num is "+num);
        if(num == 0){
            System.out.println("The num "+num+" is ZERO");
        } else if (num>0){
            System.out.println("The num "+num+" is POSITIVE");
        } else{
            System.out.println("The num "+num+" is NEGATIVE");
        }
    }
}
