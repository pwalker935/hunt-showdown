public class SimpleScheduler {
    private int state;

    public SimpleScheduler(int seed) {
        this.state = seed;
    }

    public int sync(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 82) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        SimpleScheduler obj = new SimpleScheduler(82);
        System.out.println(obj.sync(82));
    }
}
