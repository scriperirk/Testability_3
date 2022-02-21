public class CreditPaymentService {
    public double calculate(int credit, double procent, double term){

        double i = Math.round((procent/100/12)*1000000)/1000000.0d;
        //double degree = Math.pow((1+i),term)-1;
        double degree = Math.round((Math.pow((1+i),term)-1)*1000000)/1000000.0d;
        double payments = credit * (i + (i/degree));

        return payments;
    }
}