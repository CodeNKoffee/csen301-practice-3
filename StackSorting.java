public class StackSorting {
  public static ArrayStack SortStackAscendingly(ArrayStack x) {
    int size = x.size();
    ArrayStack y = new ArrayStack(size);

    while (!x.isEmpty()) {
      int current = x.pop();
      while (!y.isEmpty() && y.top() > current) {
        x.push(y.pop());
      }
      y.push(current);
    }
    return y;
  }

  public static void main(String[] args) {
    ArrayStack x = new ArrayStack(8);
    x.push(6);
    x.push(9);
    x.push(3);
    x.push(5);
    x.push(4);
    x.push(1);
    x.push(2);
    x.push(7);
    x.printStack();
    ArrayStack y = SortStackAscendingly(x);
    y.printStack();
  }
}
