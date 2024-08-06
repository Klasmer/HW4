public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }

        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задача 2");
        int temperature = 30;
        if (temperature < 5) {
            System.out.println(" На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature >= 5) {
            System.out.println(" На улице " + temperature + " градусов, можно идти без шапки");
        }

        System.out.println("Задача 3");
        int speed = 59;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " , то можно спокойно ездить");
        }

        System.out.println("Задача 4");
        int agePeople = 45;
        if (agePeople >= 2 && agePeople <= 6) {
            System.out.println("Если возраст человека равен " + agePeople + (" , то ему нужно ходить в детский сад"));
        }
        if (agePeople >=7 && agePeople <= 17){
            System.out.println("Если возраст человека равен " + agePeople + (" , то ему нужно ходить в школу"));
        }
        if (agePeople >= 18 && agePeople <= 24){
            System.out.println("Если возраст человека равен " + agePeople + (" , то ему нужно ходить в университет"));
        }
        if (agePeople > 24) {
            System.out.println("Если возраст человека равен " + agePeople + (" , то ему нужно ходить на работу"));
        }



    }
}