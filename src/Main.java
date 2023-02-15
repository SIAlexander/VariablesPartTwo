public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1(){
        System.out.println("Задача 1");
        int amountPaper = 2345;
        byte amountOrange = 98;
        short litersWater = 23000;
        long amountNails = 1000000;
        float weightHuman = 88.6f;
        double lengthRoad = 987.665;
        System.out.println("Значение переменной amountPaper с типом int равно " + amountPaper);
        System.out.println("Значение переменной amountOrange с типом byte равно " + amountOrange);
        System.out.println("Значение переменной litersWater с типом short равно " + litersWater);
        System.out.println("Значение переменной amountNails с типом long равно " + amountNails);
        System.out.println("Значение переменной weightHuman с типом float равно " + weightHuman);
        System.out.println("Значение переменной lengthRoad с типом double равно " + lengthRoad);
    }
    public static void task2(){
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549l;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
    }
    public static void task3(){
        System.out.println("Задача 3");
        byte numberStudentsOneClass = 23;
        byte numberStudentsTwoClass = 27;
        byte numberStudentsThreeClass = 30;
        short totalPaper = 480;
        int totalStudents = numberStudentsOneClass + numberStudentsTwoClass + numberStudentsThreeClass;
        int amountPaperStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика расчитано " + amountPaperStudent + " листов бумаги");
    }
    public static void task4(){
        System.out.println("Задача 4");
        byte performanceMachineTwoMinutes = 16;
        int performanceMachineTwentyMinutes = (20 / 2) * performanceMachineTwoMinutes;
        int performanceMachineThreeDays = (((24 * 3) * 60) / 2) * performanceMachineTwoMinutes;
        int performanceMachineOneMonth = (((24 * 31) * 60) / 2) * performanceMachineTwoMinutes;
        System.out.println("За 20 минут машина произвела " + performanceMachineTwentyMinutes + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + performanceMachineThreeDays + " штук бутылок");
        System.out.println("За один месяц машина произвела " + performanceMachineOneMonth + " штук бутылок");
    }
    public static void task5(){
        System.out.println("Задача 5");
        byte brownPaintClassroom = 4; //уходит бонок коричневой краски на один класс
        byte whitePaintClassroom = 2; //уходит бонок белой краски на один класс
        byte totalCans = 120; //куплено банок краски всего (белой и коричневой)
        int totalClassroom = totalCans / (brownPaintClassroom + whitePaintClassroom); //всего классов в школе
        int totalBrownPaint = totalClassroom * brownPaintClassroom; //Всего банок коричневой краски
        int totalWhitePaint = totalClassroom * whitePaintClassroom; //Всего банок белой краски
        System.out.println("В школе, где " + totalClassroom + " классов, нужно " + totalWhitePaint + " банок белой " +
                "краски и " + totalBrownPaint + " банок коричневой краски");
    }
    public static void task6(){
        System.out.println("Задача 6");
        byte weightBanana = 80; //вес одного банана
        byte weightMilk = 105; //вес 100 мл молока = 105 грамм
        byte weightIceCream = 100; //вес одного мороженного
        byte weightEgg = 70; // вес одного сырого яйца
        byte quantityBananas = 5; //кол-во бананнов
        short quantityMilk = 200; //кол-во молока
        byte quantityIceCream = 2; // кол-во мороженного
        byte quantityEgg = 4; // кол-во яиц
        int totalWeightBanana = weightBanana * quantityBananas; //общий вес бананов в граммах
        int totalWeightMilk = (quantityMilk / 100) * weightMilk; //общий вес молока в граммах
        int totalWeightIceCream = weightIceCream * quantityIceCream; //общий вес мороженного в граммах
        int totalWeightEgg = weightEgg * quantityEgg; //общий вес яиц в граммах
        int totalWeightBreakfast = totalWeightEgg + totalWeightBanana
                + totalWeightMilk + totalWeightIceCream;// общий вес завтрака в граммах
        System.out.println("Общий вес завтрака в граммах: " + totalWeightBreakfast);
        System.out.println("Общий вес завтрака в килограммах: " + totalWeightBreakfast * 0.001);
    }
    public static void task7(){
        System.out.println("Задача 7");
        short weightLose250 = 250;
        short weightLose500 = 500;
        short totalWeightLose = 7;
        int passWillDays250 = (totalWeightLose * 1000) / weightLose250;
        int passWillDays500 = (totalWeightLose * 1000) / weightLose500;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, уйдет "
                + passWillDays250 + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, уйдет "
                + passWillDays500 + " дней");
        int averageNumberDays = ((passWillDays250 + passWillDays500) / 2);
        System.out.println("В среднем может потребоваться " + averageNumberDays + " день");
    }
    public static void task8(){
        System.out.println("Задача 8");
        int salaryWorkerMaria = 67760;
        int salaryWorkerDenis = 83690;
        int salaryWorkerKristina = 76230;
        int riseSalaryMaria = ((salaryWorkerMaria * 10) / 100) + salaryWorkerMaria;
        int riseSalaryDenis = ((salaryWorkerDenis * 10) / 100) + salaryWorkerDenis;
        int riseSalaryKristina = ((salaryWorkerKristina * 10) / 100) + salaryWorkerKristina;
        int salaryAfterRiseWorkerMaria = (riseSalaryMaria * 12) - (salaryWorkerMaria * 12);
        int salaryAfterRiseWorkerDenis = (riseSalaryDenis * 12) - (salaryWorkerDenis * 12);
        int salaryAfterRiseWorkerKristina = (riseSalaryKristina * 12) - (salaryWorkerKristina * 12);
        System.out.println("Маша теперь получает " + riseSalaryMaria + " рублей. Годовой доход вырос на "
                + salaryAfterRiseWorkerMaria + " рублей");
        System.out.println("Денис теперь получает " + riseSalaryDenis + " рублей. Годовой доход вырос на "
                + salaryAfterRiseWorkerDenis + " рублей");
        System.out.println("Кристина теперь получает " + riseSalaryKristina + " рублей. Годовой доход вырос на "
                + salaryAfterRiseWorkerKristina + " рублей");

    }
}