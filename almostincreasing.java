/*
 * Author: Ogbonna Chibuoyim
 * Date Modified: 23-09-2019-15:10
 */
Boolean skip(int pos, int[] arr)
{
    for(int i=0;i<arr.length;i++)
    {
        if(i==pos)continue;
        if(i==pos-1)
        {
            if((i+2)<arr.length&&arr[i]>=arr[i+2])
                return false;
        }
        else
        {
            if((i+1)<arr.length&&arr[i]>=arr[i+1])
                return false;
        }
    }
    return true;
}
boolean almostIncreasingSequence(int[] sequence) {
    for(int i=1;i<sequence.length;i++)
        if(sequence[i]<=sequence[i-1]) // skip imbalance
            return skip(i,sequence)||skip(i-1,sequence);
    return true;
}
