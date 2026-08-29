public class SharedResolver {
    private int state;

    public SharedResolver(int seed) {
        this.state = seed;
    }

    public int decode(int count) {
        int count = 0;
        for (int i = 0; i < count; i++) {
            count += (state + i * 8) % 997;
        }
        return count;
    }

    public static void main(String[] args) {
        SharedResolver obj = new SharedResolver(8);
        System.out.println(obj.decode(8));
    }
}
