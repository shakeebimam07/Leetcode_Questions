import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0 ; i<nums.length; i++){
            for(int j=i+1 ; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};

                }
            }
        }
        return new int[]{};
    }
                public static void main(String args[])
                {
                    Scanner in=new Scanner(System.in);
                    System.out.println("Enter size of the array");
                    int size=in.nextInt();
                    int arr[]=new int[size];
                    System.out.println("Enter array elements");
                    for(int i=0; i<size; i++){
                        arr[i]=in.nextInt();
                    }
                    System.out.println("Enter target");
                    int tar=in.nextInt();
                    int [] result = twoSum(arr, tar);
                    if(result.length > 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found");
                }
            }
        }