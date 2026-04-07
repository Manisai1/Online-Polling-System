package datastructures;

public class CustomHashTable {

    int size = 100;
    int[] table;

    public CustomHashTable() {
        table = new int[size];
        for (int i = 0; i < size; i++)
            table[i] = -1;
    }

    int hash(int key) {
        return key % size;
    }

    public boolean insert(int key) {
        int index = hash(key);
        int start = index;

        while (table[index] != -1) {
            if (table[index] == key)
                return false;
            index = (index + 1) % size;
            if (index == start)
                return false;
        }

        table[index] = key;
        return true;
    }
}