package com.zaid.streams;

public class Stats {
  private int count;
  private int sum;
  private int min;
  private int max;

  
  public Stats(int count, int sum, int min, int max) {    
    this.count = count;
    this.sum = sum;
    this.min = min;
    this.max = max;
  }

  public int getCount() {
    return count;
  }
  
  public int getSum() {
    return sum;
  }
 
  public int getMin() {
    return min;
  }
 
  public int getMax() {
    return max;
  }
  
  public double getAverage(){
   return (getCount() > 0) ? (double) getSum()/getCount(): 0.0d;
  }
  
}
