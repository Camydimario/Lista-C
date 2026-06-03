package aguaParalasovejas;
//es la clase punto del problema de agua para las ovejas 

public class Puntos {

	private int x; // Norte (+) / Sur (-)
    private int y; // Este (+) / Oeste (-)

    public Puntos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
