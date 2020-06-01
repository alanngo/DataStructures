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
        int mid = (left + right) /2;

        if (arr[mid].compareTo(elem) > 0)
        {
            right = mid -1;
            return binarySearch(elem);
        }

        if (arr[mid].compareTo(elem) < 0)
        {
            left = mid +1;
            return binarySearch(elem);
        }

        left = 0;
        right = arr.length -1;
        return mid;
    }

}
