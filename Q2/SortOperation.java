package Q2;

public class SortOperation {
    
    public static void main(String[] args) {
        SortAlgo merge = new MergeSort();
        SortAlgo insert = new InsertionSort();
        SortAlgo select = new SelectionSort();

        merge.sort();
        insert.sort();
        select.sort();
    }
}
