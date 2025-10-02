//package calculator;
import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sb = new StringBuilder("Earned amount:\n");
        sb.append("Bubblegum: $202\n");
        sb.append("Toffee: $118\n");
        sb.append("Ice cream: $2250\n");
        sb.append("Milk chocolate: $1680\n");
        sb.append("Doughnut: $1075\n");
        sb.append("Pancake: $80\n");
        sb.append("\n");
        int income = 202 + 118 + 2250 + 1680 + 1075 + 80;
        sb.append("Income: $%d".formatted(income));
        out.println(sb.toString());

        var sc = new Scanner(System.in);
        out.println("Staff expenses:");
        int staffExpenses = sc.nextInt();
        out.println("Other expenses:");
        int otherExpenses = sc.nextInt();
        out.println("Net income: $%d".formatted(income - staffExpenses - otherExpenses));
        sc.close();
    }
}