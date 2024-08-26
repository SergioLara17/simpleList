public class App{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        SimpleList<String> list = new SimpleList<>();

        list.add("Hola 1");
        list.add("Hola 2");
        list.add("Hola 3");
        list.addFromStart("Hola 0");

        list.showList();

    }
}
