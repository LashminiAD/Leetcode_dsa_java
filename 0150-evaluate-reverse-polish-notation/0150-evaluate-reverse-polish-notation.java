class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> stack = new Stack<>();
        for(String s : tokens){
            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) stack.push(Integer.parseInt(s));

            else{
                int a  = stack.pop();
                int b = stack.pop();

                switch(s) {
                    case "+": 
                        stack.push(b+a);
                        break;
                    case "-": 
                        stack.push(b-a);
                        break;
                    case "*": 
                        stack.push(b*a);
                        break;
                    case "/": 
                        stack.push(b/a);
                        break;
                }
            }
        }
        return stack.pop();
    }
}