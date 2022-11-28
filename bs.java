import java.util.*;
class bs{
 public static void bs(int a[],int key,int first,int last){
    int mid=(first+last)/2;
    while(first<=last){
    if(key==a[mid]){
      System.out.println("Element found at index "+mid);
      break;}
    if(a[mid]<key){
      first=mid+1;}
    else{
      last=mid-1;
      }
    mid=(first+last)/2;

    }
    if(first>last){
     System.out.println("Element not found");}
   


    }
  
  
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of elements: ");
int n=nextInt();
int[] temp=new int[n];
System.out.println("Enter array of numbers: ");
for(int i=0;i<n;i++){
int temp[i]=sc.nextInt();
}
//sort
  
   bs(a,key,0,last);
   
}
}

