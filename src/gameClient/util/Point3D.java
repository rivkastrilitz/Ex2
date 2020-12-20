/**
 * This class represents a 3D point in space.
 */
package gameClient.util;

import api.geo_location;

import java.io.Serializable;

/**
 * this class represent a 3 dimensional point
 * this code is based on a code of boaz.benmoshe
 */
public class Point3D implements geo_location, Serializable{

	private static final long serialVersionUID = 1L;

    public static final double EPS1 = 0.001, EPS2 = Math.pow(EPS1,2), EPS=EPS2;
    /**
     * This field represents the origin point:[0,0,0]
     */
    public static final Point3D ORIGIN = new Point3D(0,0,0);

    private double _x,_y,_z;

    /**
     * constructor to the Point3D by x y z values
     * @param x
     * @param y
     * @param z
     */
    public Point3D(double x, double y, double z) {
        _x=x;
        _y=y;
        _z=z;
    }

    /**
     * copy constructor to the Point3D
     * @param p
     */
    public Point3D(Point3D p) {
       this(p.x(), p.y(), p.z());
    }

    /**
     * constructor to the Point3D just by x y
     * @param x
     * @param y
     */
    public Point3D(double x, double y) {this(x,y,0);}

    /**
     * constructor to the Point3D by a string that cinatin information about the point
     * @param s
     */
    public Point3D(String s) { try {
            String[] a = s.split(",");
            _x = Double.parseDouble(a[0]);
            _y = Double.parseDouble(a[1]);
            _z = Double.parseDouble(a[2]);
        }
        catch(IllegalArgumentException e) {
            System.err.println("ERR: got wrong format string for POint3D init, got:"+s+"  should be of format: x,y,x");
            throw(e);
        }
    }

    /**
     * return the x value of the point
     * @return
     */
    @Override
    public double x() {return _x;}

    /**
     * return the y value of the point
     * @return
     */
    @Override
    public double y() {return _y;}

    /**
     * return the z value of the point
     * @return
     */
    @Override
    public double z() {return _z;}

    /**
     * return the information of the point as a string
     * @return
     */
    public String toString() { return _x+","+_y+","+_z; }
    @Override
    /**
     * return the distance between to points
     */
    public double distance(geo_location p2) {
        double dx = this.x() - p2.x();
        double dy = this.y() - p2.y();
        double dz = this.z() - p2.z();
        double t = (dx*dx+dy*dy+dz*dz);
        return Math.sqrt(t);
    }

    /**
     * an equals function return true if two point are equal
     * @param p
     * @return
     */
    public boolean equals(Object p) {
        if(p==null || !(p instanceof geo_location)) {return false;}
        Point3D p2 = (Point3D)p;
        return ( (_x==p2._x) && (_y==p2._y) && (_z==p2._z) );
    }
}

