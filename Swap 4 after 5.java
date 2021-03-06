import java.util.*;
public class Example
{
    public  void main()
    {
        int A[] = {5,4,9,4,9,5};
        System.out.println("Question Array -->>"+ Arrays.toString(A));
        compute(A);
        
    }
    public  void  compute(int arr[])
    {
        int low = 0; // Initially Start with 0
        int high = 0;
        while(high < arr.length) // Traverse upto high =5
        {
            if(arr[high]==5 && high< arr.length) /*Make sure you are within range*/
            {
                
                while(low<arr.length) // Traverse till low =4
                {
                    if(arr[low]==4 && low+1< arr.length) // make sure low's next index is in range which is to be swapped
                    {
                        ++low; // Increment to next index and swap
                        swap(arr,low,high);
                        break; // Break the loop once swapped
                    }
                    low++;
                }
/*If high was swapped then move the window next of low as we have nothing to do with previous index which is  already traversed */
                high = low+1; 
            }
//else simply traverse if 5 is not found until you find 5
            high++;
            
        }
        System.out.println(Arrays.toString(arr)); 
    }
    public  void swap(int a[], int i, int j)
    {
        if(i==j)
        return;
        
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}