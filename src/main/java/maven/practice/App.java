package maven.practice;

import java.util.Arrays;

public class App 
{
   int add(int a,int b)
   {
       return a+b;
   }
   int factorial(int[] numbers)
   {
       int result = 1;
       for (int number : numbers) {
           result *= number;
       }
       return result;
   }

   int areaOfRectangle(int length, int width)
   {
       return length * width;
   }

   String reverseOfString(String name)
   {
     char[] charArray = name.toCharArray();
     String reversed = "";
     for (int i = charArray.length - 1; i >= 0; i--) {
         reversed += charArray[i];
     }
     return reversed;
   }

   int[] arraytest(int[] numbers)
   {
    int[] result = new int[numbers.length];
    for(int i=0;i<numbers.length;i++)
    {
        result[i] = numbers[i];
    }

    return result;
   }

   int[] sort_array(int[] numbers)
   {
       Arrays.sort(numbers);
       return numbers;
   }
}
