package Programmers.kakao2020blind.Q1;

import java.util.Stack;

class Solution {

    int idx;

    boolean check(String s){

        boolean flag = true;

        int open = 0, closed = 0 ;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){

            if (s.charAt(i) == '('){
                open++;
                stack.add('(');
            }
            else {
                closed++;
                if (!stack.isEmpty()){
                    stack.pop();
                }
                else {
                    flag = false;
                }
            }

            if (open == closed){
                idx = i + 1;
                return flag;
            }
        }
        return true;
    }


    public String solution(String p) {

        if (p.isEmpty()){
            return p;
        }

        boolean check = check(p);

        String u = p.substring(0, idx);
        String v = p.substring(idx, p.length());

        if (check){
           return u + solution(v);
        }

        String answer = "(" + solution(v) + ")";

        for (int i = 1; i < u.length() - 1; i++){

            if (u.charAt(i) == '('){
                answer += ")";
            }
            else {
                answer += "(";
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        System.out.println(sol.solution("()))((()"));

    }
}

