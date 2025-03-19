public class MMI_Circulo {
    private int id;
    private double radio;
    private String color;


    // Constructor por defecto
    public MMI_Circulo() {
    }


    // Constructor con parámetros (sin id)
    public MMI_Circulo(int id, double radio, String color) {
            this.id = id;
            this.radio = radio;
            this.color = color;
        }

    // Getters y Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método toString()
    @Override
    public String toString() {
        return "MMI_Circulo [id=" + id + ", radio=" + radio + ", color=" + color + "]";
    }

}
