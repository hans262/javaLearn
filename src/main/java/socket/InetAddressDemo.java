package socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * InetAddress
 * ��ȡIP��ַ
 * 
 * UnknownHostException
 * �����Ҳ����쳣
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		//��������
		InetAddress address=InetAddress.getByName("OULA");
		System.out.println(address);
		//������ַ
		String host=address.getHostAddress();
		System.out.println(host);
		//��������
		String hostName=address.getHostName();
		System.out.println(hostName);
	}
}
