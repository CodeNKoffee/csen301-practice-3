public class CubeGame {
  public static boolean Check(ArrayStack x) {
    int size = x.size();
    int sum1 = 0, sum2 = 0;
    boolean isOddSized = size % 2 == 1;
    for (int i = 0; i <= size / 2; i++) {
      int current = x.pop();
      if (i < size / 2) {
        sum1 += current;
      }
      else if (i > size / 2 && !isOddSized) {
        sum2 += current;
      } 
      else if (i > size / 2 && isOddSized) {
        isOddSized = !isOddSized;
      }
    }
    boolean equals = sum1 == sum2;
    return equals;
  }

  public static void main(String[] args) {
    ArrayStack x = new ArrayStack(4);
    // EQUAL & ODD SIZE CONDITION
    // x.push(9);
    // x.push(3);
    // x.push(8);
    // x.push(8);
    // x.push(4);

    // UNEQUAL & EVEN SIZE CONDITION
    x.push(2);
    x.push(6);
    x.push(3);
    x.push(4);
    System.out.print(Check(x) ? "First half \u2260 Second Half" : "First half = Second Half");
  }
}
