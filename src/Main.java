public class Main {
    public static void main(String[] args) {

        int total = 10000; // денег на счету
        int refill = 1000; // сумма пополнения
        int bonusRubls = 0; // бонусные рубли

        if (refill > 1000) {
            bonusRubls = refill / 100;
            total = total + refill + bonusRubls;
        } else {
            total = total + refill;
        }
        System.out.println("На счету: " + total);
        System.out.println("Бонусных рублей: " + bonusRubls);
    }
}
