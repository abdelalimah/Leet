import java.util.Random;

public class reservoir {
    private int[] tab;
    private int k;

    public reservoir(int[] tab, int k) {
        this.tab = tab;
        this.k = k;
    }

    public void sampling() {

        int[] reservoir = new int[k];
        for (int i = 0; i <reservoir.length ; i++) {
            reservoir[i] = tab[i];
        }

        for (int i =k+1 ; i <tab.length ; i++) {
            int a = new Random().nextInt(i+1);
            if(a<k) reservoir[a] = tab[i];
        }

        for (int i = 0; i < reservoir.length; i++) {
            System.out.print(reservoir[i] + "->");
        }
    }

}
