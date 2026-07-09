// Last updated: 7/9/2026, 3:05:36 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
      if(arrivalTime+delayedTime>24)
      return  (arrivalTime+delayedTime)%24;
      if(arrivalTime+delayedTime==24)
      return 0;
      else
      return arrivalTime+delayedTime;

    }
}