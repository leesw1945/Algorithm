import java.util.*;

class Solution {
    
    int h; // 공원의 높이
    int w; // 공원의 너비

    public int[] solution(String[] park, String[] routes) {
        // 로봇 강아지의 초기 위치 설정
        int[] point = init(park);
        
        // 공원의 크기 저장
        h = park.length;
        w = park[0].length();
        
        // 각 경로에 따라 로봇 강아지를 이동
        for (String route : routes) {
            String[] routeArr = route.split(" ");
            String direction = routeArr[0]; // 방향
            int distance = Integer.parseInt(routeArr[1]); // 이동 거리
            
            // 주어진 방향과 거리만큼 로봇 강아지를 이동
            move(park, point, direction, distance);
        }
        
        // 최종 로봇 강아지의 위치 반환
        return point;
    }
    
    // 공원에서 로봇 강아지의 초기 위치 찾기 ('S' 위치)
    public int[] init(String[] park) {
        int[] result = new int[2];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    result[0] = i; // y 좌표 (행)
                    result[1] = j; // x 좌표 (열)
                    break;
                }
            }
        }
        return result;
    }
    
    // 주어진 방향과 거리만큼 로봇 강아지를 이동
    public void move(String[] park, int[] point, String direction, int distance) {
        int x = point[1]; // 현재 x 좌표
        int y = point[0]; // 현재 y 좌표

        // 방향에 따른 이동 처리
        switch (direction) {
            case "E": // 동쪽으로 이동
                for (int i = 1; i <= distance; i++) {
                    if (x + i >= w || park[y].charAt(x + i) == 'X') {
                        return; // 이동 중 장애물을 만나면 이동 중단
                    }
                }
                point[1] += distance; // x 좌표를 증가시켜 이동
                break;
            case "W": // 서쪽으로 이동
                for (int i = 1; i <= distance; i++) {
                    if (x - i < 0 || park[y].charAt(x - i) == 'X') {
                        return; // 이동 중 장애물을 만나면 이동 중단
                    }
                }
                point[1] -= distance; // x 좌표를 감소시켜 이동
                break;
            case "S": // 남쪽으로 이동
                for (int i = 1; i <= distance; i++) {
                    if (y + i >= h || park[y + i].charAt(x) == 'X') {
                        return; // 이동 중 장애물을 만나면 이동 중단
                    }
                }
                point[0] += distance; // y 좌표를 증가시켜 이동
                break;
            case "N": // 북쪽으로 이동
                for (int i = 1; i <= distance; i++) {
                    if (y - i < 0 || park[y - i].charAt(x) == 'X') {
                        return; // 이동 중 장애물을 만나면 이동 중단
                    }
                }
                point[0] -= distance; // y 좌표를 감소시켜 이동
                break;
            default:
                break;
        }
    }
}