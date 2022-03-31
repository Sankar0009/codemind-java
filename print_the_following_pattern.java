import java.util.*;
class a{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==n-j-1||i==j)
                {
                    System.out.print("x");
                }
                else
                System.out.print("0");
            }
             System.out.println();
        }
    }
}