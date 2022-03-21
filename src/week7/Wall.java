package week7;

public class Wall {
    double width, height;

    public  Wall(){

    }
    public Wall(double w, double h){

        if(w < 0){
              w = 0;
        }else{
            width = w;
        }
        if(h < 0){
            height =0;
        }else {
            height = h;
        }
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double a){
        if(a < 0){
            width =0;
        }
    }
    public void setHeight(double b){
        if(b<0){
            height = 0;
        }
    }
    public double getArea(){
        return height * width;
    }

    public static void main(String[] args) {

        Wall wall = new Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
