package socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * InetAddress
 * 获取IP地址
 * 
 * UnknownHostException
 * 主机找不到异常
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		//主机对象
		InetAddress address=InetAddress.getByName("OULA");
		System.out.println(address);
		//主机地址
		String host=address.getHostAddress();
		System.out.println(host);
		//主机名称
		String hostName=address.getHostName();
		System.out.println(hostName);
	}
}
