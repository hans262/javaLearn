package exception;
/*
 * 自定义异常：
 * 
 * throws:抛出异常、由调用者来处理
 * throw:制造异常，并结束方法
 * 
 * */
public class ThrowDemo {
	public static void main(String[] args){
		try {
			checkScore1(100);
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
		
		try {
			checkScore2(99);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try {
			checkScore(102);
		}catch(MyException e){
			e.printStackTrace();
		}
	}
	public static void checkScore(int score){
		if(score>100 || score<0) {
			//抛出自己的异常
			throw new MyException("考试成绩不符合要求");
		}
		System.out.println("考试成绩符合要求");
	}
	public static void checkScore1(int score){
		if(score>100 || score<0) {
			//抛出运行时异常
			throw new RuntimeException("考试成绩不符合要求");
		}
		System.out.println("考试成绩符合要求");
	}
	public static void checkScore2(int score) throws Exception{
		if(score>100 || score<0) {
			//抛出编译时异常
			throw new Exception("考试成绩不符合要求");
		}
		System.out.println("考试成绩符合要求");
	}
}
