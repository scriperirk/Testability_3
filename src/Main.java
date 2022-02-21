public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        //год
        double payments1 = service.calculate(1_000_000, 9.9, 12);
        System.out.println("Ежемесячный платеж: " +(int) payments1);

        //два
        double payments2 = service.calculate(1_000_000, 9.9, 24);
        System.out.println("Ежемесячный платеж: " + (int) payments2);

        //три
        double payments3 = service.calculate(1_000_000, 9.9,36);
        System.out.println("Ежемесячный платеж: " + (int) payments3);
    }
}