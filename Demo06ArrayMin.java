public class Demo06ArrayMin{
	public static void main(String[] args){
		int[] array = new int[]{5,15,30,-20,10000};
		
		int  min = array[0];//������̨
		for(int i = 0;i < array.length;i++){
			//�����ǰԪ�أ���min��������
			if(array[i] < min){
				min = array[i];
			}
		}
		//˭�����������������max������˭��ս����
		System.out.println("��Сֵ��" + min);
	}
}