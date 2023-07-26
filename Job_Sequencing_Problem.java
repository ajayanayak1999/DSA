import java.util.Arrays;

class Job {
    public String job_id;
    public int deadline;
    public int profit;

    public Job(String job_id, int deadline, int profit) {
        this.job_id = job_id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class Job_Sequencing_Problem {

    public static String[] maxProfitSeqence(Job[] j) {
        int length = j.length;
        int maxProfit = 0;
        int countJobs = 0;
        Arrays.sort(j, (a, b) -> (b.profit - a.profit));
        int maxdeadline = 0;
        for (int i = 0; i < length; i++) {
            if (j[i].deadline > maxdeadline) {
                maxdeadline = j[i].deadline;
            }
        }
        String[] res = new String[maxdeadline + 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = "-1";
        }

        for (int i = 0; i < length; i++) {
            for (int k = j[i].deadline; k > 0; k--) {
                if (res[k] == "-1") {
                    res[k] = j[i].job_id;
                    maxProfit += j[i].profit;
                    countJobs++;
                    break;
                }
            }
        }
        System.out.println("Max profit=" + maxProfit);
        System.out.println("Job count=" + countJobs);
        return res;
    }

    public static void main(String[] args) {
        Job[] j = new Job[5];
        // j[0] = new Job("a", 4, 20);
        // j[1] = new Job("b", 1, 10);
        // j[2] = new Job("c", 1, 40);
        // j[3] = new Job("d", 1, 30);
        j[0] = new Job("a", 2, 100);
        j[1] = new Job("b", 1, 19);
        j[2] = new Job("c", 2, 27);
        j[3] = new Job("d", 1, 25);
        j[4] = new Job("e", 3, 15);

        String[] res = maxProfitSeqence(j);
        for (int i = 0; i < res.length; i++) {
            if (res[i] != "-1") {
                System.out.print(res[i] + " ");
            }
        }

    }
}