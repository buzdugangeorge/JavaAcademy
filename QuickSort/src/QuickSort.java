
public class QuickSort {

	private static String[] str;
	private static int		length;
	
	private void			swapCaracters(int start, int end){
		String aux = QuickSort.str[start];
		QuickSort.str[start] = QuickSort.str[end];
		QuickSort.str[end] = aux;
	}
	
	private void			quickSort(int start, int end){
		int	i = start;
		int j = end;
		String pivot = QuickSort.str[start + (end - start)];
		
		while (i <= j){
			while (QuickSort.str[i].compareTo(pivot) < 0)
				i++;
			while (QuickSort.str[j].compareTo(pivot) > 0)
				j--;
			if (i <= j)
				swapCaracters(i,j);
			i++;
			j--;
		}
		if (start < j){
			quickSort(start, j);
		}
		if (i < end){
			quickSort(i, end);
		}
	}
	
	void	sort(String str[]){
		if (str == null || str.length == 0)
			return ;
		QuickSort.str = str;
		QuickSort.length = str.length;
		quickSort(0, length - 1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort sorter = new QuickSort();
		String words[] = {"InputString" , "OtherString" , "String"};
		sorter.sort(words);
		
		for (String i : words){
			System.out.println(i);
		}
	}

}
