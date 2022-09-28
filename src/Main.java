public class Main {
    public static void main(String[] args) {
        System.out.println("Условные операторы HW 26.09.2022 Tasks1-9");

        //Task1

        int age = 19;
        if (age <= 18) {

            System.out.println("Возраст не достигнут, поздравить с совершеннолетием по достижении 18 лет ");
        }
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием! ");
        }

        //Task2
        age = 27;
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу ");}

        if (age >= 18 && age < 24) {
            System.out.println("Человек может идти в университет ");}

        if (age > 24) {
            System.out.println("Человек окончил университет и может искать первую работу ");}

        //Tasks 3 and 6

            byte seats = 60;
            byte capacity = 102;
            int standSpace = capacity - seats; // стоячие места
            int seatsUsed = 60;
            int standSpaceUsed = 15;
        if (seatsUsed < seats) {
            System.out.println(" Есть еще " + (seats - seatsUsed) + " сидячих мест ");
        } else {
            System.out.println(" Сидячих мест нет! ");}
        if (standSpaceUsed < standSpace) {
            System.out.println(" Есть еще " + (standSpace - standSpaceUsed) + " стоячих мест ");
        } else {
            System.out.println(" Стоячих мест нет! ");
        }


             //Task4
             age = 35;
             if (age <= 18) {
                System.out.println(" Возраст не достигут, требуется немного подождать ");
             } else {
                System.out.println(" Поздравляем с совершеннолетием! ");}


             //Task5

                if (age >= 7 && age < 18) {
                    System.out.println("Ребенок ходит в школу ");
                } else if (age >= 18 && age < 24) {
                    System.out.println("Человек может идти учиться в университет ");
                } else if (age >= 24) {
                    System.out.println("Человек может искать себе первую работу ");
                }


                //Task7
                   age = 13;

                    if (age >= 2 && age <= 6) {

                        System.out.println(" Если возраст ребенка равен " + age + " годикам, то ему нужно ходить в детсад ");
                    }
                    else if (age > 6 && age <= 18) {

                        System.out.println(" Если возраст человека равен " + age + ", то ему нужно ходить в школу ");
                    }
                    else if (age > 18 && age <= 24) {

                        System.out.println(" Если возраст человека равен " + age + ", то его место в университете ");
                    }
                    else if (age > 24) {

                        System.out.println(" Если возраст человека равен " + age + ", то ему пора работать ");
                    }

                    //Task8
        if (age < 5){
            System.out.println(" Ребенок не может кататься на аттракционе ");
        } else if (age >= 5 && age < 14){
            System.out.println(" Ребенок может кататься на аттракционе только в сопровождении взрослого ");
        } else if (age >= 14){
            System.out.println(" Ребенок может кататься на аттракционе ");}

                   //Task9
        int one = 1;
        int two = 71;
        int three = 69;
        if (one > two) {
            if (one > three) {
                System.out.println("Максимальное число-" + one);
            } else if (three > one) {
                System.out.println("Максимальное число-" + three);
            } else {
                System.out.println(" Числа " + one + " и " + three + " равны ");
            }
        } else if (two > one) {
            if (two > three) {
                System.out.println("Максимальное число-" + two);
            } else if (three > two) {
                System.out.println("Максимальное число-" + three);
            } else {
                System.out.println(" Числа " + two + " и " + three + " равны ");
            }
        } else {
            if (one > three) {
                System.out.println("Максимальное число-" + one);
            } else if (three> one) {
                System.out.println("Максимальное число-" + three);
            } else {
                System.out.println(" Все числа равны ");


            }
        }


                }}











