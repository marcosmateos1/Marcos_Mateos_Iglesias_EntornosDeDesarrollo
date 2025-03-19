public class MMI_Circulo {
    private double radio;
    private String color;
    private static final double PI = 3.14159265; // Evita el número mágico
    
    public MMI_Circulo(double radio, String color) {
            this.radio = radio;
            this.color = color;
        }
    
    public double getRadio() { return radio; }
    
    public double calcularArea() {
            return radio * radio * PI; // Usamos la constante en lugar del número mágico
        }
    
        @Override
    public String toString() {
            return "Círculo de color " + color + " con radio " + radio;
        }
    }
        ///@author Marcos
        /// @version 1.0