package homework1.bracecheker;

import homework1.stack.Stack;

public class BraceCheker {
    private final String text;

    BraceCheker(String text) {
        this.text = text;
    }

    void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int pop;
            switch (c) {
                case '(':

                case '[':

                case '{':
                    stack.push(c);
                    break;
                case ')':
                    pop = stack.pop();
                    if (pop == 0) {
                        System.out.println("Error. " + c + "closed but not opened " + i);
                    } else if (pop != '(') {
                        System.out.println("Error " + c + "closed but opened" + (char) pop + "at " + i);
                    }
                    break;
                case '}':
                    pop = stack.pop();
                    if (pop == 0) {
                        System.out.println("Error. " + c + "closed but not opened " + i);
                    } else if (pop != '{') {
                        System.out.println("Error " + c + "closed but opened" + (char) pop + "at " + i);
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    if (pop == 0) {
                        System.out.println("Error. " + c + "closed but not opened " + i);
                    } else if (pop != '[') {
                        System.out.println("Error " + c + "closed but opened" + (char) pop + "at " + i);
                    }
                    break;

            }

        }
        while (stack.getTos() != -1) {
            System.out.println("Error. Opened" + (char) stack.pop() + "but not closed");
        }
    }

}
