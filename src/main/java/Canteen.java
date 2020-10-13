import java.util.ArrayList;
import java.util.List;

public class Canteen {
    private String canteenName;
    private List<Stall> stallList;
    private List<Integer> openTime;
    private List<Integer> closeTime;
    private Object ArrayList;

    Canteen(String canteenName, List<Stall> stallList, List<Integer> openTime,List<Integer> closeTime){
        this.canteenName = canteenName;
        this.stallList = stallList;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }
    public int getOpenTime(int dayOfWeek){
        return openTime.get(dayOfWeek-1);
    }
    int getCloseTime(int dayOfWeek) {
        return closeTime.get(dayOfWeek-1);
    }

    public List<Stall> getStallList() {
        return stallList;
    }

    List<Stall> checkOpenStall(dayOfWeek, time){
        List<Stall> openStallList = ArrayList<Stall>();
        for(Stall stall:this.stallList){
            if(stall.isOpen()){
                openStallList.add(stall);
            }
        }
        return openStallList;
    }

    public String getCanteenName() {
        return canteenName;
    }
}
