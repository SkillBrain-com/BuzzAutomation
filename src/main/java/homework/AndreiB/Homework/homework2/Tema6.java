package homework.AndreiB.Homework.homework2;

public class Tema6 {

        public static void main(String[] args) {
            int[] list = {1,2,3,4,5,6,7,8,9};

            for (int i = 0; i < list.length; i++) {
                if (i == 2) continue;
                if (i == 7) break;
                System.out.println("Index valid: " + i);
            }
        }

}
