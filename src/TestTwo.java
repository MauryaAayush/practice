import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        int sum = 0;
        for (int i = 2; i <= a; i++) {

            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.println(i);

                if(a <= 10){
                     sum = 0;
                    sum += i;
                }
                else {
                    sum = 17;
                    sum += i;
                }
                sum += i;

            }
        }
        System.out.println(sum + 17);
    }
}
