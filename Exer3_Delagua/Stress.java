import java.util.Scanner;
import java.util.Random;

class SupportMessage {
    private String message;

    public SupportMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

public class MentalSupportApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        SupportMessage[] affirmations = {
            new SupportMessage("You are stronger than you think."),
            new SupportMessage("Take a deep breath, you are doing great."),
            new SupportMessage("Remember, it’s okay to rest and take care of yourself."),
            new SupportMessage("You matter, and your feelings are valid."),
            new SupportMessage("Every step you take is progress, no matter how small.")
        };

        SupportMessage[] stressTips = {
            new SupportMessage("Try 5 minutes of deep breathing."),
            new SupportMessage("Take a short walk to refresh your mind."),
            new SupportMessage("Listen to your favorite calming music."),
            new SupportMessage("Write down your thoughts in a journal."),
            new SupportMessage("Stretch your body to release tension.")
        };

        System.out.println("💙 Welcome to the Stress Relief & Mental Support Program 💙");
        System.out.println("Type 'exit' anytime to leave.\n");

        while (true) {
            System.out.print("How are you feeling right now? ");
            String feeling = scanner.nextLine().toLowerCase();

            if (feeling.equals("exit")) {
                System.out.println("Take care of yourself! 💙 Goodbye!");
                break;
            }

            if (feeling.contains("sad") || feeling.contains("down") || feeling.contains("tired")) {
                System.out.println("I hear you. Here’s something for you: " 
                    + affirmations[rand.nextInt(affirmations.length)].getMessage());
            } else if (feeling.contains("stressed") || feeling.contains("anxious") || feeling.contains("angry")) {
                System.out.println("That sounds tough. Here’s a tip to help: " 
                    + stressTips[rand.nextInt(stressTips.length)].getMessage());
            } else {
                System.out.println("Thanks for sharing. Remember: " 
                    + affirmations[rand.nextInt(affirmations.length)].getMessage());
            }

            System.out.println();
        }

        scanner.close();
    }
}
