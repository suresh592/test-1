package com.scjppreparation.basics.arrays;

public class Arays2D {
	
	public static void main(String[] args) {
		
		//teh best eway of declaring like this is memory utilization
		int[][] a=new int[3][];
		
		a[0]=new int[2];
		a[1]=new int[3];
		a[2]=new int[2];
		
		int[][][] b=new int[3][][];
		
		b[0]=new int[3][];
		b[0][0]=new int[2];
		b[0][1]=new int[3];
		b[0][2]=new int[2];
		
		
		b[1]=new int[2][2];
		
		
		//righ tindex determines the row
		
		//left index determines teh column
		
		int[][]  mul=new int[4][4];
		
		int i,j,k=0;
		
		for(i=0;i<4;i++)
		{
			for( j=0;j<4;j++)
			{
				mul[i][j]=k;
				k++;
			}
		}
		
		for(i=0;i<4;i++)
		{
			for( j=0;j<4;j++)
			{
				System.out.print(mul[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		int[][] x=new int[4][];
		
		x[0]=new int[1];
		x[1]=new int[2];
		x[2]=new int[3];
		x[3]=new int[4];
		
		for(i=0;i<4;i++)
		{
			for( j=0;j<i+1;j++)
			{
				x[i][j]=k;
				k++;
			}
		}
		for(i=0;i<4;i++)
		{
			for( j=0;j<i+1;j++)
			{
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
				
				
			System.out.println("Three dimensional arrsys");
		
		//three dimensional array
//		
//		int[][][] threed=new int[3][4][5];
//		int m,n,o, q=0;
//		for( m=0;m<3;m++)
//		{
//			for( n=0;n<4;n++)
//			{
//				for( o=0;o<5;o++)
//				{
//					threed[m][n][o]=q;
//					q++;
//				}
//			}
//		}
//
//		
//		for( m=0;m<3;m++)
//		{
//			for( n=0;n<4;n++)
//			{
//				for( o=0;o<5;o++)
//				{
//					
//					System.out.print(threed[m][n][o] +"\t");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
//		
		


			int[][][][] threed=new int[2][3][4][5];
			int m,n,o, q=0,r;
			for( m=0;m<2;m++)
			{
				for( n=0;n<3;n++)
				{
					for( o=0;o<4;o++)
					{
						for(r=0;r<5;r++)
						{
						threed[m][n][o][r]=q;
						q++;
						}
					}
				}
			}

			for( m=0;m<2;m++)
			{
				for( n=0;n<3;n++)
				{
					for( o=0;o<4;o++)
					{
						for(r=0;r<5;r++)
						{
					System.out.print(threed[m][n][o][r]+ "\t");
						}
						System.out.println();
					}
					System.out.println();
				}
				System.out.println();
			}
	}

}
