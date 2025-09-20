// Base Class
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
