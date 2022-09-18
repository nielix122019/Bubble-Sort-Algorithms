/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortapplication;


public class BubbleSortApplication {

    
    public static void main(String[] args) {
        
        
        //Now let's create a unsorted array value
        int arr[] = {100,1,2,50,30};
        //Pass it to sor function
        sort(arr);
        
        System.out.println("Sorted array!!");
        print(arr);
        //That's all thank you
    }
    
    //We need to create a function
    //Then assign in a parameter array value
    public static void sort(int arr[])
    {
        //Create a variable that will read the length of an array
        int n = arr.length;
        // n - 1 is tricks to minus each loop Example we have length of 3 - 1 so the next loop will be 2
        for(int i = 0; i < n - 1;i++)
        {
            //This loop will swap the index 0 to index 1 if the index 0 has less value
            for(int j = 0; j < n - i - 1; j++)
            {
                //Using if statement to analyze each index
                //arr[j] = index 0
                //arr[j+1] = index 1
                if(arr[j] > arr[j+1])
                {
                    //if statement is true we need to pass it to temporary variable 
                    int tmp = arr[j];
                    //Then pass the lower value to arr[j]
                    //Arr[j] is empty so we need to pass a new value since arr[j+1] has greater value
                    arr[j] = arr[j+1];
                    //Then assign the lower value to arr[j+1]
                    arr[j+1] = tmp;
                }
            }
        }
    }
    
    //Let's print if the value sorted successfully 
    public static void print(int arr[])
    {
        //Create a variable that will read the length of an array
        int n = arr.length;
        //Print each index
        // The ++i means 1+0 or the current value of i
        for(int i = 0; i < n; ++i)
        {
            //Using print method to make it more clean
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
