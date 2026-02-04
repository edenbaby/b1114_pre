public class Person {
    private String name;
    private double weight; // in kilograms
    private double height; // in meters
    private int age;
    
    public Person(String name, double weight, double height, int age) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public double getHeight() {
        return height;
    }
    
    public int getAge() {
        return age;
    }
    
    // Setters
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return String.format("Person{name='%s', weight=%.1f kg, height=%.2f m, age=%d}", 
                           name, weight, height, age);
    }
}