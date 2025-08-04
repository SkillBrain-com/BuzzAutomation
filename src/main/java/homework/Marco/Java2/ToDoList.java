package homework.Marco.Java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {

        List<String> todoList = new ArrayList<>();
        todoList.add("Wake up and make bed");
        todoList.add("Go to work");

        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do?");
        //add
        //remove
        //list
        while(!scanner.nextLine().equals("q")); {
            System.out.println("What would you like to do?");
            String answer = scanner.nextLine();

            if (scanner.nextLine().equals("list")) {
                System.out.println(todoList);
            } else if (scanner.nextLine().equals("add")) {
                System.out.println("What would you like to add?");
                todoList.add(scanner.nextLine());
            } else if (scanner.nextLine().equals("remove")) {
                System.out.println("What would you like to remove?");
                todoList.remove(scanner.nextLine());
            } else {
                System.out.println("Welcome to the app! To quit the app, please press q");
            }
            System.out.println("What would you like to do?");
        }
    }
}
