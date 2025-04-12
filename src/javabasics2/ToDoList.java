package javabasics2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {

        List<String> todolist = new ArrayList<>();
        todolist.add("Wake up and make bed");
        todolist.add("Go to arok");

        String var = "test";

        System.out.println(var.equals("test"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the app! To quite the app, please press q");
        String input = scanner.nextLine();

        System.out.println(todolist);
        // add
        // remove
        // list

        while (!scanner.nextLine().equals("q)")) {
            System.out.println("What would you like to do?");
            String answer = scanner.nextLine();
            if (answer.equals("list")) {
                System.out.println(todolist);
            }
            else if (answer.equals("add")){
                System.out.println("What would you like to add?");
                todolist.add(scanner.nextLine());
            }
            else if (answer.equals("remove")) {
                System.out.println("What would you like to remove?");
                todolist.remove(scanner.nextLine());
            }
            else {
                System.out.println("Welcome to the app! To quit the app, please press q");
            }
        }

    }
}
