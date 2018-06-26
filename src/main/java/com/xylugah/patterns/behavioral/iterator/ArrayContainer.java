package com.xylugah.patterns.behavioral.iterator;

public class ArrayContainer<T> implements Container<T> {

  private T[] array;

  public ArrayContainer() {
  }

  public ArrayContainer(T[] array) {
    this.array = array;
  }

  public void setArray(T[] array) {
    this.array = array;
  }

  @Override
  public Iterator<T> getIterator() {
    return new ArrayIterator();
  }

  private class ArrayIterator implements Iterator<T> {

    private int index = 0;

    @Override
    public boolean hasNext() {
      if (array == null) {
        return false;
      }
      return index < array.length;
    }

    @Override
    public T next() {
      if (this.hasNext()) {
        return array[index++];
      } else {
        return null;
      }
    }
  }
}
