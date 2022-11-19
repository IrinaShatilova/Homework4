public class Main {
    public static void main(String[] args) {
        System.out.println("Homework4");
        //Задание 1. Блок 1
        System.out.println (" ");
        System.out.println ("Задание 1. Блок 1.");
        int age = 19;
        if (age >= 18) {
            System.out.println("Тебе уже " + age + ". Поздравляю с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Ты еще не достиг совершеннолетия, придется немного подождать. Твой возраст - " + age);
        }
        //Задание 2. Блок 1
        System.out.println (" ");
        System.out.println ("Задание 2. Блок 1.");
        if (age >= 7 && age < 18) {
            System.out.println("Возраст " + age + ". Ребенок ходит в школу.");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Возраст " + age + ". Человек учится в университете.");
        }
        if (age >= 24) {
            System.out.println("Возраст " + age + ". Человек работает.");
        }
        //Задание 3. Блок 1
        System.out.println (" ");
        System.out.println ("Задание 3. Блок 1.");
        int capacity = 102;
        int seatingPositions = 60;
        int standingPositions = capacity - seatingPositions;
        int seatingPositionsUsed = 55;
        int standingPositionsUsed = 42;
        if (seatingPositionsUsed <= seatingPositions) {
            System.out.println("Осталось следующее количество сидячих мест - " + (seatingPositions - seatingPositionsUsed));
        }
        if (standingPositionsUsed <= standingPositions) {
            System.out.println("Осталось следующее количество стоячих мест - " + (standingPositions - standingPositionsUsed));
        }
        //Задание 1. Блок 2
        System.out.println (" ");
        System.out.println ("Задание 1. Блок 2.");
        int age1 = 19;
        if (age1 >= 18) {
            System.out.println("Тебе уже " + age1 + ". Поздравляю с совершеннолетием!");
        }else {
            System.out.println("Ты еще не достиг совершеннолетия, придется немного подождать. Твой возраст - " + age1);
        }
        //Задание 2. Блок 2
        System.out.println (" ");
        System.out.println ("Задание 2. Блок 2.");
        if (age1 >= 7 && age1 < 18) {
            System.out.println("Возраст " + age1 + ". Ребенок ходит в школу.");
        }
        else if (age1 >= 18 && age1 < 24) {
            System.out.println("Возраст " + age1 + ". Человек учится в университете.");
        }
        else if (age1 >= 24) {
            System.out.println("Возраст " + age1 + ". Человек работает.");
        }
        //Задание 3. Блок 2
        System.out.println (" ");
        System.out.println ("Задание 3. Блок 2.");
        int capacity1 = 102;
        int seatingPositions1 = 60;
        int standingPositions1 = capacity1 - seatingPositions1;
        int seatingPositionsUsed1 = 60;
        int standingPositionsUsed1 = 40;
        if (seatingPositionsUsed1 < seatingPositions1) {
            System.out.println("Осталось следующее количество сидячих мест - " + (seatingPositions1 - seatingPositionsUsed1));
        }
        else {
            System.out.println("Сидячих мест нет");
        }
        if (standingPositionsUsed1 < standingPositions1) {
            System.out.println("Осталось следующее количество стоячих мест - " + (standingPositions1 - standingPositionsUsed1));
        }
        else {
            System.out.println("Стоячих мест нет");
        }

    }
}