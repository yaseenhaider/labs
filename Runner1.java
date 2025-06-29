class Rectangle{
    public int length,width;
    public Rectangle()
    {
        length=5;
        width=2;
    }
    public Rectagle(int 1, int w){
        length=1;
        width = w;

    }
    public int Calculatearea(){
        return (length*width);

    }
}
public class Runner1{
    public static void main(String[] args){
        Rectangle rect =new Rectangle();
        System.out.println(rect.Calculatearea());
        // Rectangle react1=new Rectangle(10,20);

    }
}