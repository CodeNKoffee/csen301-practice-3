public class ArrayStack {
  private Object[] array;
  private int size;

  public ArrayStack(int capacity) {
    array = new Object[capacity];
    size = 0;
  }

  public void push(Object item) {
    if (size == array.length) {
      // Handle full stack (you can resize the array here if needed)
    }
    array[size++] = item;
  }

  public Object pop() {
    if (isEmpty()) {
      // Handle empty stack
      return null;
    }
    return array[--size];
  }

  public Object top() {
    if (isEmpty()) {
        // Handle empty stack
        return null;
    }
    return array[size - 1];
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean isFull() {
    return size == array.length;
  }

  public int size() {
    return size;
  }

  public void removeNth(int n) {
    if (n < 1 || n > size) {
      throw new IllegalArgumentException("Invalid value of n");
    }

    Object[] tempArray = new Object[array.length];

    for (int i = 0; i < n - 1; i++) {
      tempArray[i] = array[i];
    }

    for (int i = n; i < size; i++) {
      tempArray[i - 1] = array[i];
    }

    array = tempArray;
    size--;
  }
}
