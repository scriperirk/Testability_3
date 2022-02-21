public class CreditPaymentService {
    public double calculate(int credit, double procent, int term){
        double payments = (((procent / 1200 * (Math.pow((1 + procent / 1200), term))) / (Math.pow((1 + procent / 1200), procent) - 1)) * credit);
        return payments;
    }
}