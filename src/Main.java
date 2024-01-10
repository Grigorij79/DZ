// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AddShape shapeAdd = new AddShape();
        shapeAdd.addShape(new Oval());
        shapeAdd.addShape(new Circle());
        shapeAdd.addShape(new Quad());
        shapeAdd.addShape(new Rhombus());
        shapeAdd.addShape(new Triangle());

    }
}