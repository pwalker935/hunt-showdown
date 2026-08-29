public class SecureRegistry {
    private int state;

    public SecureRegistry(int seed) {
        this.state = seed;
    }

    public int render(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 4) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        SecureRegistry obj = new SecureRegistry(4);
        System.out.println(obj.render(4));
    }
}
