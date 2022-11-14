public class Main {
    public static void main(String[] args) {
        System.out.println("Homework4");
        //Задание 1
        System.out.println (" ");
        System.out.println ("Задание 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Тебе уже " + age + ". Поздравляю с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Ты еще не достиг совершеннолетия, придется немного подождать. Твой возраст - " + age);
        }
        //Задание 2
        System.out.println (" ");
        System.out.println ("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Возраст " + age + ". Ребенок ходит в школу.");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Возраст " + age + ". Человек учится в университете.");
        }
        if (age >= 24) {
            System.out.println("Возраст " + age + ". Человек работает.");
        }

    }
}