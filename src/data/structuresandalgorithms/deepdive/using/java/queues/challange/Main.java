package data.structuresandalgorithms.deepdive.using.java.queues.challange;

import java.util.LinkedList;

public class Main {

    public static boolean checkFoPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();
        String loweCase = string.toLowerCase();

        for (int i = 0; i < loweCase.length(); i++) {
            char c = loweCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                queue.addLast(c);
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // true
        System.out.println(checkFoPalindrome("abccba"));
        System.out.println(checkFoPalindrome("Was it a car or a cat I saw"));
        System.out.println(checkFoPalindrome("I did, did I"));
        // false
        System.out.println(checkFoPalindrome("hello"));
        // true
        System.out.println(checkFoPalindrome("Don't nod"));
    }
}
