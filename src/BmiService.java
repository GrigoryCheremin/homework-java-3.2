public class BmiService {
    public int calculate() {
        int growth = 177; // Рост в сантиметрах
        int bodyMass = 85; // Масса тела в килограммах
        int bmi = bodyMass * 10000 / (growth * growth); // 10 000 используется для перевода роста в метры
        return bmi;
    }
}
