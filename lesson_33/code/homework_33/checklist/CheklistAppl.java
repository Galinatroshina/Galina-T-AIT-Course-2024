package homework_33.checklist;
//добавить задачу
//посмотреть все задачи
//удалить задачу (по номеру)
//выйти из меню
//Реализовать метод printMenu().

import java.util.Scanner;

public class CheklistAppl {

    public static void main(String[] args) {


        System.out.println("Your checklist");
        boolean flag = true;
        Checklist[] checklists = Checklist.values();

        Scanner scanner = new Scanner(System.in);

        while (flag) {
            Checklist.printMenu();
            System.out.println("Input your choice: Press 1 to add task, 2 to view all task, 3 to update task, 4 to remove task, 5 to mark as complete, 6 to exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1, 2, 3, 4, 5 ->
                        System.out.println("Your choice is: " + checklists[choice - 1].getTask());
                case 6 -> {
                    System.out.println("Exiting...");
                    flag = false;
                }
                default -> System.out.println("Wrong choice");
            }
        }
        scanner.close();
        }

    }

