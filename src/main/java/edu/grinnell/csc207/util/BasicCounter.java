package edu.grinnell.csc207.util;

public class BasicCounter implements Counter {
    protected int count;
    protected int start;

    /**
     * Main constructor
     * @param num integer
     */
    public BasicCounter(int num){
        this.count = num;
        this.start = num;
    }

    /**
   * Count something.
   *
   * @throws Exception
   *   When the count gets too large.
   */
  public void increment() throws Exception{
    if(this.count > Integer.MAX_VALUE){
        throw new Exception("Integer is too big");
    }
    this.count++;
  }

  /**
   * Reset the counter.
   */
  public void reset(){
    this.count = this.start;
  }

  /**
   * Get the value of the counter.
   *
   * @return the current value of the counter
   */
  public int get(){
    return this.count;
  }

  /**
   * Returns a string
   */
  public String toString(){
    return "[" + this.count + "]";
  }
}
