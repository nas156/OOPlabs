public class Punctuation {
    static final String punctuationSymbols = "!.?,;:";
    private String punctuationsString;

    public Punctuation(String punctuationsString) {
        this.punctuationsString = punctuationsString;
    }

    static boolean isPunctuationString(String s) {
        return punctuationSymbols.contains(s);
    }
    @Override
    public String toString() {
        return punctuationsString;
    }
}
