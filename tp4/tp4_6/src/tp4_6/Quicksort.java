package tp4_6;

public class Quicksort {

    private int[] numbers;
    private int number;

    public void sort(int[] values) {
        // check for empty or null array
        if (values == null || values.length == 0) {
            return;
        }
        this.numbers = values;
        number = values.length;
        quicksort(0, number - 1, 0);
    }

    private void quicksort(int low, int high, int veces) {
        int i = low, j = high;
        System.out.println("vez numero: " + veces + " Low: " + low + " High: " + high);
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high - low) / 2];
        System.out.println("Pivot: " + pivot);

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                System.out.println("Cambiando los numeros: " + i + " y " + j);

                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j) {
            veces++;
            System.out.println("Arreglo final: ");
            for (int o : numbers) {
                System.out.print(o);
            }

            quicksort(low, j, veces);
        }
        if (i < high) {
            System.out.println("Arreglo final: ");
            for (int o : numbers) {
                System.out.print(o);
            }
            quicksort(i, high, veces);
        }
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}//4,2,8,7,1,9,5
