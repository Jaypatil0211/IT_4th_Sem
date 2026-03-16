import java.util.Stack;

class Shuntingfun {

    String Convert(String str) {

        char[] arr = str.toCharArray();
        Stack<Character> st = new Stack<Character>();
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {

            if (Character.isAlphabetic(arr[i])) {
                result.append(arr[i]);
            }

            else if (Character.isDigit(arr[i])) {
                result.append(arr[i]);
            }

            else if (arr[i] == '(') {
                st.push(arr[i]);
            }

            else if (arr[i] == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop());
                }
                if (!st.isEmpty()) {
                    st.pop();
                }
            }

            else {   // operator case
                while (!st.isEmpty() && checkpre(st.peek()) >= checkpre(arr[i])) {
                    result.append(st.pop());
                }
                st.push(arr[i]);
            }
        }

        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        return result.toString();
    }

    int checkpre(char ch) {

        if (ch == '+' || ch == '-')
            return 1;

        if (ch == '*' || ch == '/')
            return 2;

        return 3;
    }
}

class Shuntingyard {

    public static void main(String[] args) {

        Shuntingfun obj = new Shuntingfun();

        System.out.println(obj.Convert("(A+B*C)"));
    }
}