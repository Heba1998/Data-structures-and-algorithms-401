package stack.and.queue;

public class bracket {
    static boolean bracket(String data)
    {
        Stack<Character> bracket = new Stack<>();

        for (int i = 0; i < data.length(); i++)
        {
            char x = data.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                bracket.push(x);
                continue;
            }

            if (bracket.isEmpty())
                return false;
            char check;

            if (x==')'){
                check = bracket.pop();
                if (check == '{' || check == '[')
                    return false;
            }else if(x=='}'){
                check = bracket.pop();
                if (check == '(' || check == '[')
                    return false;
            }else if(x==']'){
                check = bracket.pop();
                if (check == '(' || check == '{')
                    return false;
            }
        }
        return (bracket.isEmpty());
    }

}

