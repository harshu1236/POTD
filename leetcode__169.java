class Solution {
    public int majorityElement(int[] a) {
        int n=a.length;
        int m=n/2;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(a[i]))
            {
                int c=hm.get(a[i]);
                hm.put(a[i],++c);

            }
            else
            {
                hm.put(a[i],1);
            }
        }
        for(int i:hm.keySet())
        {
            if(hm.get(i)>m)
            return i;
        }
        return 0;
    }
}