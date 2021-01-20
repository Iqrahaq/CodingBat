import java.util.Scanner;

public class BasicSong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while(isOnRepeat){
            System.out.println("Playing Current Song...");
            System.out.println("Would you like to take this song off repeat? If so, answer yes");
            String userInput = input.next();

            if(userInput.equals("yes")){
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song...");
    }
}
