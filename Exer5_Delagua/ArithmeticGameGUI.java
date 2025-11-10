import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class ArithmeticGameGUI {

    private final JFrame frame;
    private final JTextField num1Field;
    private final JTextField num2Field;
    private final JTextField answerField;
    private final JLabel operatorLabel;
    private final JLabel scoreLabel;
    private final JButton submitButton;
    private final JButton nextButton;
    private final Random random;

    private int score;

    public ArithmeticGameGUI() {
        frame = new JFrame("Arithmetic Game");
        num1Field = new JTextField(5);
        num2Field = new JTextField(5);
        answerField = new JTextField(5);
        operatorLabel = new JLabel("+");
        scoreLabel = new JLabel("Score: 0");
        submitButton = new JButton("Submit");
        nextButton = new JButton("Next");
        random = new Random();
        score = 0;

        setupGUI();
        generateProblem();
    }

    private void setupGUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 1));

        JPanel problemPanel = new JPanel();
        problemPanel.add(num1Field);
        problemPanel.add(operatorLabel);
        problemPanel.add(num2Field);
        problemPanel.add(new JLabel("="));
        problemPanel.add(answerField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitButton);
        buttonPanel.add(nextButton);

        JPanel scorePanel = new JPanel();
        scorePanel.add(scoreLabel);

        frame.add(problemPanel);
        frame.add(buttonPanel);
        frame.add(scorePanel);

        submitButton.addActionListener(e -> checkAnswer());
        nextButton.addActionListener(e -> generateProblem());

        frame.setVisible(true);
    }

    private void generateProblem() {
        int num1 = random.nextInt(50) + 1;
        int num2 = random.nextInt(50) + 1;
        String[] operators = {"+", "-", "*", "/"};
        String operator = operators[random.nextInt(operators.length)];

        num1Field.setText(String.valueOf(num1));
        num2Field.setText(String.valueOf(num2));
        operatorLabel.setText(operator);
        answerField.setText("");
    }

    private void checkAnswer() {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int userAnswer = Integer.parseInt(answerField.getText());
            int correctAnswer = switch (operatorLabel.getText()) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> num2 != 0 ? num1 / num2 : 0;
                default -> 0;
            };

            if (userAnswer == correctAnswer) {
                score++;
                JOptionPane.showMessageDialog(frame, "Correct!");
            } else {
                JOptionPane.showMessageDialog(frame, "Incorrect! The answer is " + correctAnswer);
            }
            scoreLabel.setText("Score: " + score);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ArithmeticGameGUI::new);
    }
}