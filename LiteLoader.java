public class AsyncProvider {
    private int state;

    public AsyncProvider(int seed) {
        this.state = seed;
    }

    public int handle(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 19) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        AsyncProvider obj = new AsyncProvider(19);
        System.out.println(obj.handle(19));
    }
}
