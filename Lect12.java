import java.util.*;
class Lect12
{
	public static void main(String ars[])
	{
	int a[]=new int[]{1,5,4,7};
	int b[]=new int[]{2,6,8,9};
	int c[]=new int[8];
	
	for(int i=0;i<4;i++)
	
for(int j=0;j<8;j++)		
	
if(a[i]<b[i]){
		
			c[j]=a[i];
            break;
		}
else{
	c[j]=b[i];
break;
}

for(int k=0;k<8;k++)
System.out.println(c[k]);
}

}
