/**
 * 
 */
package automaticMemoryManagementMechanism2.OOMException24;

/** 
 * @ClassName: JVMStackAndNativeMethodStackOOM 
 * @Description: TODO vm args: Xss128k
 * @author zhengqiang
 * @Email 1126686939@qq.com 
 * @Date 2018-04-09 15:35
 */
public class JVMStackAndNativeMethodStackOOM {

	private int stackLength=0;
	
	public void stackLeak(){
		stackLength++;
		stackLeak();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JVMStackAndNativeMethodStackOOM s=new JVMStackAndNativeMethodStackOOM();
		try{
			s.stackLeak();
		}catch(Exception e){
			System.out.println("s.stackLength: "+s.stackLength);
		}
		
	}

}
