package Lists.Interface;

public interface ListInterface<T> {
//    Adds a new entry to the end of the list and size is increased by 1
    public void add(T newEntry);

//    Adds a new entry to a specified position within the list
//    Entries originally at the specified location will be moved to a higher location
//    Size increased by 1
    public void add(int newPosition, T newEntry);

//    Removes an entry at a given position, size will decrease by 1
//    entries higher will then have a position 1 lower
    public T remove(int givenPosition);

//    clears the list
    public void clear();

//    Replaces an entry at a given position, list size remains the same
    public T replace(int givenPosition, T newEntry);

//    Returns an entry at a given position
    public T getEntry(int givenPosition);

//    Returns an array of the list
    public T[] toArray();

//    Searches the list for a specific first instance of an entry
    public boolean contains(T anEntry);

//    returns the size of the list
    public int getLength();

//    returns true if the list is empty, false if list size is > 0
    public boolean isEmpty();

}
