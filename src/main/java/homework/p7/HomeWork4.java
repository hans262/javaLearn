package homework.p7;
/*
��������д��������ʽ
(1)�ֻ�������:
	��һλΪ1
	�ڶ�λΪ3��4��5��7��8
	����~ʮһλΪ0~9������һ������
(2)��������:
	��@�ֽ�
	@ �������Ϊ�������ַ�
	@ �����ұ�Ϊ�������ַ�,�����,�������ַ�
(3)����һ�����������ַ�������{"hhxx@163.com","18601066888","nxgw@yeah.net","jpql@sohu.com.cn","15115888028"}
	����������ʽ���˳����е�����,����ӡ
*/

//ע�⣺java��ת��һ���ַ���ʹ��˫б�ܣ�"\\"��
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

