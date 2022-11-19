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
    }
}