package recursion3;

/**
 * <I>Use case of sorting of array through recursion<I/>  : <br><br/>
 * Sorting an array through recursion has several use cases in real-life scenarios, particularly when dealing with complex data structures or when a recursive approach is preferred. Here are a few examples:<br><br/>
 *
 * File Systems: When working with file systems, a recursive sorting algorithm can be useful. For instance, consider a directory structure where each directory contains files and subdirectories. You might want to display the contents in a sorted order, and a recursive sorting algorithm could help achieve this.<br><br/>
 *
 * Organizational Hierarchy: In business applications or organizational systems, you might have a hierarchical structure representing different levels of management. Sorting employees or entities within each level using recursion could be a practical way to present the data in an organized manner.<br><br/>
 *
 * Tree Structures: Recursive sorting can be applied to tree structures, such as binary search trees or other hierarchical data structures. For instance, if you have a tree representing a catalog of products, you might want to display the products in a sorted order.<br><br/>
 *
 * Database Queries: Recursive sorting can be useful in certain database scenarios, especially when dealing with nested or hierarchical data. For example, if you have a table representing a hierarchical organization, you might want to retrieve and display the data in a sorted order.<br><br/>
 *
 * Graph Algorithms: In graph theory, recursive sorting algorithms like depth-first search (DFS) can be applied to traverse and sort elements in a graph. This is commonly used in applications related to social networks or network analysis.<br><br/>
 *
 * Dynamic Programming: Sorting through recursion is often used in dynamic programming scenarios. For example, when solving problems related to optimal substructure, breaking down a problem into smaller subproblems and sorting them recursively can lead to an efficient solution.<br><br/>
 *
 * Merge Sort: Merge sort, a commonly used recursive sorting algorithm, is efficient for sorting large datasets. It is often applied in practice in scenarios where stability and predictable performance are important.<br><br/>
 *
 * While sorting algorithms like quicksort or mergesort are frequently used for array sorting through recursion, the specific use case depends on the context of the application and the nature of the data being sorted. Recursive sorting is a powerful technique that can be applied to various scenarios where a divide-and-conquer strategy is beneficial.<br><br/>
 */

public class Sorted_array {
    // Q1 .
    // find the array is sorted or not
    public static void main(String[] args) {
        int[] array = {1,4,7,3,6,5} ;
        checkArray(array , 0) ;

        if (checkArray(array, 0)) {
            System.out.println("the array is sorted");
        }
        else {
            System.out.println("the array is unsorted ");
        }
    }
    static boolean checkArray(int[] array , int index ){
        // boolean
        if(index == array.length - 1){ //why ?
            return true ;
        }
        return array[index]  < array[index + 1]  && checkArray(array , index + 1) ;
    }
}
