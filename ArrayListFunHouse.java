//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
 public static ArrayList<Integer> getListOfFactors(int number)
 {
   ArrayList <Integer> factors = new ArrayList <Integer>();
   for (int i = 2; i < (number); i++){
     if ((number % i) == 0){
       factors.add(i);
      }
    }

  return factors;
 }
 
 public static void keepOnlyCompositeNumbers( List<Integer> nums )
 {
  for (int i = nums.size() - 1; i > -1;i--)
   if (getListOfFactors(nums.get(i)).size() == 0){
     nums.remove(i);
   }
 }
}