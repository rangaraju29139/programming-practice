package assig6;

import java.time.chrono.ThaiBuddhistEra;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    private List<Integer> numbersToSort;
    private ExecutorService executorService;

    public MergeSorter(List<Integer> list, ExecutorService executorService) {
        this.numbersToSort = list;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {

        if(numbersToSort.size() <=1){
            return numbersToSort;
        }
        System.out.println(numbersToSort + " printed by : "+ Thread.currentThread().getName());
        List<Integer> firstHalf = new ArrayList<Integer>();
        List<Integer> secondHalf = new ArrayList<Integer>();

        int mid = numbersToSort.size()/2;

        for(int i=0;i<numbersToSort.size();i++){
            if(i<mid){
                firstHalf.add(numbersToSort.get(i));
            }else{
                secondHalf.add(numbersToSort.get(i));
            }
        }


        MergeSorter firstHalfSorter =  new MergeSorter(firstHalf,executorService);
        MergeSorter secondHalfSorter = new MergeSorter(secondHalf,executorService);


        Future<List<Integer>> futureSortedFirstHalf = executorService.submit(firstHalfSorter);
        Future<List<Integer>> futureSortedSecondHalf = executorService.submit((secondHalfSorter));

        List<Integer> firstSortedHalf = futureSortedFirstHalf.get();
        List<Integer> secondSortedHalf = futureSortedSecondHalf.get();

        List<Integer> sortedArray = new ArrayList<Integer>();
        int i=0;
        int j=0;
        if(i<firstSortedHalf.size() && j<secondSortedHalf.size()){
            if(firstSortedHalf.get(i) < secondSortedHalf.get(j)){
                sortedArray.add(firstSortedHalf.get(i));
                i++;
            }else{
                sortedArray.add(secondSortedHalf.get(j));
                j++;
            }
        }

        while(i < firstSortedHalf.size()){
            sortedArray.add(firstSortedHalf.get(i));
            i++;
        }
        while(j< secondSortedHalf.size()){
            sortedArray.add(secondSortedHalf.get(j));
            j++;
        }


        return sortedArray;
    }
}
