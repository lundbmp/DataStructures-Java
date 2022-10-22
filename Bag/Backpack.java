package Bag;

public class Backpack<T> implements Bag<T> {
    private int itemCount;
    private T[] itemContainer;

    public Backpack() {
        itemCount = 0;
        itemContainer = (T[])new Object[25];
    }

    public int getCurrentSize() {
        return itemCount;
    }

    public boolean isEmpty() {
        return itemCount == 0;
    }

    public boolean add(T newEntry) {
        if(itemCount < 25) {
            itemContainer[itemCount] = newEntry;
            itemCount++;
            return true;
        } else {
            return false;
        }
    }

    public T remove() {
        if(itemCount > 0) {
            T removedValue = itemContainer[0];

            for(int i = 0; i < itemCount; i++) {
                if(itemContainer[i] != null) {
                    itemContainer[i] = itemContainer[i + 1];
                }
            }
            itemCount--;
            return removedValue;
        } else {
            return null;
        }
    }

    public boolean remove(T anEntry) {
        if(itemCount > 0) {
            for(int i = 0; i < itemCount; i++) {
                if(anEntry == itemContainer[i]) {
                    for(int j = i; j < itemCount; j++) {
                        if(itemContainer[j] != null) {
                            itemContainer[j] = itemContainer[j + 1];
                        }
                    }
                    itemCount--;
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    public void clear() {
        itemCount = 0;
        itemContainer = (T[])new Object[25];
    }

    public int getFrequencyOf(T anEntry) {
        int frequency = 0;

        if(itemCount > 0) {
            for(int i = 0; i < itemCount; i++) {
                if(anEntry == itemContainer[i]) {
                    frequency++;
                }
            }
        }

        return frequency;
    }

    public boolean contains(T anEntry) {
        for(int i = 0; i < itemCount; i++) {
            if(itemContainer[i] == anEntry) {
                return true;
            }
        }
        return false;
    }

    public T[] toArray() {
        return itemContainer;
    }
}
