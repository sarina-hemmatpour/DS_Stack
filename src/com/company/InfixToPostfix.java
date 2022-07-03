package com.company;

import java.lang.ref.SoftReference;

public class InfixToPostfix {

    private static int priority(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;

        }

        return -1;
    }


    public static String infixToPrefix(String text)
    {
        String result="";


        LinkedStack<Character> stack=new LinkedStack<>();

        for (int i=0 ; i<text.length() ; i++)
        {
            char thisChar=text.charAt(i);

            if (Character.isLetter(thisChar))
            {
                result+=thisChar;
            }
            else if (thisChar=='(')
            {
                stack.push(thisChar);
            }
            else if (thisChar==')')
            {
                while (!stack.isEmpty() && stack.top()!='(')
                {
                    result+=stack.pop();
                }

                stack.pop();
            }
            else
            {
                while (!stack.isEmpty() && priority(thisChar)<=priority(stack.top()))
                {
                    result+=stack.pop();
                }

                stack.push(thisChar);
            }
        }


        while (!stack.isEmpty())
        {
            result+=stack.pop();
        }

        return result;
    }


    public static int answerOfPostfix(String postfix)
    {
        int result=0;

        LinkedStack<Integer> stack=new LinkedStack<>();

        for (int i=0 ; i<postfix.length() ; i++)
        {
            char thisChar=postfix.charAt(i);

            if (Character.isDigit(thisChar))
            {
                stack.push(thisChar-'0');
            }
            else
            {
                int number2=stack.pop();
                int number1=stack.pop();

                switch (thisChar)
                {
                    case '+':
                        stack.push(number1+number2);
                        break;
                    case '-':
                        stack.push(number1-number2);
                        break;
                    case '*' :
                        stack.push(number1*number2);
                        break;
                    case '/' :
                        stack.push(number1/number2);
                        break;
                    case '^':
                        stack.push((int)(Math.pow((double)number1,(double)number2)));
                        break;
                }

            }


        }

        result=stack.pop();
        return result;
    }

}
