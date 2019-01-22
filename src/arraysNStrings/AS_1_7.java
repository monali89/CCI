package arraysNStrings;

public class AS_1_7 {

	public static void main(String[] args) {
		int[][] mt = {
				{1,0,3},
				{1,4,5},
				{8,9,2}
		};

		setZero(mt);
	}

	public static void setZero(int[][] mt){
		
		int[] track_x = new int[mt.length];
		int[] track_y = new int[mt[0].length];
		
		for(int x=0; x<mt.length; x++){
			for(int y=0; y<mt[0].length; y++){
				if(mt[x][y] == 0){
					track_x[x] = 1;
					track_y[y] = 1;
				}
			}
		}
		
		for(int x=0; x<mt.length; x++){
			for(int y=0; y<mt[0].length; y++){
				if((track_x[x] == 1) || (track_y[y] == 1)){
					mt[x][y] = 0;
				}
			}
		}
		
		for(int x=0; x<mt.length; x++){
			for(int y=0; y<mt[0].length; y++){
				System.out.print(mt[x][y] + " ");
			}
			System.out.println();
		}
		
	}
	
}
