public class Main {
    public static void main(String[] args) {
    // Задание 1
       byte mouse = 7;
       short cat = 250;
       int dog = 5;
       long elephant = 11500L;
       double sugarWeight = 4.5;
       float saltWeight = 1.5f;
       boolean dogIsAdult = dog > 8;
       char bar = 35;
       System.out.println(bar);
       System.out.println(dogIsAdult);

       // Задание 2
       double boxer1 = 78.2;
       double boxer2 = 82.7;
       double weightOfAllBoxers = boxer1 + boxer2;
       double weightDifference = boxer2 - boxer1;
       System.out.println("общий вес боксеров " + weightOfAllBoxers + " кг" );
       System.out.println("второй боксер тяжелее первого на " + weightDifference + " кг");

       // Задание 3
       double bananasWeightGr = 80;
       double milk100MlWeightGr = 105;
       double IceCreamWeightGr = 100;
       double EggsWeightGr = 70;
       int banana = 5;
       double grWeightAllBananas = bananasWeightGr * banana;
       int milkMl= 2;
       double grWeightAllMilk = milkMl * milk100MlWeightGr;
       int iceCream = 2;
       double grWeightAllIceCream = iceCream * IceCreamWeightGr;
       int egg = 4;
       double grWeightAllEggs = egg * EggsWeightGr;
       double grWeightAllBreakfast = grWeightAllBananas + grWeightAllMilk + grWeightAllIceCream + grWeightAllEggs;
       System.out.println("общий вес спортивного завтрака " + grWeightAllBreakfast + " грамм" );
       double kgBreakfast = grWeightAllBreakfast / 1000;
       System.out.println("Общий вес завтрака спотсмена составляет " + kgBreakfast + " кг.");

       // Задача 4
       int weightLossKg = 7;
       System.out.println("Спортсмену необходимо снизить вес на " + weightLossKg + "кг");
       float diet1Kg = 250 / 1000f;
       System.out.println("Потеря веса в день при питании на рационе 1 = " + diet1Kg + " кг/день");
       float diet2Kg = 500 / 1000f;
       System.out.println("Потеря веса в день при питании на рационе 2 = " + diet2Kg + " кг/день");
       float lossWeight1 = weightLossKg / diet1Kg;
       System.out.println("Потеря веса в 7 кг при питании на рационе 1 произойдет за " + lossWeight1 + " дней");
       float lossWeight2 = weightLossKg / diet2Kg;
       System.out.println("Потеря веса в 7 кг при питании на рационе 2 произойдет за " + lossWeight2 + " дней");
       float mediumDays = ( lossWeight1 - lossWeight2 ) / 2f + lossWeight2;
       System.out.println("Потеря веса в 7 кг может произойти за время от 14 до 28 дней и в среднем за " + mediumDays + " дней");

       // Задача 5
       int MashaSalary = 67_760;
       int DenisSalary = 83_690;
       int KristinSalary = 76_230;
       float MashaSalaryIncrease = MashaSalary / 100 * 10f;
       float DenisSalaryIncrease = DenisSalary / 100 * 10f;
       float KristinSalaryIncrease = KristinSalary /100 * 10f;
       System.out.println("Повышение зарплаты для Маши составит "  + MashaSalaryIncrease + " рублей в месяц");
       System.out.println("Повышение зарплаты для Дениса составит "  + DenisSalaryIncrease + " рублей в месяц");
       System.out.println("Повышение зарплаты для Кристины составит "  + KristinSalaryIncrease + " рублей в месяц");

       float newMashaSalaryForMonth = MashaSalary + MashaSalaryIncrease;
       float newDenisSalaryForMonth = DenisSalary + DenisSalaryIncrease;
       float newKristinSalaryForMonth = KristinSalary + KristinSalaryIncrease;

       float newMashaSalaryForYear = (MashaSalary + MashaSalaryIncrease) * 12f;
       float newDenisSalaryForYear = (DenisSalary + DenisSalaryIncrease) * 12f;
       float newKristinSalaryForYear = (KristinSalary + KristinSalaryIncrease) * 12f;
       System.out.println("Новая заработная плата за месяц для Маши составит "
               + newMashaSalaryForMonth + " рублей и " + newMashaSalaryForYear + " рублей  за год");
       System.out.println("Новая заработная плата за месяц для Дениса составит " + newDenisSalaryForMonth +
               " рублей и " + newDenisSalaryForYear + " рублей  за год");
       System.out.println("Новая заработная плата за месяц для Кристины составит " + newKristinSalaryForMonth +
               " рублей и " + newKristinSalaryForYear + " рублей  за год");

       float oldMashaSalaryForYear = MashaSalary * 12f;
       float oldDenisSalaryForYear = DenisSalary * 12f;
       float oldKristinSalaryForYear = KristinSalary * 12f;

       float wageGrownMashaSalaryForYear = newMashaSalaryForYear - oldMashaSalaryForYear;
       float wageGrownDenisSalaryForYear = newDenisSalaryForYear - oldDenisSalaryForYear;
       float wageGrownKristinSalaryForYear = newKristinSalaryForYear - oldKristinSalaryForYear;
       System.out.println("Новая годовая заработная плата для Маши выросла на " + wageGrownMashaSalaryForYear +
               " рублей, к прошлому году. ");
       System.out.println("Новая годовая заработная плата для Дениса выросла на " + wageGrownDenisSalaryForYear +
               " рублей, к прошлому году. ");
       System.out.println("Новая годовая заработная плата для Кристины, выросла на " + wageGrownKristinSalaryForYear +
               " рублей, к прошлому году. ");




    }
}