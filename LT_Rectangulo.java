public class LT_Rectangulo {
    private int id;
    private double ladoA;
    private double ladoB;
    private String color;
    
    //Aquí está el Constructor
public LT_Rectangulo(int id, double ladoA, double ladoB, String color) {
        this.id = id;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.color = color;
    }

  //Aquí los getter y setter
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


//Aquí el toString
@Override
public String toString() {
    return "LT_Rectangulo [id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + "]";
}

      
    

}
