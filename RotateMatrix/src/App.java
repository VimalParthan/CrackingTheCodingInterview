public class App{
	public static void main(String [] args){
		int [] [] matrix= new int[][]{{1,2,3,4,5,6},
					      				{7,8,9,10,11,12},
					      {13,14,15,16,17,18},
					      {19,20,21,22,23,24},
					      {25,26,27,28,29,30},
					      {31,32,33,34,35,36}};		
		matrix =rotateMatrix(matrix);	
		displayMatrix(matrix);
	}

	private static int[][] rotateMatrix(int[][] matrix){
		
		if(matrix.length!=matrix[0].length){
			return null;		
		}

		int matrixLength=matrix.length;
		int numOfLayers =matrixLength/2;
		
		int firstIndex;
		int lastIndex;
		int temp;
		for(int layer=0;layer<numOfLayers;layer++){
			firstIndex= layer;
			lastIndex = matrixLength-layer-1;		
			for(int i=firstIndex;i<lastIndex;i++){
				int offset =i- firstIndex;
				temp = matrix[layer][i];
				matrix[layer][i]=matrix[lastIndex-offset][layer];
				matrix[lastIndex-offset][layer]=matrix[lastIndex][lastIndex-offset];
				matrix[lastIndex][lastIndex-offset]=matrix[i][lastIndex];
				matrix[i][lastIndex]=temp;				
			}		
		}

		return matrix;
	}

	private static void displayMatrix(int[][] matrix){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				System.out.print(matrix[i][j]+" ");		
			}
			System.out.println();		
		}
	}

}
