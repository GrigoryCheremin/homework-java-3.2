public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int growth = 177; // Рост в сантиметрах
        int bodyMass = 85; // Масса тела в килограммах
        int bmi = service.calculate(growth, bodyMass);
        System.out.println ("Индекс массы тела составляет: " + bmi);
    }
}
