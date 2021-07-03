
public class FrequencyOfArray {

    public static void main(String[] args) {
        int a[] = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int fr[] = new int[a.length];
        int visited = -1;

        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited) {
                fr[i] = count;
            }
        }
        System.out.println("-----------------------");
        System.out.println("Element|||Frequency");
        System.out.println("=======================");

        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited) {
                System.out.println(fr[i] + "------------------" + a[i]);
            }
        }
    }

}
