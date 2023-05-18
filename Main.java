import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static int Max(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    public static int Min(int [] tab){
    int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        return min;
}
  
    public static int[] readArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość elementów tablicy:");
        int n = scan.nextInt();
        int[] tab = new int[n];
        System.out.println("Podaj elementy tablicy:");
        for (int i = 0; i < n; i++) {
            tab[i] = scan.nextInt();
        }
        return tab;
    }

    public static void printArray(int []tab ){
    System.out.println("Składniki tablicy:");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
  }

    public static int []IncrementSort(int [] tab){
    int [] tabCopy = Arrays.copyOf(tab, tab.length);

   Arrays.sort(tabCopy);
      
    return tabCopy;
  }

    public static int []DecreamentSort(int [] tab){
        int[] tabCopy = Arrays.copyOf(tab, tab.length);
        Arrays.sort(tabCopy);
        int i = 0;
        int j = tabCopy.length - 1;

        while (i < j) {
            int temp = tabCopy[i];
            tabCopy[i] = tabCopy[j];
            tabCopy[j] = temp;

            i++;
            j--;
        }

        return tabCopy;
    }
  
  public static int []ReversTab(int [] tab){
int[] revTab = Arrays.copyOf(tab, tab.length);
        int i = 0;
        int j = revTab.length - 1;

        while (i < j) {
            int temp = revTab[i];
            revTab[i] = revTab[j];
            revTab[j] = temp;

            i++;
            j--;
        }

    return revTab;
  }
    public static void main(String[] args) {
        int[] tab = readArray();
        printArray(tab);

        int [] revTab=ReversTab(tab);
        printArray(revTab);

      
        int max = Max(tab);
        System.out.println("Max wartość tablicy: " + max);

        int min = Min(tab);
        System.out.println("Min wartość tablicy: " + min);
      
        int [] sort=IncrementSort(tab);
        System.out.println("Posortowana rosnąco wartość tablicy: " + Arrays.toString(sort));

        int [] sort1=DecreamentSort(tab);
        System.out.println("Posortowana malejaco wartość tablicy: " + Arrays.toString(sort1));
      
        

    }
}