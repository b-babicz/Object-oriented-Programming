package com.company;

public class Punkt3D extends Punkt2D{
    private int z;

    public Punkt3D()
    {

    }
    public Punkt3D(int x, int y, int z)
    {
        super(x,y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + ", z wynosi: " + this.z;
    }
}
