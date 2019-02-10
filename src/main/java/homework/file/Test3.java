package homework.file;
/*1.求1-500之内能同时被2，5，7整除的所有数及个数并5个一行打印
2.求100以内能被3整除的数之和加上能被5整除的数之和的结果*/
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
