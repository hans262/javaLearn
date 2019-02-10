package homework.p7;
/*
根据描述写出正则表达式
(1)手机号正则:
	第一位为1
	第二位为3或4或5或7或8
	第三~十一位为0~9的其中一个数字
(2)邮箱正则:
	以@分界
	@ 符号左边为任意多个字符
	@ 符号右边为任意多个字符,点符号,任意多个字符
(3)定义一个存放邮箱的字符串数组{"hhxx@163.com","18601066888","nxgw@yeah.net","jpql@sohu.com.cn","15115888028"}
	利用正则表达式过滤出所有的邮箱,并打印
*/

//注意：java中转义一个字符需使用双斜杠，"\\"。
public class HomeWork4 {
	public static void main(String[] args) {
		String phone="18545684549";
		boolean phoneRex=phone.matches("[1][34578][0-9]{9}");
		System.out.println(phoneRex);
		
		String email="dwad25@dw.com";
		boolean emailRex=email.matches("\\w+@[\\w\\.]+");
		System.out.println(emailRex);
		
		String[] ee={"hhxx@163.com","18601066888","nxgw@yeah.net","jpql@sohu.com.cn","15115888028"};
		for(int i=0;i<ee.length;i++){
			if(ee[i].matches("\\w+@[\\w\\.]+")){
				System.out.println(ee[i]);
			}
		}
	}
}

