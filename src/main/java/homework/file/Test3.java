package homework.file;
/*1.��1-500֮����ͬʱ��2��5��7��������������������5��һ�д�ӡ
2.��100�����ܱ�3��������֮�ͼ����ܱ�5��������֮�͵Ľ��*/
public class Test3 {
	public static void main(String[] args) {
		int num=0;
		for(int i=1;i<=500;i++){
			if((i%2==0) && (i%5==0) && (i%7==0)){
				System.out.print(i+",");
				num+=1;
				if(num%5==0) System.out.println();
			}
		}
		System.out.println();
		int sum=0;
		for(int i=0;i<100;i++) if(i%3==0) sum+=i;
		for(int i=0;i<100;i++) if(i%5==0) sum+=i;
		System.out.println(sum);
	}
}
