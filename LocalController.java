public class CoreClient {
    private int state;

    public CoreClient(int seed) {
        this.state = seed;
    }

    public int resolve(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 19) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        CoreClient obj = new CoreClient(19);
        System.out.println(obj.resolve(19));
    }
}
