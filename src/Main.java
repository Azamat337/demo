import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите первое число ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число ");
        int num2 = scanner.nextInt();
        System.out.println("Введите действие ");
        String action = scanner.next();
        switch (action){
            case "+":
                int res1 = num1 + num2;
                System.out.println("Результат сложения: " + res1);
                break;
            case "-":
                int res2 = num1 - num2;
                System.out.println("Результат вычитания: " + res2);
                break;
            case "*":
                int res3 = num1 * num2;
                System.out.println("Результат умнажения: " + res3);
                break;
            case "/":
                int res4 = num1 / num2;
                System.out.println("Результат деления: " + res4);
                break;


        }

    }
}