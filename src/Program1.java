public class Program1
{
    public static void main(String[] args)
    {
        String s1="geeksforgeeks";
        char[] arr = s1.toCharArray();
        for (int i=1;i<arr.length-1;i++)
        {
            int temp;
            temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = (char) temp;
            if(arr[i] == arr[i-1])
            {
                arr[i] = arr[i-1];
                System.out.println(arr);
            }
        }
    }
}
