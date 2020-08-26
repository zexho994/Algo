package leetcode.medium;

import java.util.*;

/**
 * 17. 电话号码的字母组合
 * @author Zexho
 * @created 2020/8/26 6:56 下午
 */
public class LetterCombinations {


    public List<String> letterCombinations(String digits) {
        return getSubCombinations(digits,0);
    }

    public List<String> getSubCombinations(String digits,int index){
        if(index >= digits.length()){
            return new ArrayList<>();
        }

        char[] symbols = getSymbol(digits.charAt(index));
        List<String> reslist = getSubCombinations(digits,++index);

        if(reslist.size() == 0){
            for(char c : symbols){
                reslist.add(c+"");
            }
            return reslist;
        }

        List<String> list = new LinkedList<>();
        for(int i = 0 ; i < symbols.length ; i++){
            for(String s : reslist){
                String ns = symbols[i] + s;
                list.add(ns);
            }
        }

        return list;
    }

    private char[] getSymbol(char num){
        if(num == '2'){
            return new char[]{'a','b','c'};
        }
        if(num == '3'){
            return new char[]{'d','e','f'};
        }
        if(num == '4'){
            return new char[]{'g','h','i'};
        }
        if(num == '5'){
            return new char[]{'j','k','l'};
        }
        if(num == '6'){
            return new char[]{'m','n','o'};
        }if(num == '7'){
            return new char[]{'p','q','r','s'};
        }if(num == '8'){
            return new char[]{'t','u','v'};
        }
        if(num == '9'){
            return new char[]{'w','x','y','z'};
        }
        return new char[]{};
    }
}
