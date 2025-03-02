package org.example;
import org.example.Operators;
import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        selfDestructCountdown();
//        securityCheck();
//        averageCalculator();
    }

    static void selfDestructCountdown() {
        /*
         * 🚀 Fix the Malfunctioning Self-Destruct Countdown!

         * The countdown has two issues:
         * 1️⃣ It starts from 1 less than the entered number. (e.g., entering 5 starts at 4)
         * 2️⃣ It incorrectly displays 0 before "BOOM!".

         * 🔧 Fix both issues so the countdown starts correctly and stops at 1.
         * ✅ Expected output for input 5:
         *   5, 4, 3, 2, 1, BOOM!
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("⚠️ WARNING: Self-destruct sequence activated! ⚠️");
        System.out.print("Enter countdown start (5-10): ");

        int countdown = scanner.nextInt();

        while (countdown > 0) {
            System.out.println("💥 Detonation in: " + countdown + " seconds");
            countdown--;        }

        System.out.println("💣 BOOM!");
        /*NATASHA
        * could not make the output "5, 4, 3, 2, 1, BOOM!"
        * Also having this error while running this code (had to run it on online editor
        * =====================
        * Error: Could not find or load main class org.example.Operators
        * Caused by: java.lang.ClassNotFoundException: org.example.Operators
        * =========================*/
    }

    static void securityCheck() {
        /* 🚀 Fix the Security Check!

         * This program should allow access **only** if the user enters the correct password
         * **AND** confirms it.

         * ❌ Issue: It sometimes grants access with an incorrect password!

         * ✅ Expected:
         *   - Input: "admin", confirm "yes" → Access Granted ✅
         *   - Input: "wrong", confirm "yes" → Access Denied ❌
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Confirm (yes/no): ");
        String confirm = scanner.nextLine();

        if (password.equals("admin") || confirm.equals("yes")) {
            System.out.println("✅ Access Granted!");
        } else {
            System.out.println("❌ Access Denied!");
        }
    }

    static void averageCalculator() {
        /*
         * 🚀 Fix the Incorrect Average Calculation!
         * This program should calculate the average of two numbers,
         * but the result is always **rounded down** instead of being accurate.

         * ✅ Expected: (5, 2) → 3.5
         * ❌ Current Output: (5, 2) → 3.0
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        double average = (a + b) / 2;
        System.out.println("📊 Average: " + average);
    }
}
