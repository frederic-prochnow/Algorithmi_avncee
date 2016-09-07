/**
 * SDD Seance TP 1 :
 *
 * @author <a href="mailto:Frederic.Guyomarch@univ-lille1.fr">FrÃ©dÃ©ric Guyomarch</a>
 * IUT-A, Universite de Lille, Sciences et TEchnologies
 */
public class Sort {
	

    public static int [] generateRdmIntArray(int n, int min, int max){
    	int[] tab = new int [n];
    	for(int i = min; i<max; i++){
    		tab[i] = (int) (Math.random()*100);
    	}
    	return tab;
    }


    public static void bubbleSort(int [] tab,Counter c){
    	for(int i= tab.length; i >0; i--) {
    		for(int j = 0; j<i-1; j++){
    			c.incComp();
    			if(tab[j] > tab[j+1]){
    				swap(tab,j,j+1);
    				c.incPerm();
    			}
    		}
    	}
    }
    
    public static void selectSort(int [] tab,Counter c){
    	for(int i=0; i<tab.length;i++){
    		int minIdx = i;
    		for(int j=i; j<tab.length; j++){
    			c.incComp();
    			if(tab[j]<tab[minIdx]){
    				minIdx = j;
    			}
    			c.incPerm();
    			swap(tab,i,minIdx);
    		}
    	}
    }
    /*
     * 	[33-95-19-77-16-2-13-34-84-0-0]
     *	[0-13-2-16-19-33-34-77-84-95-95]
     */

    public static void insertSort(int [] tab,Counter c) {
    	for(int i=0; i<tab.length; i++){
    		c.incPerm();
    		int tmp = tab[i]; 
    		int j=i;
    		while(j>0 && tab[j-1]>=tmp){
    			tab[j] = tab[j-1];
    			c.incComp();
    			j--;
    		}
    		tab[j] = tmp;
    	}
    }
    
    public static void printArray(int [] tab){
    	System.out.print("[");
    	for(int i=0; i<tab.length; i++){
    		System.out.print(tab[i]+"-");
    		if(i==tab.length-1){
    			System.out.print(tab[i]);
    		}
    	}
    	System.out.println("]");
    }

    public static void swap(int [] tab, int idx, int idx2){
    	int mem = tab[idx];
    	tab[idx] = tab[idx2];
    	tab[idx2] = mem;
    }

    public static void main(String[] args){
    	int [] tab = generateRdmIntArray(10,0,9);
    	Counter c = new Counter();
    	printArray(tab);
    	bubbleSort(tab,c);
    	printArray(tab);
    	System.out.println(c.toString());
    	
    }


}
