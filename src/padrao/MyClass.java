package padrao;

public class MyClass {
    public static void main(String[] args) {
        MyClass output = new MyClass();
        output.go();

    }
    void go(){
        int value = 7;
        for (int i = 1; i < 8; i++) {
            value++;
            if (i > 4){
                System.out.println(++value + " ");

            }
            if (value > 14){
                System.out.println(" i = "+ i);
                break;
            }
        }

    }
}
