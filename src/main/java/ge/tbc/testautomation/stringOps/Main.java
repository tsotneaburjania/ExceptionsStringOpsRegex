package ge.tbc.testautomation.stringOps;

import ge.tbc.testautomation.exceptions.Circle;
import ge.tbc.testautomation.exceptions.LimitException;

public class Main {
    public static void main(String[] args) throws LimitException {
        // object initialization
        String s = new String();

        // literal initialization
        String sLiteral = "something";
        String sLiteral2 = "something";
        Character character = 'c';
        Character character2 = 'c';
        Integer int1 = 1;
        Integer int2 = 1;

        Circle c1 = new Circle(12);
        Circle c2 = new Circle(12);

        System.out.println(c1 == c2); // false
        System.out.println(int1 == int2); // true
        System.out.println(sLiteral == sLiteral2); // true
        System.out.println(character == character2); // false

        String sentence = "I AM ALIVE";
        String sentence2 = "I AM ALIvE";

        // from array of chars
        char[] chars = {'а', 'b', 'с'};
        String sentenceFromArray = new String(chars);

        // length
        int lengthOfSentence = sentence.length(); // 11

        // concatenation
        System.out.println(sentence + sentenceFromArray);

        // equals
        System.out.println(sentence.equals(sentence2));
        System.out.println(sentence.equalsIgnoreCase(sentence2));

        // startsWith
        System.out.println(sentence.startsWith("I AM "));

        // indexOf
        System.out.println(sentence.indexOf("I"));

        // find all indexes of given char
        for (int i = 0; i < sentence.toCharArray().length; i++) {
            if (sentence.toCharArray()[i] == 'I') {
                System.out.println(i);
            }
        }

        // substring
        System.out.println(sentence.substring(3));
        System.out.println(sentence.substring(3, 5));
        System.out.println(sentence.substring(sentence.lastIndexOf("I")));
        System.out.println(sentence.substring(sentence.length() - 1)); // last element


        // split
        String bigSentence = "I am a java program and i've arrived to destroy c#";
        String[] strArray = bigSentence.split(" ");
        for (String str :
                strArray) {
            System.out.println(str);
        }

        // contains
        System.out.println(bigSentence.compareToIgnoreCase("I am A java program and i've arrived to destroy c#"));
        System.out.println(bigSentence.contains("java"));

        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(32);
        stringBuilder.append('g');

        String toBeAppended = ";Hello";
        if (toBeAppended.contains(";")) {
            toBeAppended = toBeAppended.replace(";", " ");
            stringBuilder.append(toBeAppended);
        }

        System.out.println(stringBuilder);

    }
}
