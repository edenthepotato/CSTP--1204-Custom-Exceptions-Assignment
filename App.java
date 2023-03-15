import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and I will calculate the factorial: ");
        try {
            int base = sc.nextInt();
            checkNum(base);
            int acc = 1;
            if (base == 0) {
                acc = 0;
                System.out.println("Factorial for " + base + " = " + acc);
            } else {
                for(int i = base; i > 0; i--){
                    acc = acc * i;
                }
                System.out.println("Factorial for " + base + " = " + acc);
            }
        } catch (CustomException e) {
            System.out.println(e.getMsg());
        }
        sc.close();
    }

    public static void checkNum(int num) throws CustomException{
        if (num < 0) {
            throw new CustomException("Negative Value");
        } else {
            System.out.println("Num is accepted");
        }
    }
}

