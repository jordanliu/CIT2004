package hai;

import java.io.Serializable;


    public class Questions implements Serializable {
        String userPromt;
        String answer;

        public Questions(String userPromt, String answer){

            this.answer = answer;
            this.userPromt = userPromt;
        }

        public String getUserPromt() {
            return userPromt;
        }

        public void setUserPromt(String userPromt) {
            this.userPromt = userPromt;
        }

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }
    }

