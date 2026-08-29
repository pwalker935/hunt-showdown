public class CoreEngine {
    private int state;

    public CoreEngine(int seed) {
        this.state = seed;
    }

    public int run(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 88) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        CoreEngine obj = new CoreEngine(88);
        System.out.println(obj.run(88));
    }
}
