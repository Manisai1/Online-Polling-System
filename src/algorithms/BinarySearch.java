package algorithms;

import model.Candidate;

public class BinarySearch {

    public Candidate searchById(Candidate[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid].id == key) {
                return arr[mid];
            }
            else if (arr[mid].id < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return null;
    }

    // Insertion Sort by ID (required before binary search)
    public void sortById(Candidate[] arr) {

        for (int i = 1; i < arr.length; i++) {

            Candidate key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].id > key.id) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}