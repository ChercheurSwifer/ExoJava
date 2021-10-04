package fr.dessin.Point2D;

public class Point2D {

    private static int compteur;
    private Integer x;
    private Integer y;

    public Point2D() {
        this.setX(0);
        this.setY(0);
    }

    public Point2D(Integer vX, Integer vY) {
        this.setX(vX);
        this.setY(vY);
        Point2D.compteur++;
    }

    public void afficher()
    {
        System.out.println("["
                .concat(this.getX().toString())
                .concat(",")
                .concat(this.getY().toString())
                .concat("]")
        );
    }

    public Integer getX() {
        return x;
    }
    public Integer getY() {
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
        this.setX(this.getX() + dX);
        this.setY(this.getY() + dY);
    }

    public static int getCompteur() {
        return Point2D.compteur;
    }
}
