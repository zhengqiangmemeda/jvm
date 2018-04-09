/**
 * 
 */
package automaticMemoryManagementMechanism2.OOMException24;

import java.util.ArrayList;
import java.util.List;

/** 
 * @ClassName: HeapOOM 
 * @Description: vm args: -Xmx20m -Xms20m -XX:+HeapOnDumpOutOfMemoryError
 * @author zhengqiang
 * @Email 1126686939@qq.com 
 * @Date 2018-04-09 15:11
 */
public class HeapOOM {

	static class OOMObject{}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<OOMObject> list=new ArrayList<OOMObject>();
		while(true){
			list.add(new OOMObject());
		}
	}

}
