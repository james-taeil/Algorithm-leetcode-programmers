import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        int left = 0;
        int right = people.length - 1;
        
        while (left <= right) {
            int minPerson = people[left];
            int hevPerson = people[right];
            
            if (minPerson + hevPerson <= limit) {
                left++;
                right--;
            } else {
                right--;
            }
            answer++;
        }
        
        
        return answer;
    }
}