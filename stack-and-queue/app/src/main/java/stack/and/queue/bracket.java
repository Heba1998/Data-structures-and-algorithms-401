package stack.and.queue;

public class bracket {
    static boolean bracket(String expr)
    {

        Stack<Character> stack
                = new Stack<>();

        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char check;

            if (x==')'){
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
            }else if(x=='}'){
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
            }else if(x==']'){
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
            }
        }
        return (stack.isEmpty());
    }

}

