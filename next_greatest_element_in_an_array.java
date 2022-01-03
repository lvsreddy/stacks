import java.util.*;

class StackExample{
    
    void nextGreatEle(int[] arr, int n){
        Stacxk<Integer> s = new Stack<Integer>();
        int[] res = new int[n];
        res[n-1] = -1;
        s.push(n-1);
        //System.out.println(s);
        for(int i=n-2; i>=0; i--){
            if(arr[i] < arr[s.peek()]){
                res[i] = arr[s.peek()];
                s.push(i);
            }
            else{
                while(!s.isEmpty()){
                    if(arr[s.peek()] <= arr[i]){
                        s.pop();
                    }
                }
                if(s.isEmpty()){
                    res[i] = -1;
                    s.push(i);
                }
                else{
                    res[i] = s.peek();
                    s.push(i);
                }
            }
            //System.out.println(s);
        }
        
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+"->"+res[i]);
        }
    }
    
}

public class A{
    public static void main(String[] args){
        StackExample g = new StackExample();
        int arr[] = { 6,8,0,1,3};
        g.nextGreatEle(arr, arr.length);
    }
}
