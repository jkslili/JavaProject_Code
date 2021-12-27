package LeetCode;

class Main {
    public int numFriendRequests(int[] ages) {
        int length = ages.length;
        int res=0;
        for(int i=0;i<length;i++)
        {
            if(ages[i]<=14)
                continue;
            for(int j=0;j<length;j++)
            {
                if(i==j ||(ages[i]>100&&ages[j]<100))
                    continue;
                if(ages[i]>ages[j])
                    continue;
                if((ages[i] <= (ages[j]>>1)+7))
                    continue;

                res++;
            }
        }
        return res;
    }
}