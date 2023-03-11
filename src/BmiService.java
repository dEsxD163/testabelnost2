public class BmiService {
    public int calculate(double ves, double rost) {
        double result = (ves / (rost * rost));
        int otvet = (int) result;
        return otvet;
    }
}
