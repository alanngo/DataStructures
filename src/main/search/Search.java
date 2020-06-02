package main.search;


public class Search<E extends Comparable<E>>
{
    E [] arr;
    int left, right;

    public Search(E [] e)
    {
        arr = e;
        left = 0;
        right = arr.length -1;
    }

    public int linearSearch(E elem)
    {
        for (int i =0 ; i<arr.length; i++)
        {
            if (arr[i].equals(elem))
                return i;
        }
        return -1;
    }

    public int binarySearch(E elem)
    {
        // item does not exist
        if (left > right)
        {
            left = 0;
            right = arr.length -1;
            return -1;
        }

        int mid = (left + right) /2;

        //check right hand side
        if (arr[mid].compareTo(elem) > 0)
        {
            right = mid -1;
            return binarySearch(elem);
        }

        //check left hand side
        if (arr[mid].compareTo(elem) < 0)
        {
            left = mid +1;
            return binarySearch(elem);
        }
        // item has been found
        if (arr[mid].compareTo(elem) == 0)
        {
            left = 0;
            right = arr.length -1;
            return mid;
        }

        // should never go here
       throw new RuntimeException("binary search failed");
    }

}
