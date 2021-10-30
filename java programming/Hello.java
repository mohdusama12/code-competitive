import java.util.*;
import java.io.*;
class hello
{ 
 
    public static void main(String args[])
     {
       int a=0,b=1,c;
    for(int i=1;i<=10;i++)
    {
      c=a+b;
      System.out.println(c);
      a=b;
      b=c;
    }
      //  int rem,rev=0;
      //  Scanner scan=new Scanner(System.in);
      //  int no=scan.nextInt();
      //  int temp=no;
      //  while(temp!=0)
      //  {
      //    rem=temp%10;
      //    rev=rev*10+rem;
    
      //    temp=temp/10;
      //  }
       
      //   if(no==rev)
      //   {
      //     System.out.println("the number is palandrome");
      //   }
      //   else
      //   {
      //     System.out.println("the number is not palandrome");
      //  }
      //  if(rev==no)
      //  {
      //    System.out.println("the number is palandrome");
      //  }
      //  else
      //  {
      //    System.out.println("the numbe is not palandrome");
      //  }

      
    //  int a=0,b=1;int c;
    // for(int i=1;i<=40;i++)
    // {
    // c=a+b;
    // System.out.println(c);
    // a=b;
    // b=c;
    // }
     
    
    
    // for(int no=1;no<=100;no++)
    // {
    //   int temp=0;
    //  for(int i=2;i<no-1;i++)
    //  {
    //     if(no%i==0)
    //     {
    //       temp=temp+1;
    //     }
    //  }
    //  if(temp==0)
    //  {
    //    System.out.println(no);
    //  }
    // else
    // {
    //   System.out.println("the no is not prime"+no);
    // }
    
    //  }
 }

} 
    //Scanner scan=new Scanner(System.in);
  //   String name=scan.next();
  //   String sum="";
  //   for(int i=name.length()-1;i>=0;i--)
  //   {
  //      sum=sum+name.charAt(i);
  //   }
  //   System.out.println(sum);
//   {Scanner scan=new Scanner(System.in);
// int no=scan.nextInt();
// int rem; int rev=0;
// while(no!=0)
// {
//   rem=no%10;
//   rev=rev*10+rem;
//   no=no/10;
// }
// System.out.println(rev);  
  



//FACTORIAL PROGRAMS THROUGH THE RECURSION
// import java.util.*;
// import java.io.*;
// class Recursion
// {  static int fact=1;
// public static void main(String args[])
// {
//   Scanner scan=new Scanner(System.in);
//   int no=scan.nextInt();
// Recursion ob=new Recursion();
//   ob.calcFact(no);
//   System.out.println("factorials of"+no+"is"+fact);

// }
// void calcFact(int no)
// {
//   if(no>=1)
//   {
//     fact=fact*no;
//     calcFact(no-1);
//   }
// }
// }

    // Scanner scan=new Scanner(System.in);
    // int a=scan.nextInt(); int fact=1;
    // for(int i=1;i<=a;i++)
    // {
    //     fact=fact*i;
    // }
    // System.out.println("the factorial any no is"+fact);
    //Scanner scan=new Scanner(System.in);
  //   int a=scan.nextInt();
  //   for(int i=1;i<=10;i++)
  //   {
  //     System.out.println(a+"X"+i+"="+a*i);
  //   }
 //     Scanner scan=new Scanner(System.in);
 //      int a=scan.nextInt();
 //     int b=scan.nextInt(); 
 //     int res;
 //       String sym=scan.next();
    
 //  switch(sym)
 //  {
 //    case "+":
 //    res=a+b;
 //    System.out.println("entert the result"+res);
 //    break;
 //    case "-":
 //    res=a-b;
 //    System.out.println("the result is a and minus b is "+res);
 //    break;
 //    case "/":
 //    res=a/b;
 //    System.out.println("enter the result a / divide b is"+res);
 //    case "*":
 //    res=a*b;
 //    System.out.println("enter the result a and * b is"+res);
 //    break;
 //    default:
 //    System.out.println("invailid symbol");
 //  }

















//convert the roman number to integer numbers

//import java.util.*;

