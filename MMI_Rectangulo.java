public class MMI_Rectangulo {
    // Atributos
    private int id;
    private double ladoA;
    private double ladoB;
    private String color;

    // Constructor por defecto
    public MMI_Rectangulo() {
    }

    // Constructor con todos los argumentos (excepto id)
    public MMI_Rectangulo(double ladoA, double ladoB, String color) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.color = color;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método toString
    @Override
    public String toString() {
        return "Rectángulo {" +
               "ladoA=" + ladoA +
               ", ladoB=" + ladoB +
               ", color='" + color + "'" +
               '}';
    }
}
