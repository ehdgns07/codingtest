package report;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] id_list = { "muzi", "frodo", "apeach", "neo", "test" };
        String[] reportedId = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi", "test muzi"};


        // String[] id_list = {"con", "ryan"};
        // String[] reportedId = {"ryan con","ryan con","ryan con","ryan con"};

        solution.solution(id_list,reportedId, 2);
    }
}