// import java.io.*;
// class Hello
// {
//   public static int romanToint(String s)
//   {
//     int nums[]=new int[s.length()];
//     for(int i=0;i<s.length();i++)
//     {
//       switch(s.charAt(i))
//       {
//         case 'M':
//         nums[i]=1000;
//         break;
//         case 'D':
//         nums[i]=500;
//         break;
//         case 'C':
//         nums[i]=100;
//         break;
//         case 'L':
//         nums[i]=50;
//         break;
//         case 'X':
//         nums[i]=10;
//         break;
//         case 'V':
//         nums[i]=5;
//         break;
//         case 'I':
//         nums[i]=1;
//         break;

//          }
//     }

//     int sum=0;
//     for(int i=0;i<nums.length-1;i++)
//     { 
//       if(nums[i]<nums[i+1]){
//       sum -=nums[i];
//       }
//       else
//       {
//       sum +=nums[i];
//       }

//     }return sum + nums[nums.length-1];
//   }
//   public static void main(String args[])
//    {
//    // input = "XI"
//   Scanner scan=new Scanner(System.in);
//   String s=scan.next();
//   int a=romanToint(s);
//   System.out.println(a);



//    }
//   }
   

  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    // String a[]=s.split(" ");
  
    //  String s="Mohd Usama";
    //  String arr[]=s.split(" ");
    //  for(int i=arr.length-1;i>=0;i--)
    //  {
    //    System.out.print(arr[i] +" ");
    //  }
  //   int a[]={1,2,4,7};
  //   int max=Integer.MIN_VALUE;
  //   for(int i=0;i<a.length;i++)
  //   {
  //     if(max<a[i])
  //     {
  //     max=a[i];
  //     }
  //   }
  //   System.out.println(max);
    // Scanner scan=new Scanner(System.in);
    // String s=scan.nextLine();
    // String sum="";
    // for(int i=s.length()-1;i>=0;i--)
    // {
    //   sum=sum+s.charAt(i);
      
    // }
    // if(s.equals(sum))
    // {
    //   System.out.print("the number is palendrom");

    // }
    // else
    // {
    //   System.out.println("the number is not palendrom");
    // }
    

//   int a[]={1,2,3,4,5};
//   int pos=scan.nextInt();
//   for(int k=0;k<pos;k++)
//   {
//   int b;
//   b=a[0];
//   for(int i=0;i<a.length-1;i++)
//   {
//         a[i]=a[i+1];

//   }
//   a[a.length-1]=b;
// }
//   for(int j=0;j<a.length;j++)
//   {
//     System.out.print(a[j]+" ");
//   }

  //  Scanner scan=new Scanner(System.in);
  //   String s=scan.nextLine();
  
  //   String sum="";
  //  for(int i=s.length()-1;i>=0;i--)
  //  {
  //     sum=sum+s.charAt(i);
  //  }
  //   if(s.equals(sum))
  //  {
  //     System.out.println("the string is palendrom");
  //  }
  //   else
  //   {
  //   System.out.println("String is not palandrom");
  //   }
    // int n=scan.nextInt();
    
    // int a[]=new int[n];
    // for(int i=0;i<n;i++)
    // {
    //   a[i]=scan.nextInt();

    // }
    // for(int i=0;i<a.length;i++)
    // {
    //   System.out.print(a[i]+" ");
    // }
    // int k=scan.nextInt();
    // System.out.println(a[k-1]);
    // System.out.println(a[a.length-k]);

  

    // for(int i=0;i<a.length;i++)
    // {
    //   System.out.println(a[i]);
    // }
  //   Scanner scan=new Scanner(System.in);
  //   int pos=scan.nextInt();
    
     
    
     
  //    int arr[]={1,2,3,4,5};
  //    for(int j=0;j<pos;j++)
  //    {
  //    int a;
  //   a=arr[0];
  //   for(int i=0;i<arr.length-1;i++)
  // {
  //            arr[i]=arr[i+1];
          
  // }

  // arr[arr.length-1]=a;
  //  }

  // for(int k=0;k<arr.length;k++)
  // {
  //   System.out.print(arr[k]+" ");
  // }

    //arr[arr.length-1]=a;
    //   Scanner scan=new Scanner(System.in);
    //   int k=scan.nextInt();
    //   int a[]={1,3,4,5,7,6};
    //   Arrays.sort(a);
    //  System.out.println([k-1]);
   //  System.out.println(a[a.length-k]);
   



   //  String s="Mohd Usama";
   // for(int i=s.length()-1;i>=0;i--)
   // {
   //   System.out.print(s.charAt(i));
   // }
    //   int arr[]={2,4,5,6,7};
    //   for(int i=0;i<arr.length;i++)
    // {
    //  System.out.println(arr[i]); 
    // //  arr[i]=scan.nextInt();
    // }
  


  

    // Scanner scan=new Scanner(System.in);
    // int n=scan.nextInt();
    // int arr[]=new int[n+2];
    // for(int i=0;i<n;i++)
    // {
    //   arr[i]=scan.nextInt();
    // }
    // arr[n]=scan.nextInt();
    // arr[n+1]=scan.nextInt();
    // for(int i=0;i<arr.length;i++)
    // {
    //   System.out.print(arr[i]+" ");
    // }
  
    // for(int i=0;i<arr.length;i++)
    // {
    //   System.out.println(arr[i]);
    // }
  

  // static int fact(int n)
  // {
  //      if(n==0)
  //      {
  //           return 1;
  //      }
  //      return n*fact(n-1);
  // }
