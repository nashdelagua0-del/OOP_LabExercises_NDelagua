import java.util.*;

class User {
    private String name;
    private String currentFeeling;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFeeling() {
        return currentFeeling;
    }

    public void setFeeling(String feeling) {
        this.currentFeeling = feeling;
    }
}

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

class AffirmationMessage extends SupportMessage {
    public AffirmationMessage(String message) {
        super(message);
    }
}

class StressReliefTip extends SupportMessage {
    public StressReliefTip(String message) {
        super(message);
    }
}

class SupportSystem {
    private List<AffirmationMessage> affirmations;
    private List<StressReliefTip> stressTips;
    private Random rand;

    public SupportSystem() {
        affirmations = new ArrayList<>();
        stressTips = new ArrayList<>();
        rand = new Random();

        affirmations.add(new AffirmationMessage("You are stronger than you think."));
        affirmations.add(new AffirmationMessage("Take a deep breath, you are doing great."));
        affirmations.add(new AffirmationMessage("Remember, it’s okay to rest and take care of yourself."));
        affirmations.add(new AffirmationMessage("You matter, and your feelings are valid."));
        affirmations.add(new AffirmationMessage("Every step you take is progress, no matter how small."));

        stressTips.add(new StressReliefTip("Try 5 minutes of deep breathing."));
        stressTips.add(new StressReliefTip("Take a short walk to refresh your mind."));
        stressTips.add(new StressReliefTip("Listen to your favorite calming music."));
        stressTips.add(new StressReliefTip("Write down your thoughts in a journal."));
        stressTips.add(new StressReliefTip("Stretch your body to release tension."));
    }

    public String provideMessage(User user) {
        String feeling = user.getFeeling().toLowerCase();

        if (feeling.contains("sad") || feeling.contains("down") || feeling.contains("tired")) {
            return affirmations.get(rand.nextInt(affirmations.size())).getMessage();
        } else if (feeling.contains("stressed") || feeling.contains("anxious") || feeling.contains("angry")) {
            return stressTips.get(rand.nextInt(stressTips.size())).getMessage();
        } else {
            return affirmations.get(rand.nextInt(affirmations.size())).getMessage();
        }
    }
}

public class MentalSupportApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SupportSystem system = new SupportSystem();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        User user = new User(name);

        System.out.println("💙 Welcome to the Stress Relief & Mental Support Program, " + user.getName() + "! 💙");
        System.out.println("Type 'exit' anytime to leave.\n");

        while (true) {
            System.out.print("How are you feeling right now? ");
            String feeling = scanner.nextLine();

            if (feeling.equalsIgnoreCase("exit")) {
                System.out.println("Take care of yourself, " + user.getName() + "! 💙 Goodbye!");
                break;
            }

            user.setFeeling(feeling); 
            String response = system.provideMessage(user);
            System.out.println("Here’s something for you: " + response);
            System.out.println();
        }

        scanner.close();
    }
}
