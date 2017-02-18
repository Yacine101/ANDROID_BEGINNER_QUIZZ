package gdg.algiers.applicationpourdebutant;

/**
 * Created by thewinny on 18/02/17.
 */

public class QuestionEntity {

    String question;
    String choice1;
    String choice2;
    String choice3;
    String rightChoice;

    public QuestionEntity(String question, String choice1, String choice2, String choice3, String rightChoice) {
        this.question = question;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.rightChoice = rightChoice;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }

    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    public void setChoice3(String choice3) {
        this.choice3 = choice3;
    }

    public void setRightChoiceId(String rightChoiceId) {
        this.rightChoice = rightChoiceId;
    }

    public String getQuestion() {
        return question;
    }

    public String getChoice1() {
        return choice1;
    }

    public String getChoice2() {
        return choice2;
    }

    public String getChoice3() {
        return choice3;
    }

    public String getRightChoice() {
        return rightChoice;
    }
}

