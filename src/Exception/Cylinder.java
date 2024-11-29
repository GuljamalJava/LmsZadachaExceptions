package Exception;
public class Cylinder {

    public double getSquareCylender(double radius,double height){
      double sqC=  2 * Math.PI * radius * (height + radius);
      return sqC;
    }
    public double getVolumeCylender(double radius,double height){
        double vol =(Math.PI * radius * radius * height);
        return vol;
    }

}
