package report;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        Integer count = 1;
        AtomicInteger answerCount = new AtomicInteger();
        answerCount.set(0);
        Map<String, Integer> reportedMap = new HashMap<>();
        Map<String, List<String>> reportMember = new LinkedHashMap<>();

        for(String id : id_list){
            reportMember.put(id,null);
        }


        for (String item : report) {
            List<String> reportedMember = new ArrayList<>();

            String reportId = item.split(" ")[0];
            String reportedId = item.split(" ")[1];

            if (!Objects.isNull(reportMember.get(reportId))) {
                reportedMember = reportMember.get(reportId);
            }

            if (!Objects.isNull(reportedMap.get(reportedId))) {
                if(!reportedMember.contains(reportedId)) {
                    count = reportedMap.get(reportedId) + 1;
                }else{
                    count = reportedMap.get(reportedId);
                }
            }

            if(!reportedMember.contains(reportedId)){
                reportedMember.add(reportedId);
            }

            reportedMap.put(reportedId, count);
            reportMember.put(reportId, reportedMember);

            count = 1;
        }

        int[] answer = new int[id_list.length];

        reportMember.forEach((member, reported)->{
            int reportCount = 0;
            int size;
            if(Objects.isNull(reported)){
                size = 0;
            }else {
                size = reported.size();
            }

            for(int i = 0; i <size; i++) {
                Integer reportedNumber = reportedMap.get(reported.get(i));

                if(Objects.nonNull(reportedNumber) && reportedNumber >= k){
                     reportCount++;
                }

                answer[answerCount.get()] = reportCount;
            }

            answerCount.incrementAndGet();
        });

        return answer;
    }
}