package hai;

import java.io.Serializable;


    public class Questions implements Serializable {
        String question;
        String answer;

        public Questions(){
            question = "";
            answer = "";
        }

        public Questions(String userPromt, String answer){

            this.answer = answer;
            this.question = userPromt;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }
    }

