package prog;

import java.util.Arrays;

public class MainHashTwo {

    public static void main(String[] args) {
        String[] phone1 = {"119", "97674223", "1195524421"};
        String[] phone2 = {"123","456","789"};
        String[] phone3 = {"12","123","1235","567","88"};

        boolean ans1 = Solution.solution(phone1);
        boolean ans2 = Solution.solution(phone2);
        boolean ans3 = Solution.solution(phone3);

        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }



    public static class Solution {
        public static boolean solution(String[] phone_book) {
            boolean answer = true;
            int cnt=0;
            Arrays.sort(phone_book);
            for( int i = 0; i<phone_book.length-1 ; i++){
                if(phone_book[i+1].startsWith(phone_book[i])){
                    cnt++;
                    break;
                }
            }
            if( cnt !=0) answer=false;

            return answer;
        }
    }


}
