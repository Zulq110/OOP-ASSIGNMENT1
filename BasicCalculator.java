import java.util.Scanner;

    class main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Basic Number Calculator");

        // Instructions
        System.out.println("You can start calculate the number like this (Num1 -> Space -> + Num2 and Your Ans is Here )");

        System.out.print("Please Start Calculation Here  - ");

        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int b = sc.nextInt();
        solve(a, b, op);

    }
    public static int solve(int a, int b, char op)
    {
        int ans = 0;
                                            // addition
        if (op == '+') {
            ans = a + b;
        }
                                        // subtraction
        else if (op == '-') {
            ans = a - b;
        }

                                     // multiplication
        else if (op == '*') {
            ans = a * b;
        }

                                   // Division
        else if (op == '/') {
            ans = a / b;
        }
                                //DisplayError
        else {
            System.out.println("invalid input");
        }
        // Result
        System.out.println("Your answer is - " + ans );
        System.out.println("Thank you for using this Program GoodBye!");
        return ans;
    }
}
//This program is made by Zulqarnain - 2K23/MSCS/44
//I use comment for better understanding and I just try to apply clean code rule.