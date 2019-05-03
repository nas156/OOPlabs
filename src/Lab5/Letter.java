package Lab5;

import java.util.Arrays;

public class Letter {
        private char letterSymbol;
        public static  final char[] neededLetters={'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','z'};

        public Letter(char letterSymbol) {
            this.letterSymbol = letterSymbol;
        }

        @Override
        public String toString() {
            return letterSymbol + "";
        }
    }


