package fr.dessin.Point2D;

public class Main {

    public static void main(String[] args) {

        Point2D point2d = new Point2D();
        point2d.afficher();
        point2d.translater(35, 40);
        point2d.afficher();



        Point2D point2dd = new Point2D(5,4);
        point2dd.afficher();
        point2dd.translater(40,52);
        point2dd.afficher();

        System.out.println(Point2D.getCompteur());

        Point3D point3D = new Point3D();
        point3D.setX(5);
        point3D.setY(10);
        point3D.setZ(8);
        System.out.println(point3D.toString());
        System.out.println(point3D.getClass().equals(point2d.getClass()));
    }
}