//   public static void main(String args[])
//   {
//     Scanner scan=new Scanner(System.in);
//     int n=scan.nextInt();
   
//    int arr[]= new int[n+2];

//   for(int i=0;i<n;i++)
//   {
//     arr[i]=scan.nextInt();
//   }
//   arr[n]=scan.nextInt();
//   arr[n+1]=scan.nextInt();
  
  
//  for(int i=0;i<arr.length;i++)
//  {
//    System.out.print(arr[i]+" ");
//  }
 
   

  // for(int i=s.length()-1;i>=0;i--)

  // {
  //   System.out.print(s.charAt(i));
  // }
//   int i=s.length()-1;
//  while(i>=0)
//  {
//     System.out.print(s.charAt(i));
//     i--;
//   }
 // }

//}


   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    /*for(int j=1;j<=6;j++)
    {
      for(int i=1;i<=6;i++)
      {
        System.out.print("* ");
    
      }
      System.out.println();
 
    }
  }
}*/
   /* Scanner scan=new Scanner(System.in);
    
   int num=scan.nextInt(); 
   int temp=0;
   for(int i=2;i<=num/2;i++)
   {
     if(num%i==0)
     {
       temp=1;
     
     }
   }
     if(temp!=0)
     {
       System.out.println("the number is not prime");
     }
     else
     {
       System.out.println("the number is prime");
     }
   

  }
}*/
   
  /*  Scanner scan=new Scanner(System.in);
   int[] talib=new int[4];
   for(int i=0;i<4;i++)
   {
      talib[i]=scan.nextInt();
   }
 int sum=0;
   for(int i=0;i<4;i++)
   {
    sum=sum+talib[i];
   }
   System.out.println();
  

 }
}*/

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    /* Scanner scan=new Scanner(System.in);
    System.out.println("enter the number");
    for(int i=0;i<5;i++)
    {
    int n=scan.nextInt();
    if(n%2==0)
    {
      System.out.println("the numbers is even");
      }
      else
      {
        System.out.println("the numbers is odd");
      }
    }
  }
}*/
































/*import java.util.*;
import java.io.*;

class Hello
{
  public static void main(String arg[])
  {
    int i;
    Scanner scan=new Scanner(System.in);
 int[] shagun=new int[10];
for( i=0;i<10;i++)
{
  shagun[i]=scan.nextInt();
}
// System.out.println(shagun[4]);
// System.out.println(shagun[6]);
for(i=0;i<10;i++)
{
    if(shagun[i]%2=0){
      System.out.println("Number is even");
      }
      else{
        System.out.println("Number is odd");
      }
}



}
}*/





/*public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
    myMethod();
    myMethod();
  }
}*/
/*array program
class Hello
{
  public static void main(String arg[])
  {
    Scanner scan=new Scanner(System.in);
     int[] usama=new int[5];
    
     for(int i=0;i<5;i++)
     {

           usama[i]=scan.nextInt();
     }
   
    for(int i=0;i<5;i++)
    {
            System.out.print(usama[i]+"  ");
    }

  }
}*/