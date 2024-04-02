public class QuickSort {
    
    public static void main(String[] args) {
        int[] array = {9, 2, 4, 7, 3, 7, 10};
        quickSort(array, 0, array.length - 1);
        
        System.out.println("Array ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    
    public static void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int pi = partition(array, inicio, fim);
            
            quickSort(array, inicio, pi - 1);
            quickSort(array, pi + 1, fim);
        }
    }
    
    public static int partition(int[] array, int inicio, int fim) {
        int pivot = array[fim];
        int i = inicio - 1;
        
        for (int j = inicio; j < fim; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        int temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;
        
        return i + 1;
    }
}
