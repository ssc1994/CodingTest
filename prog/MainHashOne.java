package prog;

import java.util.HashMap;
/*
완주하지 못한 선수
문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
입출력 예
participant	completion	return
["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"
입출력 예 설명
예제 #1
"leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #2
"vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #3
"mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
 */
public class MainHashOne {

    public static void main(String[] args) {
        String[] parti1 = {"leo", "kiki", "eden"};
      String[] parti2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
      String[] parti3 = {"mislav", "stanko", "mislav", "ana"};
//
        String[] comple1 = {"eden", "kiki"};
      String[] comple2 = {"josipa", "filipa", "marina", "nikola"};
      String[] comple3 = {"stanko", "ana", "mislav"};

        String ans1 = Solution.solution(parti1,comple1);
        String ans2 = Solution.solution(parti2,comple2);
        String ans3 = Solution.solution(parti3,comple3);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    public static class Solution {
        public static String solution(String[] participant, String[] completion) {
            String answer = "";
            //맵생성
            HashMap<String,Integer> map = new HashMap();

            //map에 parti넣기
            for(String part : participant){
                map.put(part,map.getOrDefault(part,0)+1);
            }

            //map에서 completion빼기
            for(String comp : completion){
                map.put(comp,map.get(comp)-1);
            }

            //map에서 0이 아닌값 꺼내기
            for(String key : map.keySet()){
                if(map.get(key)!=0){
                    return key;
                }
            }
            System.out.println(map.toString());


            return answer;
        }
    }


}
