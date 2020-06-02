package main.sort;

public class Sort <E extends Comparable<E>>
{
    private final E [] arr;

    public Sort(E [] e){ arr = e; }

    public void bubbleSort()
    {
        for (int i = 0; i< arr.length; i++)
        {
            for (int j = 0; j< arr.length -1; j++)
            {
                if (arr[j].compareTo(arr[j + 1])>0)
                {
                    E tmp = arr[j];
                    arr[j] = arr[j+ 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }


    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (E e: arr)
            sb.append(e.toString()).append("\n");
        return sb.toString();
    }

}
