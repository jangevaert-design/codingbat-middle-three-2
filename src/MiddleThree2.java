public class MiddleThree2 {
  public String middleThree(String str) {
    int len = str.length();

    return str.substring((len / 2 - 1), (len / 2) + 2);
  }

}
