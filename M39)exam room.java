import java.util.TreeSet;

class ExamRoom {
    int n;
    TreeSet<Integer> set;
    public ExamRoom(int n) {
        this.n = n;
        set = new TreeSet<>();
    }
    
    public int seat() {
        if (set.isEmpty()) {
            set.add(0);
            return 0;
        }
        int maxDist = set.first();
        int seat = 0;
        int prev = -1;
        for (int s : set) {
            if (prev != -1) {
                int dist = (s - prev) / 2;
                if (dist > maxDist) {
                    maxDist = dist;
                    seat = prev + dist;
                }
            }
            prev = s;
        }
        if (n - 1 - set.last() > maxDist) {
            seat = n - 1;
        }
        set.add(seat);
        return seat;
    }
    
    public void leave(int p) {
        set.remove(p);
    }
}
