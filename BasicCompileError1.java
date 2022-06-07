public class BasicCompileError1 {
    public static void main(String[] arg) {
        printNum(123);
    }
    public static void printNum(int i) {
        System.out.println("Main Function傳來的資料為：" + i);       
    }
}
// public class BasicCompileError1 {
//     public static void main(String[] arg) {
//         printNum(123);
//     }
//     public static void printNum(String data) {
//         System.out.println("Main Function傳來的資料為：" + data);       
//     }
// }