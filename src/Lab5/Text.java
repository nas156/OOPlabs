package Lab5;

import Lab5.Sentence;

public class Text {
    private Sentence[] sentences;

    public Text(String textString) {
        String[] split = textString.split("(?<=[?!.]) ");
        sentences = new Sentence[split.length];
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = new Sentence(split[i]);

        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Sentence sentence : sentences) {
            result += sentence.toString() + " ";
        }
        return result;
    }


}

