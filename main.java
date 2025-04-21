public class main {

    public static void main(String[] args) {
        // Instanciamos un Rectangulo y un círculo
        JP_Circulo JP_Circulo1 = new JP_Circulo(5, 3, "verde");
        LT_Rectangulo LT_Rectangulo1 = new LT_Rectangulo(7, 3, 4, "rojo");

        // Calcula área del Rectangulo: LadoA * LadoB
        double ladoA = LT_Rectangulo1.getLadoA();
        double ladoB = LT_Rectangulo1.getLadoB();
        double area1 = ladoA * ladoB;
        System.out.println("Área Rectangulo: " + area1);

        // Calcula área del círculo: π * R^2
        double radio1 = JP_Circulo1.getRadio();
        double area2 = radio1 * radio1 * 3.14;
        System.out.println("Área círculo: " + area2);

        // Diferencia entre áreas de Rectangulo y círculo
        double diferencia = area1 - area2;
        System.out.println("Diferencia áreas: " + diferencia);

        // Imprimir datos
        System.out.println("Rectangulo: " + LT_Rectangulo1);
        System.out.println("Círculo: " + JP_Circulo1);
        System.out.println("Diferencia: " + diferencia);

    }
}