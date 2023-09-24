public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.hello();

        Test test = new Test();
        test.hello();
    }

    public void hello(){
        System.out.println("Hello");
    }
}