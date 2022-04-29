package main;


import java.util.ArrayList;

public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        ArrayList<Integer> binaryBracketValues = new ArrayList<>();

        if (!str.contains("[") || !str.contains("]")) {
            return false;

        }
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                binaryBracketValues.add(0);
            } else if (ch == ']') {
                binaryBracketValues.add(1);
            }
        }

        if (binaryBracketValues.get(0) != 0 || binaryBracketValues.size()%2 != 0){
            return false;
        }

        for (int i = 0; i < binaryBracketValues.size()-1; i++){
            if (binaryBracketValues.get(i)+binaryBracketValues.get(i+1) != 1){
                return false;
        }
    }
        return true;

}}