public class Shape implements ShapePrint {
    private String name;


    public String getName() {
        return name;
    }

    @Override
    public void shapePrint() {
        System.out.println(getName());
    }
}