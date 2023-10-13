public class RemovingNthStack {
  public static void removeNth(ArrayStack s, int n) {
    ArrayStack tmp = new ArrayStack(s.size());
    int size = s.size();

    for (int i = 0; i < size - n; i++) {
      tmp.push(s.pop());
    }
    if (!s.isEmpty()) {
      s.pop();
    }
    while (!tmp.isEmpty()) {
      s.push(tmp.pop());
    }
  }

  public static void main(String[] args) {
    ArrayStack s = new ArrayStack(5);
    s.push(1);
    s.push(5);
    s.push(23);
    s.push(8);
    s.push(2);
    s.printStack();
    removeNth(s, 2);
    s.printStack();
  }
}