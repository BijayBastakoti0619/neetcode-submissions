class DynamicArray {

    private int[] array;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
      this.capacity = capacity;
      this.size = 0;
      this.array = new int[capacity];
    }

    public int get(int i) {
      return array[i];
    }

    public void set(int i, int n) {
      array[i] = n;
    }

    public void pushback(int n) {
      if (size == capacity) {
          resize();
      }
      array[size] = n;
      size++;
    }

    public int popback() {
     size--;
     return array[size];
    }

    private void resize() {
       capacity *= 2;
       int[] newArray = new int[capacity];
       for (int i = 0; i < size; i++) {
           newArray[i] = array[i];
       }
       array = newArray;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
          return capacity;
    }
}