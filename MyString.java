public class MyString implements Charsequence,Comparable<Charsequence>{
// Field(s)
  private char[] data;

// Constructor
  public MyString(Charsequence s) {
    data = new char[s.length()];
    for(int i = 0; i < s.length(); i++) {
      data[i] = s.charAt(i);
    }
  }

// Comparable method required
  public int compareTo(MyString object) {
    if(object == null) {throw new NullPointerException();}
  }

  // Methods that must be written

// Returns the length of the Charsequence
  public int length() {
    return this.data.length;
  }

// Returns the char at a specific index
  public char charAt(int index) {
    if(index < 0 || index >= data.length) {
      throw new IndexOutOfBoundsException("Incorrect index input!");
    }
    return this.data[index];
  }

// Returns a part of the Charsequence, much like substring
  public Charsequence subSequence(int start, int end) {
    if( (start-end) > 0 || (end - this.length()) > 0) {
      throw new IndexOutOfBoundsException("Incorrect start and/or end input!");
    }
    String result = "";
    for(int i = start; i < end; i++) {
      result += this.data[i];
    }
    return result;
  }

// Standard toString method
  public String toString{
    String result = "";
    for(int i = 0; i < length(); i++ {
      result += this.charAt(i);
    }
    return result;
  }

}
