import java.sql.SQLOutput;

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
        int temperature = 5;
        if (temperature <= 5) {
            System.out.println(" На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature > 5) {
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
        if (agePeople >= 7 && agePeople <= 17) {
            System.out.println("Если возраст человека равен " + agePeople + (" , то ему нужно ходить в школу"));
        }
        if (agePeople >= 18 && agePeople <= 24) {
            System.out.println("Если возраст человека равен " + agePeople + (" , то ему нужно ходить в университет"));
        }
        if (agePeople > 24) {
            System.out.println("Если возраст человека равен " + agePeople + (" , то ему нужно ходить на работу"));
        }

        System.out.println("Задача 5");
        int ageChild = 13;
        boolean father = true;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + (" то, ему нельзя кататься на аттракционе"));
        }
        if (ageChild >= 5 && ageChild <= 14 && father == true) {
            System.out.println("Если возраст ребенка равен " + ageChild + (" то, он может кататься только в сопровождении"));
        } else {
            System.out.println("Если возраст ребека " + ageChild + " то без сопровождения кататься нельзя");
        }
        if (ageChild > 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + (" то, можно кататься на аттракционе без сопровождения"));
        }

        System.out.println("Задача 6");
        int carriageCapacity = 102;
        int seatPlace = 60;
        int people = 103;
        if (people < seatPlace) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (people >= seatPlace && people < carriageCapacity) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (people >= carriageCapacity) {
            System.out.println("В вагоне нет мест");
        }

        System.out.println("Задача 7");
        int one = 3;
        int two = 18;
        int three = 24;
        if (one >= two && one >= three) {
            System.out.println("Максимальное число в переменной one  = " + one);
        } else {
            if (two >= three) {
                System.out.println("Максимальное число в переменной two  = " + two);
            } else {
                System.out.println("Максимальное число в переменной three  = " + three);
            }

        }

    }


}
