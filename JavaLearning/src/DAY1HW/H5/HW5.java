package DAY1HW.H5;

public class HW5 {
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        if(num % 2 == 0){
            System.out.println("Given num "+num+" is a EVEN number");
        } else {
            System.out.println("Given num "+num+" is an ODD number");
        }
    }
}
