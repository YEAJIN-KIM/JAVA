class Example27 {
	public static void main(String args[]){
		System.out.println("�迭 a�� ��");
		int [] a = new int [4] ;
		a[0] = 11 ;
		a[1] = 22 ;
		a[2] = 33 ;
		a[3] = 44 ;
		
		System.out.println("a[0]="+a[0]+"\ta[1]="+a[1]+"\ta[2]="+a[2]+"\ta[3]="+a[3]);
		int f[][]={{1,2,3},
			{4,5}
		};
		
		System.out.println("f[0][0]="+f[0][0]+"\tf[0][1]="+f[0][1]+"\tf[0][2]="+f[0][2]);
		System.out.println();
		System.out.println("�迭 a�� ũ���:"+a.length);
		System.out.println("�迭 f�� 1���� ũ���:"+f[0].length);
		System.out.println("�迭 f�� 2���� ũ���:"+f[1].length);
	}

}
