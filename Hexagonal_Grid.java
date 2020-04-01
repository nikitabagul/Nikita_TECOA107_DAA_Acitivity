//Hexagonal Grid

import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        for(int t=0;t<tc;t++)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            int[] c=new int[n+n];//to merge both the stream
            String s1=sc.next();
            String s2=sc.next();
            int count=0;
            for(int i=0,j=0;i<n;i++,j+=2)
            {
                if(s1.charAt(i)=='0')
                    a[i]=0;
                else
                    a[i]=1;
                
                if(s2.charAt(i)=='0')
                    b[i]=0;
                else
                    b[i]=1;
                
                if(a[i]==1)
                count++;
                if(b[i]==1)
                count++;
                
  //merging both the stream in alternate fashion 
              c[j]=a[i];
              c[j+1]=b[i];  
           }
  //if No of 1's is Even Then solution May Exist         
 if(count%2==0)
  {
  for(int i=1;i<n+n;i++)
    if(c[i-1]==0 && c[i]==0) //for '--' pattern
       c[i-1]=c[i]=1;
    else if(i!=1 && c[i]==0 && c[i-2]==0) //for '/' pattern 
       c[i-2]=c[i]=1;
            
            int flag=0;
            for(int i=0;i<n+n;i++) //searching for 0 
            {
                if(c[i]==0)
                {
                    flag=1;
                    break;
                }
            }
            
            if(flag==0)
                System.out.println("YES");
            else
                System.out.println("NO"); 
     }
             else
                System.out.println("NO"); 
        }
    }
}
