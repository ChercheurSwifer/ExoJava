package fr.dessin.Point2D;

public class Point2D {

    private static int compteur;
    private Integer x;
    private Integer y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
        getCompteur();
    }

    public Point2D(Integer vX, Integer vY) {
        this.x = vX;
        this.y = vY;
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
        return compteur;
    }
}
