import java.util.*;
class A 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            int s=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i][j]==1)
                {
                    int k=i+j;
                     s+=k;
                }
            }
             System.out.println(s);
        }
    }
}