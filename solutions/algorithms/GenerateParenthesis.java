package practise.com;

import java.util.*;

public class GenerateParenthesis{
    public static void main(String args[]){
    
    int n = 3;
    List<String> res = new ArrayList<String>();
    int left = n, right = n;
    StringBuilder sb = new StringBuilder();
    
    generateValidParenthesis(res, left, right, sb);
    System.out.println(res);
    
    }
    public static void generateValidParenthesis(List<String> res, int left, int right, StringBuilder sb){
    
    if(left > right )
        return;
       
       
    if(left == 0 && right ==0 ){
        res.add(sb.toString());
        return;
    }
    
    
    if(left > 0){
        generateValidParenthesis(res, left -1,right, sb.append("(") );
        sb.deleteCharAt(sb.length() - 1);
    
    }
    
     if(right > 0){
        generateValidParenthesis(res, left ,right - 1, sb.append(")") );
        sb.deleteCharAt(sb.length() - 1);
    
    }
    
    }

}
