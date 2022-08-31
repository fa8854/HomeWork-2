public class Main {
    public static void main(String[] args) {
    homeWork1();
    homeWork2();
    homeWork3();
    homeWork4();
    homeWork5();
    homeWork6();
    homeWork7();
    homeWork8();
    }
    public static void homeWork1(){
        System.out.println("Задача 1");
        int i = 10;
        byte b = 10;
        short s = 10;
        long l = 10;
        float f = 10f;
        double d = 10.0;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
        System.out.println();

    }
    public static void homeWork2(){
        System.out.println("Задача 2");
        double d = 27.12;
        long l = 987678965549L;
        float f = 2.768f;
        boolean b = false;
        short s = 569;
        int i1 = -159;
        int i2= 27897;
        byte b1 = 67;
        System.out.println(d);
        System.out.println(l);
        System.out.println(f);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println();


    }
    public static void homeWork3(){
        System.out.println("Задача 3");
        int ludPavlovna = 23;
        int annaSergeevna = 27;
        int ekatAndreevna = 30;
        int paper = 480;
        int calculation = paper / (ludPavlovna + annaSergeevna + ekatAndreevna);
        System.out.println( "На каждого ученика рассчитано " + calculation + " листов бумаги");
        System.out.println();
    }
    public static void homeWork4(){
        System.out.println("Задача 4");
        int bottle = 16;
        int timeWork = 2;
        int timeWork20m = 20;
        int timeWork1d = 24;
        int timeWork3d = 3;
        int timeWork31d = 31;
        int calculation = bottle / timeWork;
        int work20M = timeWork20m * calculation;
        int work1d = (timeWork1d * 60) * calculation;
        int work3d = ((timeWork3d * timeWork1d)* 60) * calculation;
        int work31d = ((timeWork31d * timeWork1d)* 60) * calculation;
        System.out.println( "За " + timeWork20m +  " минут машина произвела бутылок " + work20M + " штук ");
        System.out.println( "За " + timeWork1d +  " часа машина произвела бутылок " + work1d + " штук ");
        System.out.println( "За " + timeWork3d +  " дня машина произвела бутылок " + work3d + " штук ");
        System.out.println( "За " + timeWork31d +  " день машина произвела бутылок " + work31d + " штук ");
        System.out.println();

    }
    public static void homeWork5(){
        System.out.println("Задача 5");
        int paintBottle = 120;
        int oneClassWhitePaint = 2;
        int oneClassBrownPaint = 4;
        int Class = paintBottle / (oneClassWhitePaint + oneClassBrownPaint);
        int whitePaint = Class * oneClassWhitePaint;
        int brownPaint = Class * oneClassBrownPaint;
        System.out.println("В школе, где " + Class +  " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");
        System.out.println();
    }
    public static void homeWork6(){
        System.out.println("Задача 6");
        int banans = 5;
        int oneBanan = 80;
        int milk = 200;
        int milk100 = 105;
        int iceCream = 2 ;
        int oneIceCream = 100;
        int eggs = 4;
        int oneEgg = 70;
        int weightBanans = banans * oneBanan;
        int weightMilk = (milk / 100) * milk100;
        int weightIceCream = iceCream * oneIceCream;
        int weightEggs = eggs * oneEgg;
        int weightSheak = weightBanans + weightMilk + weightIceCream + weightEggs;
        float weightToKg = weightSheak / 1000f;
        System.out.println("Вес завтрака состовляет "+ weightToKg + " кг");
        System.out.println();
    }
    public static void homeWork7(){
        System.out.println("Задача 7");
        int spotsman = 7;
        double program250 = 0.250;
        double program500 = 0.500;
        double weight250 =  spotsman / program250 ;
        double weight500 =  spotsman / program500;
        double middleDay = (weight500 + weight250) / 2;
        System.out.println("Похудеет на 7 кг за " +(int) weight250 + " дней");
        System.out.println("Похудеет на 7 кг за " +(int) weight500 + " дней");
        System.out.println();
    }
    public static void homeWork8(){
        System.out.println("Задача 8");
        int masha = 67_760;
        int denis = 83_690;
        int kristina = 76_230;
        var percent = 1.1;
        var newSalaryMasha = masha * percent;
        var newSalaryDenis = denis * percent;
        var newSalaryKristina = kristina * percent;

        System.out.println("разница для сотрудника Маша между новой "+ newSalaryMasha + " и старой " + masha + " зарплатой " + (newSalaryMasha - masha) );
        System.out.println("разница для сотрудника Маша между новой "+ newSalaryDenis + " и старой " + denis + " зарплатой " + (newSalaryDenis - denis) );
        System.out.println("разница для сотрудника Маша между новой "+ newSalaryKristina + " и старой " + kristina + " зарплатой " + (newSalaryKristina - kristina) );


    }

}