
public class App {

	public static void main(String[] args) {
		
		int [][] matrix = new int[][]{{1,2,8,4},{5,9,2,3},{4,2,3,1},{0,3,5,3}}; 

		matrix = zeroMatrix(matrix);
		
		displayMatrix(matrix);
		
	}

	private static int[][] zeroMatrix(int[][] matrix){
		boolean rowHasZero=false;
		boolean colHasZero=false;

		for(int i=0;i<matrix[0].length;i++){
			if(matrix[0][i]==0){
				rowHasZero=true;
				break;			
			}		
		}

		for(int i=0;i<matrix.length;i++){
			if(matrix[i][0]==0){
				colHasZero=true;
				break;			
			}		
		}

		for(int i=1;i<matrix[0].length;i++){
			for(int j=1;j<matrix.length;j++){
				if(matrix[i][j]==0){
					matrix[0][j]=0;
					matrix[i][0]=0;				
				}			
			}		
		}

		for(int i=0;i<matrix[0].length;i++){
			if(matrix[0][i]==0){
				zerofyCol(i,matrix);			
			}	
		}

		for(int i=0;i<matrix.length;i++){
			if(matrix[i][0]==0){
				zerofyRow(i,matrix);			
			}	
		}

		
		if(rowHasZero)zerofyRow(0,matrix);
		if(colHasZero)zerofyCol(0,matrix);
		
		return matrix;
	}
	
	private static void zerofyRow(int index,int[][] matrix){
		
		for(int i=0;i<matrix.length;i++){
			matrix[index][i]=0;
		}	
	}

	private static void zerofyCol(int index,int[][] matrix){
		
		for(int i=0;i<matrix[0].length;i++){
			matrix[i][index]=0;
		}	
	}

	private static void displayMatrix(int[][] matrix){
		for(int i=0;i<matrix[0].length;i++){
			for(int j=0;j<matrix.length;j++){
				System.out.print(matrix[i][j]);			
			}
			System.out.println();
		}	
	}
}
