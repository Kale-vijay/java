
public class NonPrimitiveDataTypes {
	public static void main (String args[]) {
		String str="test";
		System.out.println("string is :"+str);
		String str1= new String("test");
		System.out.println("string is :"+str1);
		int arr[];
        arr= new int[2];
        arr[0]=0;
        arr[1]=1;
       // arr[2]=2;
		System.out.println("memory location of arr is  :" + arr);
		System.out.println("value at 0 location :" + arr[0]);

		}	

}
