import java.util.*;
class bs{
 public static void bs(int a[],int t[],int key,int first,int last){
    int mid=(first+last)/2;
    while(first<=last){
    if(key==a[mid]){
      System.out.println("Element found at index "+t[mid]);
      break;}

    if(a[mid]<key){
      first=mid+1;}
    else{
      last=mid-1;
      }
    mid=(first+last)/2;

    }
    if(first>last){
     System.out.println("Element not found");
     }
   


    }
  
    static void bubbleSort(int arr[],int t[],int n)
    {
      
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    int temps=t[j];
                    arr[j] = arr[j + 1];
                    t[j] = t[j + 1];
                    arr[j + 1] = temp;
                    t[j + 1] = temps;
                }
    }
 
    /* Prints the array */
    static void printArray(int arr[],int t[],int n)
    {
       
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
        for (int i = 0; i < n; ++i)
            System.out.print(t[i] + " ");
        System.out.println();
    }
  
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of elements: ");
int n;
n=sc.nextInt();
int[] temp=new int[n];
System.out.println("Enter array of numbers: ");
for(int i=0;i<n;i++){
temp[i]=sc.nextInt();
}
int[] t=new int[n];
{
 for(int i=0;i<n;i++)
 t[i]=i;}

//sort
/*int term=0;
for(int i=0;i<n;i++)
{
 for (int j=0;j<n-j-1;j++)
 {
   if(temp[j+1]<temp[j])
   {
      term=temp[j+1];
      temp[j+1]=temp[j];
      temp[j]=term;
}}}*/

System.out.println("Enter key: ");
int key=sc.nextInt();
 //  BubbleSort b= new BubbleSort();
   bubbleSort(temp,t,n);
   printArray(temp,t,n);
   bs(temp,t,key,0,n-1);
  // for(int i=0;i<n;i++){
   //System.out.println(temp[i]);
}
   
}


