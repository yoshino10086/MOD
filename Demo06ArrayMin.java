public class Demo06ArrayMin{
	public static void main(String[] args){
		int[] array = new int[]{5,15,30,-20,10000};
		
		int  min = array[0];//比武擂台
		for(int i = 0;i < array.length;i++){
			//如果当前元素，比min更大，则换人
			if(array[i] < min){
				min = array[i];
			}
		}
		//谁最后最厉害，就能在max中留下谁的战斗力
		System.out.println("最小值：" + min);
	}
}