public class Main {
    byte a = 1;
    int b = 2;
    short c = 3;
    long d = 1L;
    float e = 1.5f;
    double f = 1.85;
    char g = 152;
    boolean h = true;

    public static void main (String[] agrs) {
        double firstBoxer = 78.2;
        double secondBoxer = 82.7;
        double totalWeight = firstBoxer + secondBoxer;
        System.out.println("общий вес " + totalWeight + "кг! ");
        double difference = secondBoxer - firstBoxer;
        System.out.println ("второй боксер тяжелее на " + difference + " кг!" );

        byte bananas = 5;
        byte banana = 80;
        int milk = 200;
        int mlMilk = 105;
        byte iceCream = 2;
        byte briquetteIceCream = 100;
        int bananaWeight = bananas * banana;
        int milkWeight = milk * mlMilk;
        int iceCremWeight = iceCream * briquetteIceCream;
        int totalWeightFood = bananaWeight + milkWeight + iceCremWeight;
        System.out.println("общий вес спрот-завтрака " + totalWeightFood + " грам" );
        float kg = totalWeightFood / 1000f;
        System.out.println("общий вес спрот-завтрака в килограммах " + kg);

        byte excessWeight = 7;
        int excessWeightKg = excessWeight * 1000;
        int weightLoss1 = 250;
        int weightLoss2 = 500;
        int days1 = excessWeightKg / weightLoss1;
        int days2 = excessWeightKg / weightLoss2;
        System.out.println(days1 + " дней уйдет на сброс 7 кг");
        System.out.println(days2 + " дней удет на сброс 7 кг" );

        long mashaNow = 67_760;
        long denisNow = 83_690;
        long kristinaNow = 76_230;
        float mashaSalaryIncrese = mashaNow + mashaNow * 0.1f;
        float denisSalaryIncrese = denisNow + denisNow * 0.1f;
        float kristinaSalaryIncrese = kristinaNow + kristinaNow * 0.1f;
        long mashaAnnualIncome = mashaNow * 12;
        long denisAnnualIncome = denisNow * 12;
        long kristinaAnnualIncome  = kristinaNow * 12;
        float mashaAnnualIncomIncreased = mashaSalaryIncrese * 12;
        float denisAnnualIncomIncreased= denisSalaryIncrese * 12;
        float kristinaAnnualIncomIncreased = kristinaSalaryIncrese * 12;
        float mashaDifference = mashaAnnualIncomIncreased - mashaAnnualIncome;
        float denisDifference = denisAnnualIncomIncreased - denisAnnualIncome;
        float kristinaDifference = kristinaAnnualIncomIncreased - kristinaAnnualIncome;
        System.out.println("Маша теперь плучае " + mashaSalaryIncrese + " рублей в месяц. " + "Годовой доход вырос на " + mashaDifference + " рублей." );
        System.out.println("Денис теперь получает " + denisSalaryIncrese + " рублей в месяц. " + "Годовой доход вырос на " + denisDifference + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaSalaryIncrese + " рублей в месяц. " + "Годовой доход вырос на " + kristinaDifference + " рублей.");

    }
}

