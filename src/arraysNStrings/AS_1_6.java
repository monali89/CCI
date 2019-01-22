package arraysNStrings;

public class AS_1_6 {

	public static void main(String[] args) {
		
		char[][] mt = {
				{'a', 'b', 'c'},
				{'p', 'q', 'r'},
				{'x', 'y', 'z'}
		};
		
		char[][] mt2 = {
				{'a', 'b', 'c', 'd'},
				{'p', 'q', 'r', 's'},
				{'v', 'x', 'y', 'z'},
				{'1', '2', '3', '4'}
		};
		
		rotate90(mt2);

	}

	public static void rotate90(char[][] matrix){
		
		char[][] nw = new char[matrix.length][matrix.length];
		
		for(int i=0; i<matrix.length; i++){
			int offset = matrix.length-1;
			for(int j=0; j<matrix.length; j++){
				nw[offset][i] = matrix[i][j];
				offset--;
			}
		}
		
		for(int i=0; i<nw.length; i++){
			for(int j=0; j<nw.length; j++){
				System.out.print(nw[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}
