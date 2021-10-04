package fr.dessin.Point2D;

public class Point3D extends Point2D
{
    private int z;

    public Point3D()
    {

    }

    public Point3D(int vX, int vY, int z) {
        super(vX, vY);
        this.setZ(z);
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void translater(int dX, int dY,int dZ) {
        super.translater(dX, dY);
        this.setZ(this.getZ() + dZ);
    }

    @Override
    public String toString() {
        return "[" + this.getX() + "," + this.getY() + "," + this.getZ() + "]";
    }

    public int hashCode()
    {
        return this.z;
    }

    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
