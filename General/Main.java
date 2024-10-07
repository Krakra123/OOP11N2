public class Main {

    public static class Foo {
        Foo() { value = 5; }

        public int value;

        public int Do(int a = 4) {
            return 10;
        }
    }

    public static void main(String[] args) {
        Foo[] a = new Foo[10];
        int x = 0;
        while (x < 10) {
            a[x] = new Foo();
            x = x + 1;
        }

        System.out.println(a[5].Do());
    }

}
