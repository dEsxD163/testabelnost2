public class BmiService {
    public int calculate(double weight, double height) {
        double result = (weight / (height * height));
        int answer = (int) result;
        return answer;
    }
}
