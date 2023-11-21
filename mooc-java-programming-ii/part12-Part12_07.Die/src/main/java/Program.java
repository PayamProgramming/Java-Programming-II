public class Program {
    public static void main(String[] args) {
        Die die = new Die(4);

        for (int i = 0; i < 10; i++) {
            System.out.println(die.throwDie());
        }
    }
}