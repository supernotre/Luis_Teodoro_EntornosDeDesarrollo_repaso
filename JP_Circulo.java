public class JP_Circulo {
    private int id;
    private double radio;
    private String color;
    
    // Constructor
    public JP_Circulo(int id, double radio, String color) {
        this.id = id;
        this.radio = radio;
        this.color = color;
    }    

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    // Método toString
    @Override
        public String toString() {
            return "JP_Circulo [id=" + id + ", radio=" + radio + ", color=" + color + "]";
        }
    
}
