class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        List<int[]> result=new ArrayList<>();
        int st=intervals[0][0];
        int end=intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            int nextSt=intervals[i][0];
            int nextEnd=intervals[i][1];

            if(nextSt<=end){
                end=Math.max(end, nextEnd);
            }else{
                result.add(new int[]{st,end});
                st=nextSt;
                end=nextEnd;
            }
        }
        result.add(new int[]{st,end});

        return result.toArray(new int[result.size()][]);
    }
}