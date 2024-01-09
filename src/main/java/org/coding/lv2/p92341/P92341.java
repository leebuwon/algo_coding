package org.coding.lv2.p92341;

import java.util.*;

public class P92341 {
    public static void main(String[] args) {
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        new Solution().solution(fees, records);
    }
}

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, String> inAndOutCheck = new HashMap<>();
        Map<String, Integer> feeCar = new HashMap<>();

        for (String record : records) {
            String[] split = record.split(" ");
            // IN 시간
            if (split[2].equals("IN")){
                String[] hhMM = split[0].split(":");
                int inTime = Integer.parseInt(hhMM[0]) * 60;
                inTime += Integer.parseInt(hhMM[1]);
                map.put(split[1], inTime);
                inAndOutCheck.put(split[1], split[2]);
            }
            // OUT 시간
            else {
                String[] hhMM = split[0].split(":");
                int outTime = Integer.parseInt(hhMM[0]) * 60;
                outTime += Integer.parseInt(hhMM[1]);

                int inTime = map.get(split[1]);
                int time = outTime - inTime;
                feeCar.put(split[1], feeCar.getOrDefault(split[1], 0) + time);
                inAndOutCheck.put(split[1], split[2]);
            }
        }

        for (Map.Entry<String, String> entry : inAndOutCheck.entrySet()) {
            String carId = entry.getKey();
            String event = entry.getValue();

            if (event.equals("IN")) {
                int inTime = map.get(carId);
                int outTime = 23 * 60 + 59;
                int time = outTime - inTime;
                feeCar.put(carId, feeCar.getOrDefault(carId, 0) + time);
            }
        }


        List<Map.Entry<String, Integer>> sortedFeeCar = new ArrayList<>(feeCar.entrySet());
        sortedFeeCar.sort(Map.Entry.comparingByKey());

        int[] answer = new int[sortedFeeCar.size()];
        int index = 0;
        for (Map.Entry<String, Integer> entry : sortedFeeCar) {
            int totalTime = entry.getValue();

            int baseTime = fees[0];
            int baseFee = fees[1];
            int unitTime = fees[2];
            int unitFee = fees[3];

            int totalFee = baseFee;

            if (totalTime > baseTime) {
                int exceedTime = totalTime - baseTime;
                totalFee += (exceedTime / unitTime) * unitFee;
                if (exceedTime % unitTime != 0) {
                    totalFee += unitFee;
                }
            }

            answer[index] = totalFee;
            index++;
        }

        return answer;
    }
}