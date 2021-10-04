package fr.dessin.Point2D;

public class Main {

    public static void main(String[] args) {

        Point2D point2d = new Point2D();
        point2d.afficher();
        point2d.translater(point2d.getX(), point2d.getY());
    }
}
