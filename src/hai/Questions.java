package hai;

import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Questions implements Serializable {
    @SerializedName("question")
    @Expose
    String question;
    @SerializedName("answer")
    @Expose
    String answer;
    ArrayList<QuestionDatabank> items;

    public Questions(){
            question = "";
            answer = "";

        }

        public Questions(String question, String answer){

            this.answer = answer;
            this.question = question;
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

