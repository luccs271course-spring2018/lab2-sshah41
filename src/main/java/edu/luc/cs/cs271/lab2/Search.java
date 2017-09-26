package edu.luc.cs.cs271.lab2;

import java.util.List;
import java.util.Optional;

public class Search {

  /** Looks for the position of the named team in an array. */
  public static Optional<Integer> findTeamPosition(final Team[] arr, final String key) {
    // Gets the array size
    final int size = arr.length;
    // Runs through a for loop to check
    for (int i = 0; i < size; i++) {
      // Gets the current item at index and compare name to key
      if (arr[i].getName().equals(key)) {
        // Return the index of where the item with key is located
        return Optional.of(i);
      }
    }
    // If it does not exist in the array then return an empty optional
    return Optional.empty();
  }

  /** Looks for the position of the named team in a list. */
  public static Optional<Integer> findTeamPosition(final List<Team> list, final String key) {
    // TODO complete this method done
    final int size= list.size();
    for(int i=0;i<size;i++){
      if(list.get(i).getName().equals(key)){
        return Optional.of(i);
      }
    }
    return Optional.empty();
  }
  
  /** 
   * Looks for the position of the poorest team that has at least 
   * the specified funding level.
   * @pre arr is sorted
   * @post arr[result].funding >= minFunding && for all 0 <= i < result : arr[i].funding < minFunding
   */
  public static Optional<Integer> findTeamMinFunding(final Team[] arr, final int minFunding) {
    // TODO complete this method done
    System.out.println("Searching by linear search algorithm");
    final int size= arr.length;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i].getFunding()>=minFunding) {
      return Optional.of(i);
      }
    }
    return Optional.empty();
  }
  
  /** 
   * Looks for the position of the poorest team that has at least 
   * the specified funding level. 
   * Uses binary search: Initially search the entire array, 
   * then repeatedly eliminate the wrong half of the array until 
   * zero or one items are left.
   * @pre arr is sorted
   * @post arr[result].funding >= minFunding && for all 0 <= i < result : arr[i].funding < minFunding
   */
  public static Optional<Integer> findTeamMinFundingFast(final Team[] arr, final int minFunding) {
    // TODO complete this method done
    System.out.println("Searching by Binary search algorithm");
    // Gets the array size
    if(minFunding<arr[0].getFunding()){
      return Optional.of(0);
    }
    else{
    final int size = arr.length;
    // Initially search the entire array
    int low = 0;
    int high = size - 1;
    int mid = (high + low) / 2;
      if(minFunding>arr[high].getFunding()){
      System.out.println("Cannot afford any team");
      return Optional.empty();
      }
      else{
        while (high >= low) {
        int roundfunding= ((minFunding+99)/100)*100;

       if (roundfunding == arr[mid].getFunding()) {
          return Optional.of(mid);
       }
       else if (roundfunding < arr[mid].getFunding()) {
        high = mid-1;
        return Optional.of(high);
       }
       else if (roundfunding > arr[mid].getFunding()) {
        low = mid+1;
        return Optional.of(low);
       }
       else {
        return Optional.empty();
       }
      // Keep going as long as there is more than one item to be checked
      // Eliminate the wrong half of the array
      // Return current item only if it meets the condition!
    }
    if (low <= high && arr[low].getFunding() >= minFunding) {
      return Optional.of(low);
    } else {
      System.out.println("Not there!!!!");
      return Optional.empty();

    }
  }
  }
  }
}
