package ru.netology.oop.list;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scheduler scheduler = new Scheduler();

        while (true) {
            scheduler.showProgramMenu();
            int userChoice = -1;

            while (true) {
                try {
                    userChoice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Введите число 0-5");
                    System.out.print("Ваш выбор: ");
                }
            }
            if (userChoice == 0) {
                break;
            }
            else if (userChoice == 1) {
                System.out.print("Введите название задачи: ");
                String taskName = scanner.nextLine();
                scheduler.addTask(taskName);
            }
            else if (userChoice == 2) {
                scheduler.showAllTasks();
                System.out.println();
            }
            else if (userChoice == 3) {
                System.out.print("Введите номер задачи: ");
                int taskNumber = Integer.parseInt(scanner.nextLine());
                scheduler.deleteTaskByNumber(taskNumber);
                scheduler.showAllTasks();
            }
            else if (userChoice == 4) {
                System.out.print("Введите задачу для удаления: ");
                String taskName = scanner.nextLine();
                scheduler.deleteTaskByText(taskName);
                scheduler.showAllTasks();
            }
            else if (userChoice==5){
                System.out.print("Введите ключевое слово: ");
                String keyWord = scanner.nextLine();
                scheduler.deleteTasksList(keyWord);
                scheduler.showAllTasks();
            }
            System.out.println();
        }
    }
}

