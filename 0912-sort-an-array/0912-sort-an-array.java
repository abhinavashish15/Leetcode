# code using built-in function:

class Solution {
    public int[] sortArray(int[] nums) {
      Arrays.sort(nums);
        return nums;
    }
}

#code using quickSort:

class Solution {
    public int[] sortArray(int[] nums) {
      // Arrays.sort(nums);
      //   return nums;
      quickSort(nums,0,nums.length-1);
      return nums;
    }
  private static void quickSort(int nums[], int low,int high){
    if(low<high){
      int part=partition(nums,low, high);
      
      quickSort(nums,low,part-1);
      quickSort(nums,part+1,high);
    }
  }
    private static int partition(int nums[],int start,int end){
      int pivot=nums[end];
      int x=start-1;
      for(int i=start;i<=end;i++){
        if(nums[i]<pivot){
          x++;
          swap(nums,x,i);
          // int temp=nums[x];
          // nums[x]=nums[i];
          // nums[i]=temp;
        }
      }
      swap(nums,x+1,end);
      // int t=nums[x+1];
      // nums[x+1]=nums[end];
      // nums[end]=t;
      return x+1;
    }
    public static void swap(int nums[],int a, int b){
      int temp=nums[a];
      nums[a]=nums[b];
      nums[b]=temp;
    }
  }
