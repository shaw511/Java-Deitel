public class StudentPoll{

	public static void main(String[] args){
		int[] responses = {2,5,3,1,4,3,5,3,1,3,5,3,1,3,5,1,1,3,3,14}; 	
		int[] frequency = new int[6];

		for(int i=0;i<responses.length;i++){
			try{
				++frequency[responses[i]];
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
				System.out.printf(" responses[%d] = %d%n%n",	i,responses[i]);
			}
		}
		System.out.printf("%s%10s%n","Rating","Frequency");
		for(int i = 1;i<frequency.length;i++){
			System.out.printf("%6d%10d%n",i,frequency[i]);
		}
	}
}