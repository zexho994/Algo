package leetcode.easy;

import java.util.Stack;

public class BackspaceCompare {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '#') {
                stackS.push(S.charAt(i));
            } else {
                if (!stackS.empty()) {
                    stackS.pop();
                }
            }
        }
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) != '#') {
                stackT.push(T.charAt(i));
            } else {
                if (!stackT.empty()) {
                    stackT.pop();
                }
            }
        }
        if (stackS.size() != stackT.size()) {
            return false;
        }
        while (!stackS.empty()) {
            if (stackS.pop() != stackT.pop()) {
                return false;
            }
        }
        return true;
    }

}

