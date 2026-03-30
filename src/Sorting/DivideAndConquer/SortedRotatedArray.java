package pattern.Sorting.DivideAndConquer;
public class SortedRotatedArray {
    public static int sort(int arr[],int tar,int si,int ei){
        //Base Case
        if(si>ei){
            return -1;
        }
        //kaam
        int mid = si+(ei-si)/2; //(si+ei)/2
        //Case Found
        if(arr[mid]==tar){
            return mid;
        }
        //mid on Line1
        if(arr[si]<=arr[mid]){
            //Case a: left
            if(arr[si]<=tar&&tar<=mid){
               return sort(arr,tar,si,mid-1);
            }
            //Case a left
            else{
               return sort(arr,tar,mid+1,ei);
            }
        }
        //mid-on Line2
        else{
            //case c:right
            if(mid<=tar && tar<=ei){
                return sort(arr,tar,mid+1,ei);
            }else{
                return sort(arr,tar,si,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,};
        int tar=1;
        int index =sort(arr,tar,0, arr.length-1);
        System.out.println(index);
    }

}
