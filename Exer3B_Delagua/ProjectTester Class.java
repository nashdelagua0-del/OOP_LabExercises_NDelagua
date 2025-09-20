public class ProjectTester {
    public static void main(String[] args) {

        SupportMessage generalMsg = new SupportMessage("This is a general support message.");
        System.out.println("SupportMessage: " + generalMsg.getMessage());

        AffirmationMessage affirmation = new AffirmationMessage("You are capable of amazing things!");
        System.out.println("AffirmationMessage: " + affirmation.getMessage());

        StressReliefTip tip = new StressReliefTip("Take a short walk to clear your mind.");
        System.out.println("StressReliefTip: " + tip.getMessage());

        User user = new User("Alex");
        user.setFeeling("stressed");
        System.out.println("User: " + user.getName() + " is feeling " + user.getFeeling());
    }
}
