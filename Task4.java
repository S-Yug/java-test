public class Task4 {
    public static void main(String[] args) {
        String[] list = { "hello", "good", "soso", "great", };
        for (int i = 0; i < 3; i++) {
            String str1 = list[i].substring(0, 2);
            String str2 = list[i + 1].substring(0, 2);
            System.out.println("str1 :" + str1 + " str2 :" + str2);
        }
    }
}

/*
 * 生じるエラー Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
 * Index 4 out of bounds for length 4 at Task4.main(Task4.java:6)
 * 配列のインデックスとして存在しない要素を指定した場合に発生するエラーであり、実際にlistの配列のサイズは"4"なのでインデックスは、0～3となる。
 * その為、for文の条件式を< 3とすることで範囲内のみの参照となる。 エラーが生じる行数 6行目
 */

/*
 * 実行結果 bash-3.2$ cd /Users/S/JavaTest ;
 * /Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home/bin/java
 * -Dfile.encoding=UTF-8 -cp "/Users/S/Library/Application
 * Support/Code/User/workspaceStorage/7e9f589acc9f4d8036b650a326a6421a/redhat.
 * java/jdt_ws/JavaTest_4cfc39c1/bin"Task4 str1:he str2:go str1:go str2:so
 * str1:so str2:gr
 */
