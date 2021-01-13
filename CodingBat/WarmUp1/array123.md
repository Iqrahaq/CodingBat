```java
package com.haq;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1 , 1 , 2, 4, 1};
        System.out.println(array123(nums));
    }

    public static boolean array123(int[] nums){
        //iterate through array
        for(int i=0; i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                for(int k=2; k<nums.length;k++){
                    if(nums[i] == 1 && nums[j] == 2 && nums[k] == 3){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
```
