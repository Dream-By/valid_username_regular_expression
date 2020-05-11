package com.company;

import java.util.Scanner;

class UserValidator {
    public static final String regularExpression = "^[[A-Z]|[a-z]][[A-Z]|[a-z]|\\d|[_]]{7,29}$";
}

public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UserValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
