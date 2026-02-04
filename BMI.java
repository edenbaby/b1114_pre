public class BMI {
    private double value;
    private String category;
    
    public BMI(double weight, double height) {
        this.value = calculateBMI(weight, height);
        this.category = determineCategory(this.value);
    }
    
    private double calculateBMI(double weight, double height) {
        if (height <= 0 || weight <= 0) {
            throw new IllegalArgumentException("Weight and height must be positive values");
        }
        return weight / (height * height);
    }
    
    private String determineCategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal weight";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    
    public double getValue() {
        return value;
    }
    
    public String getCategory() {
        return category;
    }
    
    public String getHealthAdvice() {
        switch (category) {
            case "Underweight":
                return "Consider consulting a healthcare provider about healthy weight gain strategies.";
            case "Normal weight":
                return "Great! Maintain your current lifestyle with balanced diet and regular exercise.";
            case "Overweight":
                return "Consider adopting a healthier diet and increasing physical activity.";
            case "Obese":
                return "It's recommended to consult with a healthcare provider for a comprehensive health plan.";
            default:
                return "Please consult with a healthcare provider.";
        }
    }
    
    public static String getCategoryRanges() {
        return """
               BMI Categories:
               • Underweight: BMI < 18.5
               • Normal weight: BMI 18.5-24.9
               • Overweight: BMI 25.0-29.9
               • Obese: BMI ≥ 30.0
               """;
    }
    
    @Override
    public String toString() {
        return String.format("BMI: %.2f (%s)", value, category);
    }
}