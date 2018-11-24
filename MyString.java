public class MyString implements Charsequence,Comparable<Charsequence>{
  private char[] data;

  public MyString(Charsequence s) {

  }

  // Methods that must be written

  public int length() {
    return data.length;
  }

  public char charAt(int index) {
    return data[index];
  }

  public Charsequence subSequence(int start, int end) {
    String result = "";
    for(int i = start; i < end; i++) {
      result += data[i];
    }
    return result;
  }

  public String toString{
    String result = "";
    for(int i = 0; i < length(); i++ {
      result += charAt(i);
    }
    return result;
  }

}
