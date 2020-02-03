package thirtyBythirty;

public class RandomBig {
    public static void main(String[] args) {

        int[] num = new int[10];

        /*
        random()은 double 이므로 int 로 형변환을 해준다.
        *   public static double random() {
                return RandomNumberGeneratorHolder.randomNumberGenerator.nextDouble();
            }
        * */
        for(int i=0; i<num.length; i++) {
            num[i] = (int)(Math.random() * 20); // 0~19

            System.out.println(num[i]);
        }

        /* 최대. 최소 값 구하기
           배열의 0번째가 곧 1번째 값을 가리킨다.
           즉, 0번째부터 값을 찾기 위해 num[0] 으로 세팅
         */
        int min = num[0];
        int max = num[0];

        // 배열의 길이만큼 반복문을 돌려서 값을 하나하나 비교함
        for(int i=1; i<num.length; i++) {
            // 최소
            if(num[i] < min) {
                min = num[i];
            }
            // 최대
            if(num[i] > max) {
                max = num[i];
            }
        }

        System.out.println("min : " + min + " max : " + max);

    }

}
