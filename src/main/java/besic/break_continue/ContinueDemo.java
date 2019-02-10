package besic.break_continue;

public class ContinueDemo {
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			if(i==3){
				System.out.println("Éµ±Æ");
				continue;
			}
			System.out.println(i);
		}
	}
}
