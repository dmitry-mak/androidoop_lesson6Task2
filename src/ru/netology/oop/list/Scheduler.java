package ru.netology.oop.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Scheduler {

    List<String> toDoList = new ArrayList<>();

    public void addTask(String newTask) {
        toDoList.add(newTask);
        System.out.println("Добавлено!");
    }

    public void showAllTasks() {
        Iterator<String> iterator = toDoList.iterator();
        int taskNumber = 1;

        if (toDoList.isEmpty()) {
            System.out.println("Ваш список дел пуст");
        } else {
            System.out.println("Ваш список дел: ");
            while (iterator.hasNext()) {
                String task = iterator.next();
                System.out.println(taskNumber + ". " + task);
                taskNumber++;
            }
        }
    }

    public void deleteTaskByNumber(int taskNumber) {
        toDoList.remove(taskNumber - 1);
        System.out.println("Удалено!");
    }

    public void deleteTaskByText(String task) {
        Iterator<String> iterator = toDoList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(task)) {
                iterator.remove();
            }
        }
        System.out.println("Удалено!");
    }

//    public void deleteTasksList(String word) {
//        List<String> listToDelete = new ArrayList<>();
//
//        for (String task : toDoList) {
//            if (task.contains(word)) {
//                listToDelete.add(task);
//            }
//        }
//        toDoList.removeAll(listToDelete);
//
//    }

    public void deleteTasksList(String word) {
        Iterator<String> iterator = toDoList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().contains(word)) {
                iterator.remove();
            }
        }
    }

    public void showProgramMenu() {
        System.out.println("Выберите операцию:");
        System.out.println("0. Выход из программы");
        System.out.println("1. Добавить дело");
        System.out.println("2. Показать дела");
        System.out.println("3. Удалить дело по номеру");
        System.out.println("4. Удалить дело по названию");
        System.out.println("5. Удалить все задачи по ключевому слову");
        System.out.println();
        System.out.print("Ваш выбор: ");
    }
}
