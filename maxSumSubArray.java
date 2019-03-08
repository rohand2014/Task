import java.util.Scanner;

class maxSumSubArray { 
  
    static void maxSubArraySum(int a[], int size) 
    { 
        int max = Integer.MIN_VALUE, 
        cur_max = 0,start = 0, 
        end = 0, s = 0; 
  
        for (int i = 0; i < size; i++)  
        { 
            cur_max += a[i]; 
  
            if (max <= cur_max)  
            { 
                max = cur_max; 
                start = s; 
                end = i; 
            } 
  
            if (cur_max < 0)  
            { 
                cur_max = 0; 
                s = i + 1; 
            } 
        }

        if(max>=0){
        System.out.println("Largest SubArray"); 
        System.out.println("Start index:" + start); 
        System.out.println("Length:" + ((end-start)+1));
        System.out.println("Sum:" + max);
        System.out.println("Elements: ");

        for(int i=start;i<=end;i++){
        System.out.print(a[i]+" ");
    } 
  }

    else
        System.out.println("Sum not possible");
}
    
    public static void main(String[] args) 
    { 
        System.out.print("Enter the Array:");
        Scanner scan= new Scanner(System.in);
        String inp=scan.nextLine();
        String[] items = inp.trim().split(" ");

        int n =items.length;

        int a[] = new int[n];
        for (int i = 0; i <n ; i++) {
            a[i] = Integer.parseInt(items[i]);
            }
        maxSubArraySum(a, n); 
    } 
} 