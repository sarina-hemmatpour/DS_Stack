package com.company;

public class Main {

    public static void main(String[] args) {

//        System.out.println(BracketsBallance("(hello))false"));
//
//        System.out.println(BracketsBallance("{(5*2)==10}true"));
//        System.out.println(BracketsBallance("[true type]"));
//        System.out.println(BracketsBallance("aliuef true"));
//
//        System.out.println(BracketsBallance("[(]false)type"));

//        System.out.println(InfixToPostfix.infixToPrefix("a+b*(c-d)"));
//        System.out.println(InfixToPostfix.answerOfPostfix("35*168-*+"));





    }

    public static boolean BracketsBallance(String text)
    {
        LinkedStack<Character> stack=new LinkedStack<>();

        for (int i=0 ; i<text.length() ; i++)
        {
            char testChar=text.charAt(i);

            if (testChar=='(' || testChar=='[' || testChar=='{')
            {
//                stack.push(new Character(testChar));
                stack.push(testChar);
            }

            else if (testChar==')' || testChar==']' || testChar=='}')
            {
                if (stack.isEmpty())
                {
                    return false;
                }

//                char topOfStack=((Character)stack.pop()).charValue();
                char topOfStack=stack.pop();

                if ((testChar==')' && topOfStack!='(') || (testChar==']' && topOfStack!='[') || (testChar=='}' && topOfStack!='{'))
                {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }


}
