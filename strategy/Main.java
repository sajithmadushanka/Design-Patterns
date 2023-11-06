interface ISort{
       void sort();
}
class BubbleSort implements ISort{
        public void sort(){
            System.out.println("Bubble sort algorithem");
        }
}

class SelectionSort implements ISort{
        public void sort(){
            System.out.println("Selection sort algorithem");
        }
}
class MargeSort implements ISort{
        public void sort(){
            System.out.println("MergeSort sort algorithem");
        }
}
//--------------------------
interface ISearch{
        void search();
}
class BinarySearch implements ISearch{
        public void search(){
            System.out.println("Binary search algorithem");
        }
}
class LinerSearch implements ISearch{
        public void search(){
            System.out.println("Liner search algorithem");
        }
}
//--------------------

// context
class AlgorithemSelector{
    ISort iSort;
    ISearch iSearch;

    void setSortAlgorithem(ISort iSort ){
        this.iSort = iSort;
    }
    void setSearchAlgorithem(ISearch iSearch ){
        this.iSearch = iSearch;
    }

    void performSort(){
        iSort.sort();
    }
    void performSearch(){
        iSearch.search();
    }
}


public class Main{
    public static void main(String[] args) {
        AlgorithemSelector algorithemSelector = new AlgorithemSelector();
        ISort bubbleSort = new BubbleSort();
        algorithemSelector.setSortAlgorithem(bubbleSort);
        algorithemSelector.performSort();

        ISearch binarySearch = new BinarySearch();
        algorithemSelector.setSearchAlgorithem(binarySearch);
        algorithemSelector.performSearch();
    }
}