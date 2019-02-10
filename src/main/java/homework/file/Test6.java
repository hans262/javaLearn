package homework.file;

public class Test6 {
	public static void main(String[] args) {
//		System.out.println("ab&cd".indexOf("e"));
		String str="name=wanghua&age=25&sex=nv";
		String[] arr=str.split("&");
		for(int i=0;i<arr.length;i++){
			arr[i].split("=");
		}
	}
//	public static String parseUrlData(String str){
//		return "asd";
//	}
}
