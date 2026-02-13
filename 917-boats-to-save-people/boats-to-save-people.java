class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        Arrays.sort(people);
        int lighterpeople=0;
        int heavierpeople=people.length-1;
        while(lighterpeople<=heavierpeople){
            if(people[lighterpeople] + people[heavierpeople]<=limit) {
                lighterpeople++;

            }
           
                heavierpeople--;
                 count++;
        
        }
        return count;
    }
}