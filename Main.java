public class Main  {
    public static void main(String[] args) {
        // Instanciamos un cuadrado y un círculo
        MMI_Circulo MII_Circulo1 = new MMI_Circulo(3, "verde");
        MMI_Rectangulo MMI_Rectangulo1 = new MMI_Rectangulo(3, 3, "rojo");

        // Calcula área cuadrado LadoA * LadoB
        double ladoA = MMI_Rectangulo1.getLadoA();
        double ladoB = MMI_Rectangulo1.getLadoB();
        double area1 = ladoA * ladoB;
        System.out.println("Área cuadrado: " + area1);

        // Calcula área círculo pi*R²
        double radio1 = MII_Circulo1.getRadio();
        double area2 = radio1 * 3.14;
        System.out.println("Área círculo: " + area2);

        // Diferencia entre áreas de cuadrado y círculo
        double diferencia = getDiferencia(area1, area2);
        System.out.println("Diferencia áreas: " + diferencia);

        // Imprimir datos
        System.out.println("Cuadrado: " + MMI_Rectangulo1);
        System.out.println("Círculo: " + MII_Circulo1);
        System.out.println("Diferencia: " + diferencia);
    }

    private static double getDiferencia(double area1, double area2) {
        double diferencia = area1 - area2;
        return diferencia;
    }
}
        ///@author Marcos
        /// @version 1.0