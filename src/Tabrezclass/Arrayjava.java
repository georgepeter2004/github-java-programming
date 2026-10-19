package Tabrezclass;

import java.util.*;

public class Arrayjava {
    public static void main(String[] args) {
      int a[] = {1,1,1,2,2,3,4,5,6,6};
      int b[] = {1,1,3,3,2,2,7,8,8};

    }

    static void arraydemo() {
        int a[] = new int[5];
        boolean b[] = new boolean[5];
        double c[] = new double[5];

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }


    public static void userinput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        for (int i = 0; i < a.length; i++) {
            System.out.print("\nEnter Element a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(a));

    }


    public static int sumofArray(int a[]) {
        int sum = 0;
        for (int e : a) {//foreach loop
            sum += e;
        }
        return sum;
    }


    public static int[] reverseArray(int a[]) {
        int left = 0, right = a.length - 1;
        while (left < right) {
            int temp = a[left];
            a[left++] = a[right];
            a[right--] = temp;
        }
        return a;
    }


    public static int largestElement(int a[]) {

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) largest = a[i];
        }
        return largest;
    }


    public static int secondlargestElement(int a[]) {

        int largest = Integer.MIN_VALUE, secondlargest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                secondlargest = largest;
                largest = a[i];
            } else if (a[i] > secondlargest && a[i] != largest) secondlargest = a[i];
        }
        return secondlargest;
    }




    public static int visibleSunrise(int[] a) {
        int cur_max = a[0], count = 1, n = a.length;
        for (int i = 1; i < n; i++) {
            if (a[i] > cur_max) {
                cur_max = a[i];
                count++;
            }
        }
        return count;
    }



    static int[] zigZag(int a[], int b[]) {
        int x = 0;
        int res[] = new int[a.length + b.length];

        for (int i = 0; i < res.length; i++) {
            if (i % 2 == 0) res[i] = a[x++];
            else res[i] = b[x++];
        }

        return res;
    }



    static void findPrimenoinArray() {
        int count = 0;
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 15};
        for (int i = 0; i < a.length; i++) {
            boolean flag = true;
            for (int j = 2; j < (int) Math.sqrt(a[i]); j++) {
                if (a[i] == 0 || a[i] == 1) {
                    flag = false;
                    break;
                }
                if (a[i] % j == 0) {
                    flag = false;
                    break;
                }
                if (a[i] % j != 0) count++;
            }
            if (flag) System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println(count);

    }


    public static void sort(int a[]){
        Arrays.sort(a);//sorting ascending order
        Arrays.sort(a,0,a.length); // sort(array,start,end); //end is excluded
    }

    public boolean containsDuplicate(int[] nums) {//L-217
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]) return true;
        }
        return false;
    }

    public int lastStoneWeight(int[] stones) {//L-1046
        int n = stones.length;
        while(n>1){
            Arrays.sort(stones,0,n);
            int x = stones[n-1],y = stones[n-2];
            if(x==y) {
                stones[n-2] = x-y;
                n=-2;}
            else {
                stones[n-2] = x-y;
                n--;
            }
        }
        return stones[0];
    }

    public static int singlenumberInArray(int[] a){//L-136
        //{1,2,1,2,5} --> o/p = 5
        int ans = 0;

        for(int i = 0;i<a.length;i++){
            ans = ans^a[i];
        }
        return ans;
    }

    public int trappingRainWaterLogic1(int[] height) {//L-42
        int n = height.length,trapped=0;
        int[] left = new int[n];

        left[0] = height[0];
        for(int i=1;i<left.length;i++){
            left[i] = Math.max(left[i-1],height[i]);
        }

        int right[] = new int[n];
        right[n-1] = height[n-1];

        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],height[i]);
        }

        for(int i=0;i<n;i++){
            trapped+=Math.min(left[i],right[i]) - height[i];
        }

    return trapped;
    }


    public int trappingRainWaterLogic2(int[] height) {//L-42
        int n = height.length,
                rightmax = height[n-1],
                leftmax = height[0],
                left = 0,
                right = n-1,
                trapped = 0;

        while(left<right){
            if(leftmax<rightmax){
                left++;
                leftmax = Math.max(leftmax,height[left]);
                trapped+= leftmax - height[left];
            }
            else {
                right--;
                rightmax = Math.max(rightmax,height[right]);
                trapped+= rightmax - height[right];
            }
        }

        return trapped;
    }


    public static int maxArea() {//L-11 container with most water
        int[] height = {1,8,6,2,5,4,8,3,7};
        int n = height.length, left = 0 , right = n-1 , maxarea = 0;
        while(left<right){
            int area = Math.min(height[left],height[right])*(right-left);
            maxarea = Math.max(area,maxarea);

            if(height[left]<height[right]) left++;
            else right--;
        }
     return maxarea;
    }

    public static int[] productExceptSelf(int[] a) {//L-238
        int n = a.length ;
        int left[] = new int[n],
                right[] = new int[n];
        left[0] = 1;
        right[n-1] = 1;
        for(int i=1;i<n;i++){
            left[i] = left[i-1]*a[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i] = right[i+1]*a[i+1];
        }

        for(int i = 0;i<n;i++){
            a[i] = right[i]*left[i];
        }

        return a;
    }

