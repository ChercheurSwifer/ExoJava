package fr.dessin.Point2D;

public class Point2D {

    private int x = 3;
    private int y = 2;

    public void afficher()
    {
        System.out.println(x);
        System.out.println(y);
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public void translater(int dX, int dY)
    {
        this.x = dX;
        this.y = dY;
    }
}
