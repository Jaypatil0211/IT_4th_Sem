import java.util.Stack;

class Parenthesis{
    public static void main(String [] args){
        String str = "[{}]";
        
        Stack<Character> st = new Stack<Character>();
        char[] arr = str.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '{' || arr[i] == '(' || arr[i] == '['){
                st.push(arr[i]);
            }
            if(arr[i] == '}' && st.peek() == '{' || arr[i] == ')' && st.peek() == '(' || arr[i] == ']' && st.peek() == '['){
                st.pop();
            }
        }
        if(st.isEmpty()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }

    }
}