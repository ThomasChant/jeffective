package tip9;

import java.util.Comparator;

import java.util.*;

/**
 * Created by Administrator on 2016/6/4 0004.
 */
public class AssignmentStore {
    private int storeId;
    private double distance;
    private static final StoreDistanceComparetor DISTANCE_CMP = new StoreDistanceComparetor();


//    @Override
//    public int compareTo(AssignmentStore o) {
//        if(storeId>o.storeId){
//            return 1;
//        }
//        if(storeId<o.storeId){
//            return -1;
//        }
//        if(Double.compare(distance,o.distance)>0){
//            return 1;
//        }
//        if(Double.compare(distance,o.distance)<0)
//            return -1;
////        if(distance>o.distance)
////            return 1;
////        if(distance<o.distance)
////            return -1;
//        return 0;
//    }

    public AssignmentStore(int storeId, double distance) {
        this.storeId = storeId;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "AssignmentStore{" +
                "storeId=" + storeId +
                ", distance=" + distance +
                '}';
    }

    public static void main(String[] args) {
//        System.out.println(1.0==Double.NaN);
//        AssignmentStore as = new AssignmentStore(5,9);
//        AssignmentStore as1 = new AssignmentStore(2,1);
//        AssignmentStore as2 = new AssignmentStore(3,7.4);
////        TreeSet treeSet = new TreeSet();
////        treeSet.add(as);
////        treeSet.add(as1);
////        System.out.println(treeSet.size());
//        List<AssignmentStore> assignmentStoreList = new ArrayList<>();
//        assignmentStoreList.add(as);
//        assignmentStoreList.add(as1);
//        assignmentStoreList.add(as2);
//        System.out.println(assignmentStoreList);
//        Collections.sort(assignmentStoreList, new Comparator<AssignmentStore>() {
//            @Override
//            public int compare(AssignmentStore o1, AssignmentStore o2) {
//                if (Double.compare(o1.distance, o2.distance) > 0)
//                    return 1;
//                if (Double.compare(o1.distance, o2.distance) < 0)
//                    return -1;
//                return 0;
//            }
//        });
//        System.out.println(assignmentStoreList);
//
//
//        Collections.sort(assignmentStoreList, AssignmentStore.DISTANCE_CMP);
//        System.out.println(assignmentStoreList);
//
//
//
//
//        Set<AssignmentStore> assignmentStores = new TreeSet<AssignmentStore>(AssignmentStore.DISTANCE_CMP);
//        assignmentStores.add(as);
//        assignmentStores.add(as1);
//        assignmentStores.add(as2);
//        System.out.println(assignmentStores);
    }

    private static class StoreDistanceComparetor implements Comparator<AssignmentStore>{

        @Override
        public int compare(AssignmentStore str1, AssignmentStore str2) {
            if(Double.compare(str1.distance,str2.distance)>0)
                return 1;
            if(Double.compare(str1.distance,str2.distance)<0)
                return -1;
            return 0;
        }
    }

}
