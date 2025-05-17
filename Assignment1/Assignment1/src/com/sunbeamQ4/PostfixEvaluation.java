package com.sunbeamQ4;
import java.util.Stack;

public class PostfixEvaluation {

	public static int calculate(int o1,int o2,char opr) {
		switch(opr) {
		case '+': return o1+o2;
		case '-':return o1-o2;
		case '*':return o1*o2;
		case '/':return o1/o2;
		case '%':return o1%o2;
		case '$':return (int)Math.pow(o1,o2);
		}
		return 0;
	}
	
	public static boolean isNotNumber(String s1) {
		
		for(int i=0;i<s1.length();i++) {
			if(!Character.isDigit(s1.charAt(i))){
				return false;
			}
		}
		return true;
	}
	public static int evaluatePostfixexpr(String expr) {
	Stack<Integer> stack=new Stack<Integer>();
	String[] arr=expr.split(" ");
	for(int i=0;i<arr.length;i++) {
		String s1=arr[i];
           if(isNotNumber(s1)) {
        	  int res=Integer.parseInt(s1); 
        	  stack.push(res);
           }else {
			  //means ele is operator
        	   char[] c1=s1.toCharArray();
        	   char opr=c1[0];
			  int op2=stack.pop();
			  int op1=stack.pop();
			  int res=calculate(op1,op2,opr);
			  stack.push(res);
		  }
		}
			return stack.pop();
	}

public static void main(String[] args) {
	String postfixexpr="100 20 5 / + 30 10 - *";
	System.out.println("Postfix Expression:"+postfixexpr);
    int res=evaluatePostfixexpr(postfixexpr);
    System.out.println("Evaluated Value:"+res);
}
}
