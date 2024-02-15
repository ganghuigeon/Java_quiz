package ch05;

public class quiz09 {
    public static void main(String[] args) {
        //주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성해보세요(힌트: 중첩 for 문 이용)

        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int sum = 0;
        double avg = 0.0;

        int avg2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j]; // 2차원 배열의 값을 꺼내서 총합을 구한다
                avg2 += 1; // 평균을 내기 위해 총 갯수를 구한다.
            }
        }
        avg = (double)sum / avg2;
        System.out.println("총합: " + sum);
        System.out.println("평균: " + avg);
    }
}

