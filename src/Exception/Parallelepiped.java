package Exception;
public class Parallelepiped {


    public double getSquarP(double height,double length, double width){
        double sq = 2 * ((height * length) + (length * width) + (height * width));
        return sq;
    }
    public double getVolumeP(double length, double width, double height){
        double v= (length * width * height);
        return v;
    }

}
