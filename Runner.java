class Rectangle {
        public int length, width;
public int Calculatearea() {
    return (length * width);

}
}
public class Runner {
    public static void main(String args[]) {
        Rectangle rect = new Rectangle();
        rect.length = 10;
        rect.width = 5;
        System.out.println(rect.Calculatearea());
    }
}