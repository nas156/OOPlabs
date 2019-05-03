public class Sentence {
        private Object[] sentenceElements;
        public Sentence(String sentenceString) {
            String[] sentenceElementsStrings =
                    sentenceString.split("(?=[" +
                            Punctuation.punctuationSymbols +
                            "])| ");
            sentenceElements =
                    new Object[sentenceElementsStrings.length];
            for (int i = 0; i < sentenceElementsStrings.length; i++) {
                if (Punctuation.isPunctuationString(sentenceElementsStrings[i])) {
                    sentenceElements[i] = new Punctuation(sentenceElementsStrings[i]);
                } else {
                    if(sentenceElementsStrings[i].length() !=5 || Word.isNotNeededLetter(sentenceElementsStrings[i]) ){
                        sentenceElements[i] = new Word(sentenceElementsStrings[i]);
                    }
                }
            }
        }
        private Object[] sentensceElements;

        @Override
        public String toString() {
            String result = "";
            Object currentSentenceMember;
            for (int i = 0; i < sentenceElements.length; i++) {
                currentSentenceMember = sentenceElements[i];
                result +=
                        (currentSentenceMember instanceof Word && i != 0 ?
                                " " : "") +
                                (sentenceElements[i] != null ? sentenceElements[i].toString() : "");
            }
            return result;


    }
}

