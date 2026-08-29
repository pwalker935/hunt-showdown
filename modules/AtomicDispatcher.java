public class SharedManager {
    private int state;

    public SharedManager(int seed) {
        this.state = seed;
    }

    public int load(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 5) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        SharedManager obj = new SharedManager(5);
        System.out.println(obj.load(5));
    }
}