public static int[] moveZero(int a[]){ //L-283
        for(int j=0,i=0;i<a.length;i++){
            if(a[i]!=0){
                int temp = a[i];
                a[i] = a[j];
                a[j++] = temp;
            }
        }
        return a;
}

public static int removeDuplicates(int[] a){//L-26
        int n = a.length,i,j;
        for(i=0,j=0;j<n;j++){
            if(a[i]!=a[j]){
                i++;
                a[i] = a[j];
            }
        }
        return i+1;

}




    public static int missingnum(int[] a) {
        int n = a.length;
        int sum = (n * (n + 1)) / 2;

        for (int i = 0; i < n; i++) {
            sum -= a[i];
        }

        return sum;
    }

    public static void missingnum1(int[] a) {
        Arrays.sort(a);
        int n = a.length;
        int j = 1;
        for (int i = 0; i < n; i++, j++) {
            if (a[i] != j) {
                System.out.print(j + " ");
                i--;
            }
        }
    }

    public static int[] removedup(int a[]) {
        int n = a.length, i;
        for (i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    for (int k = j; k < n - 1; k++) {
                        a[k] = a[k + 1];
                    }
                    n--;
                }

            }
        }

        int res[] = new int[i];

        for (int k = 0; k < res.length; k++) {
            res[k] = a[k];
        }
        return res;
    }


    public static int[] removedup2(int a[]) {
        int n = a.length, count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == Integer.MIN_VALUE) continue;

            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                    a[j] = Integer.MIN_VALUE;
                }
            }

        }

        int res[] = new int[n - count];

        for (int i = 0, x = 0; i < res.length; i++) {
            if (a[i] != Integer.MIN_VALUE) {
                res[x++] = a[i];
            }
        }

        return res;
    }


    static void printinpairs(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("[" + a[i] + "," + a[j] + "]");
            }
            System.out.println();
        }
    }

    static void printSubarray() {
        int a[] = {2, 3, 4, 6};
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.print("    ");
            }
            System.out.println();
        }
    }

    static int[] rotaten(int a[], int t) {
        int n = a.length;
        int temp = a[0];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n - 1; j++) {
                a[j] = a[j + 1];
            }
            a[n - 1] = temp;
            temp = a[0];

        }
        return a;

    }

    static boolean isSorted(int a[]) {
        int n = a.length;
        boolean flag = false;
        for (int i = 0; i < n - 1; i++) {
            if (!(a[i] <= a[i + 1])) {
                return false;
            }

        }
        return true;
    }

    static void printSubarrayMax() {
        int a[] = {2, -3, -1, 4, 3, 1, -6, 2};
        int n = a.length, max_sub = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int current_sub = 0;
                for (int k = i; k <= j; k++) {
                    current_sub += a[k];
                }
                max_sub = Math.max(current_sub, max_sub);
            }

        }

        System.out.println(max_sub);
    }

    static int oddnodigit(int a[]) {
        int n = a.length, countodd = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            while (a[i] > 0) {
                count++;
                a[i] /= 10;
            }
            if (count % 2 == 1) countodd++;
        }
        return countodd;
    }

    static void subarr(int a[]) {
        int n = a.length, currentsum = a[0], max_sum = a[0];
        for (int i = 0; i < n; i++) {
            currentsum += a[i];
            max_sum = Math.max(currentsum, max_sum);
            if (currentsum < 0) currentsum = 0;
        }

        System.out.println(max_sum);
    }

    public static int[] leftShiftRotate(int a[],int r){
        int n = a.length;
        r = r%n;

        for(int i=1;i<=r;i++){
            int first = a[0];
            for(int j=1;j<n;j++){
                a[j-1] = a[j];
            }

            a[n-1] = first;
        }
        return a;
    }





    static int[] firstLastaddNmulti(int []a){
        int n = a.length;
        for(int i=0;i<n;i++){
            int temp = a[i];
            while(temp>10){
                temp/=10;
            }
            int first = temp;
            int last = a[i]%10;


            if((first+last)%2==0) a[i] = first+last;
            else a[i] = first*last;
        }
        return a;
    }

    static int[] printnotoArray(int n){
        int a = 8394,
                temp = a,
                max = Integer.MIN_VALUE,div = 1;

        while (temp > 0) {
            div *=10;
            max = Math.max(max, temp % 10);
            temp /= 10;
        }
        int res[] = new int[max];
        div/=10;
        int l = div;
        temp = a;

        for (int i=0;i< res.length;i++){
            if(div==0) {
                div = l;
                temp = a;
            }
            res[i] = (temp/div)%10;
            div/=10;
        }

        return res;
    }

    static int findnoincharArray(char a[]){
        int sum = 0;

        for(int i=0; i < a.length;i++){
            if(a[i]>='0' && a[i]<='9'){
                sum+=(int)(a[i]-'0');
            }
        }

        return sum;
    }



}
