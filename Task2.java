public class Task2 {
    public static void main(String[] args) {
        int[] num = new int[5];
        num = new int[] { 22, 13, 4, 10, 25, };
        for (int count = 0; count < num.length; count++) {
            if (num[count] % 4 == 0) {
                System.out.println("4の倍数");
            } else if (num[count] % 5 == 0) {
                System.out.println("5の倍数");
            } else {
                System.out.println(num[count]);
            }
        }
    }
}

/*
 * 実行結果 bash-3.2$ cd /Users/sarara/JavaTest ;
 * /Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home/bin/java
 * -Dfile.encoding=UTF-8 -cp
 * "/Users/sarara/Library/Application Support/Code/User/workspaceStorage/7e9f589acc9f4d8036b650a326a6421a/redhat.java/jdt_ws/JavaTest_4cfc39c1/bin"
 * Task2 22 13 4の倍数です 5の倍数です 5の倍数です
 */
