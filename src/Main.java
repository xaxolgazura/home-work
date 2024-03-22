import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxerWeight = 82.7;
        System.out.println(firstBoxerWeight);
        var secondBoxerWeight = 78.2;
        System.out.println(secondBoxerWeight);
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(firstBoxerWeight + secondBoxerWeight);
        var differenceWeight = firstBoxerWeight - secondBoxerWeight;
        System.out.println(firstBoxerWeight - secondBoxerWeight);
        var remnantWeight = (firstBoxerWeight / secondBoxerWeight) % differenceWeight;
        System.out.println(firstBoxerWeight / secondBoxerWeight);


        var workHours = 640.0;
        System.out.println(workHours);
        var everyEmployee = 8;
        System.out.println(everyEmployee);
        var totalEmployees = (workHours / everyEmployee);
        System.out.println("Всего работников в компании " + workHours / everyEmployee + " человек");
        totalEmployees = totalEmployees + 94;
        System.out.println("Всего работников в компании " + totalEmployees + " человек");
        var everyWorkerHours = (workHours / totalEmployees);
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + everyWorkerHours + " часов работы может быть поделено между сотрудниками");

        byte a = 30;
        System.out.println(a);
        short b = 30_000;
        System.out.println(b);
        int c = 3_000_000;
        System.out.println(c);
        Long d = 3_000_000_000_000_000_000L;
        System.out.println(d);

        float e = 27.12f;
        System.out.println(e);
        Long f = 987_678_965_549L;
        System.out.println(f);
        float g = 2.786f;
        System.out.println(g);
        short k = 569;
        System.out.println(a);
        short v = -159;
        System.out.println(v);
        short m = 27897;
        System.out.println(c);
        byte s = 67;
        System.out.println(s);

        byte lydmilaPalovna = 23;
        System.out.println(lydmilaPalovna);
        byte annaSergeevna = 27;
        System.out.println(annaSergeevna);
        byte ekaterinaAndreevna = 30;
        System.out.println(ekaterinaAndreevna);
        byte totalStudents = 80;
        System.out.println(totalStudents);
        int totalSheets = 480;
        System.out.println(totalSheets);
        int forEachStudent = (totalSheets / totalStudents);
        System.out.println("На каждого ученика рассчитано " + totalSheets / totalStudents + " листов бумаги");


        byte bottlesProducedMachine = 16;
        System.out.println(bottlesProducedMachine);
        byte Minutes = 2;
        System.out.println(Minutes);
        int in1Minute = (bottlesProducedMachine / Minutes);
        System.out.println(bottlesProducedMachine / Minutes);
        byte in20Minute = 20;
        System.out.println(in20Minute);
        int timeMinute = (in20Minute * in1Minute);
        System.out.println("За 20 минут машина производит " + in20Minute * in1Minute + " штук бутылок");
        short forDay = 1440;
        System.out.println(forDay);
        int perDay = (forDay * in1Minute);
        System.out.println("За сутки машина производит " + forDay * in1Minute + " штук бутылок");
        int for3Day = 4320;
        System.out.println(for3Day);
        int in3Days = (for3Day * in1Minute);
        System.out.println("За 3 суток машина производит " + for3Day * in1Minute + " штук бутылок");
        int perMonth = 43200;
        System.out.println(perMonth);
        int in1Month = (perMonth * in1Minute);
        System.out.println("За 1 месяц машина производит " + perMonth * in1Minute + " штук бутылок");

        byte totalPaintСans = 120;
        System.out.println(totalPaintСans);
        byte brownPaint = 4;
        System.out.println(brownPaint);
        byte whitePaint = 2;
        System.out.println(whitePaint);
        int paint1Classes = (brownPaint + whitePaint);
        System.out.println(brownPaint + whitePaint);
        int totalClasses = (totalPaintСans / paint1Classes);
        System.out.println(totalPaintСans / paint1Classes);
        int totalWhite = (totalClasses * whitePaint);
        System.out.println(totalClasses * whitePaint);
        int totalBrown = (totalClasses * brownPaint);
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");

        int bannans = 80;
        System.out.println(bannans);
        bannans = bannans * 5;
        System.out.println(bannans);
        int milk = 105;
        System.out.println(milk);
        milk = milk * 2;
        System.out.println(milk);
        int iceСream = 100;
        System.out.println(iceСream);
        iceСream = iceСream * 2;
        System.out.println(iceСream);
        int rawEggs = 70;
        System.out.println(rawEggs);
        rawEggs = rawEggs * 4;
        System.out.println(rawEggs);
        int totalWeightBreakfast = (bannans + milk + iceСream + rawEggs);
        System.out.println("Объщий вес спортзавтрака " + (bannans + milk + iceСream + rawEggs) + " грамм");
        float onKg = 1.090f;
        System.out.println("Объщий вес спортзавтрака " + onKg + " кг");

        byte loseWeight = 7;
        System.out.println(loseWeight);
        float firstWay = 0.250f;
        System.out.println(firstWay);
        float secondWay = 0.500f;
        System.out.println(secondWay);
        float firstLoseWeight = (loseWeight / firstWay);
        System.out.println("Потребуеться " + loseWeight / firstWay + " дней для первого способа ");
        float secondLoseWeight = (loseWeight / secondWay);
        System.out.println("Потребуеться " + loseWeight / secondWay + " дней для второго способа");


        int getsMasha = 67_760;
        System.out.println(getsMasha);
        int getDenis = 83_690;
        System.out.println(getDenis);
        int getKristina = 76_230;
        System.out.println(getKristina);
        int salaryDifferentialMasha = 6776;
        System.out.println(salaryDifferentialMasha);
        int salaryDifferentialDenis = 8369;
        System.out.println(salaryDifferentialDenis);
        int salaryDifferentialKristina = 7623;
        System.out.println(salaryDifferentialKristina);
        int аnnualIncomeMasha = getsMasha + salaryDifferentialMasha;
        System.out.println("Маша теперь получает " + (getsMasha + salaryDifferentialMasha) + " рублей. Годовой доход вырос на " + salaryDifferentialMasha + " рублей ");
        int аnnualIncomeDenis = getDenis + salaryDifferentialDenis;
        System.out.println("Денис теперь получает " + (getDenis + salaryDifferentialDenis) + " рублей. Годовой доход вырос на " + salaryDifferentialDenis + " рублей ");
        int аnnualIncomeKristina = getKristina + salaryDifferentialKristina;
        System.out.println("Кристина теперь получает " + (getKristina + salaryDifferentialKristina) + " рублей. Годовой доход вырос на " + salaryDifferentialKristina + " рублей ");


        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else if (age < 18) {
            System.out.println("Если возраст человека меньше " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
        int temperatyre = 4;
        if (temperatyre < 5) {
            System.out.println("На улице " + temperatyre + " градусов, нужно надеть шапку");
        }
        int temperatyre2 = 6;
        if (temperatyre2 > 5) {
            System.out.println("На улице " + temperatyre2 + " градусов, можно идти без шапки");
        }
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то прийдется заплатить штраф");
        }
        int speed2 = 59;
        if (speed2 < 60) {
            System.out.println("Если скорость " + speed2 + "км/ч, то можно ездить спокойно");
        }

        int agePerson = 6;
        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека равен  " + agePerson + " лет то ему нужно ходить в детский сад");
        } else {
            System.out.println("Если возраст человека " + agePerson + " то он не ходит в детский сад");
        }
        int agePerson2 = 16;
        if (agePerson2 >= 7 && agePerson2 <= 16) {
            System.out.println("Если возраст человека равен  " + agePerson2 + " то ему нужно ходить в школу");
        } else {
            System.out.println("Если возраст человека  " + agePerson2 + " то ему не нужно ходить в школу");
        }
        int agePerson3 = 24;
        if (agePerson3 >= 18 && agePerson3 <= 24) {
            System.out.println("Если возраст человека равен  " + agePerson3 + " то ему нужно ходить в институт");
        } else {
            System.out.println("Если возраст человека " + agePerson3 + " то ему не нужно ходить в институт");
        }
        int agePerson4 = 25;
        if (agePerson4 >= 25) {
            System.out.println("Если возраст человека равен " + agePerson4 + " то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека меньше " + agePerson4 + " то ему не нужно ходить на работу");
        }

        int agePerson5 = 15;
        if (agePerson5 < 5) {
            System.out.println("Если возраст ребенка меньше " + agePerson5 + " то ему нельзя кататься на аттракционе");
        } else if (agePerson5 > 5 && agePerson5 <= 14) {
            System.out.println("Если возраст ребенка равен " + agePerson5 + " то он может кататься на аттракционе в сопровождении взрослого");
        } else if (agePerson5 >= 14) {
            System.out.println("Если возраст ребенка больше " + agePerson5 + " то он может кататься на аттракционе без сопровождения взрослых");
        }

        int human = 60;
        if (human < 102 && human >= 60) {
            System.out.println("В вогоне есть седячие " + (human) + " и еще 42 стоячих места");
        } else {
            System.out.println("Вагон уже полностью забит");

        }
        int one = 20;
        int two = 200;
        int three = 2000;
        if (one < three) {
            System.out.println("Число " + (three) + " больше остольных");
        } else if (one < two && two < three) {
            System.out.println("Какое чесло будет больше");
        }

        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else  if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        int clientDeviceYear = 2016;
        if (clientDeviceYear > 2015 && clientOS==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if(clientDeviceYear <= 2015 && clientOS==1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }if (clientDeviceYear > 2015 && clientOS==0){
            System.out.println("Установите версию приложения для IOS по ссылке");
        }else if (clientDeviceYear <= 2015 && clientOS==0){
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
        int year = 2024;
        if(year < 1584){
            System.out.println("Год должен быть больше, чем 1584");
        }else if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0){
            System.out.println("Год " + year + " Высокосный");
        }else {
            System.out.println("Год " + year + " не является высокосным");
        }
        int deliveryDistanse = 100;
        int days = 1;
        if (deliveryDistanse < 20){
            System.out.println("Потребуется дней " + days);
        }else if (deliveryDistanse >= 20 && deliveryDistanse <60) {
            System.out.println("Потребуется дней " + (days + 1));
        }else if(deliveryDistanse >= 60 && deliveryDistanse <= 100){
            System.out.println("Потребуется дней " + (days + 2));
        }else if(deliveryDistanse > 100) {
            System.out.println("Доставки нет");
        }
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println("Зимние месяцы");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Весенние месяцы");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Летние месяцы");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Осенние месяцы");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }




    }

}