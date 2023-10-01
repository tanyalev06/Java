import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        hello();
        helloName();
        elements();
    }

    static void hello() {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        if (num > 7) {
            System.out.println("Привет");
        }
    }

    static void helloName() {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a name: ");
        String name = in.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет,Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    static void elements() {

        int[] nums = new int []{1,2,3,4,5,6,7,8,10,11};
        for (int i=0; i < nums.length; i++) {
            if (nums[i] % 3 == 0) {
                System.out.println(nums[i]);
            }
        }
    }
}