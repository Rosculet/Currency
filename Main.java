import java.time.DayOfWeek;
import java.util.Currency;
import java.util.EnumMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        currentConverter(80, MyCurrency.RUB, MyCurrency.EUR);
        currentConverter(100, MyCurrency.AUD, MyCurrency.RUB);

        /*
        Я понимаю что цель ДЗ отработать Мапы, что-то типо нижезакоменнтированного, но само задание можно
        и без Мапы сделать.

        EnumMap enumMap = new EnumMap(MyCurrency.class);
        HashMap<MyCurrency, Double> currencyMap1 = new HashMap<>();
        HashMap<MyCurrency, Double> currencyMap2 = new HashMap<>();
        enumMap.put(MyCurrency.EUR, 1);
        currencyMap1.put(MyCurrency.AUD, MyCurrency.AUD.title);
        currencyMap2.put(MyCurrency.AUD, 0.67);
        */

    }

    public static double currentConverter (int amount, MyCurrency currency1, MyCurrency currency2) {
        double convert = amount * currency2.title * currency1.title;
        System.out.printf("%s %s is %.2f %s \n", amount, currency1, convert, currency2);
        return convert;
    }


}