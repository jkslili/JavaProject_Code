package base.reload;

public class Son extends Dada{
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {

    }

    public static void main(String[] args) {
        Dada dada = new Dada();
        String name = "张三";
        dada.setName(name);
        Son son = new Son();
        System.out.println(son.getName());

    }
}
