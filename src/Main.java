public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.78; // мой рост =)
        double weight = 66; // мой вес =)
        int bmiIndex = service.calculate(weight, height);
        System.out.println(bmiIndex);
    }
}