package padrao;

public class Ap2 {
    int counter = 0;
    public static void main(String[] args) {
        int count = 0;
        Ap2[] mixes = new Ap2[20];
        int i = 0;
        while (i < 9){
            mixes[i] = new Ap2();
            mixes[i].counter = mixes[i].counter + 1;
            count = count + 1;
            count = count + mixes[i].Mn(i);
            i = i +1;
        }
        System.out.println(count + " "+ mixes[1].counter);
    }
    public int Mn(int index){
        if (index < 5){
            Ap2 mix = new Ap2();
            mix.counter = mix.counter+1;
            return 1;
        }
        return 0;
    }
}
