import java.io.IOException;

public class Test2 {

    // no-arg constructor (no argument constructor)

    public static void main(String[] args) {

        try {
            throwsException(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static boolean throwsException(boolean isTrue) throws IOException {
        if (isTrue) {
            throw new IllegalArgumentException("Wrong boolean chosen!");
        }
        return false;
    }
}
