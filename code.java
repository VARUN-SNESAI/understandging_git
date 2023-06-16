import java.util.Scanner;


public class code  {
    public static void main(String[] args) {
        String[] frames = {
            "        ***      \n" +
            "     *********   \n" +
            "   ************* \n" +
            "  ***************\n" +
            "   ************* \n" +
            "     *********   \n" +
            "        ***      \n",
            
            "       *****     \n" +
            "    *********    \n" +
            "  *************  \n" +
            " ****************\n" +
            "  *************  \n" +
            "    *********    \n" +
            "       *****     \n",
            
            "        ***      \n" +
            "     *********   \n" +
            "   ************* \n" +
            "  ***************\n" +
            "   ************* \n" +
            "     *********   \n" +
            "        ***      \n"
        };

        for (int i = 0; i < frames.length; i++) {
            clearScreen();
            System.out.print(frames[i]);
            delay(500);
        }

        System.out.println("Animation complete!");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
