package homework.exception;
//閿熸枻鎷烽敓鏂ゆ嫹涓�敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷蜂竴閿熸枻鎷穒閿熸枻鎷烽敓閰电殑鎲嬫嫹閿熸枻鎷烽敓鏂ゆ嫹
//閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹閿熷彨鏂嚖鎷烽敓鏂ゆ嫹閿熻鍑ゆ嫹閿熸枻鎷烽敓锟� - 100 閿熶茎鍑ゆ嫹鍥撮敓鏂ゆ嫹
//閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷峰笇閿熸枻鎷烽敓鏂ゆ嫹璇抽敓鏂ゆ嫹閿熸暀顭掓嫹閿熺粸鎾呮嫹閿熸枻鎷锋潐閿熺祻XX閿熸枻鎷烽敓杈冨嚖鎷峰洿閿熸枻鎷�
//閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹甯岄敓鏂ゆ嫹閿熸枻鎷峰．閿熸彮浼欐嫹閿熸枻鎷疯繙閿熸枻鎷烽敓鏂ゆ嫹鏂愶綇鎷烽敓锟�
//	閿熷眾甯搁敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹涓洪敓鏂ゆ嫹IllegalScoreException
//	閿熷眾甯搁敓渚ヨ鎷烽敓鏂ゆ嫹閿熸枻鎷峰師閿熸枻鎷蜂负閿熸枻鎷烽敓缂寸》鎷稾XX閿熸枻鎷烽敓鏂ゆ嫹閿熻緝鍑ゆ嫹鍥撮敓鏂ゆ嫹
public class Hw_1 {
	public static void main(String[] args) {
		try{
			checkScore(120);
		}catch(RuntimeException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void checkScore(int score){
		if(score>100 || score<0){
			throw new IllegalScoreException("閿熺即纭锋嫹"+score+"閿熸枻鎷烽敓鏂ゆ嫹閿熻緝鍑ゆ嫹鍥�");
		}
		System.out.println("閿熺即纭锋嫹"+score+"閿熸枻鎷烽敓杈冨嚖鎷峰洿");
	}
}
