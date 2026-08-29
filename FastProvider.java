public class SimpleParser {
    private int state;

    public SimpleParser(int seed) {
        this.state = seed;
    }

    public int load(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 18) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        SimpleParser obj = new SimpleParser(18);
        System.out.println(obj.load(18));
    }
}
