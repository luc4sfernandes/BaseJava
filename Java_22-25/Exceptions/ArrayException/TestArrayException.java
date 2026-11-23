public class TestArrayException {
	public static void main(String[] args){
		int[] nums = {20, 30, 40};

		try {
			System.out.println(nums[5]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: " + e.getMessage());  

		} finally {
			System.out.println("Sofware Encerrado...");
		} 
	}
}
