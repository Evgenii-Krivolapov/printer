public class Printer {
    public static String stringQueue = "";
    public static int paperQuantity = 3;
    public void append(String name, String text, int page){
        stringQueue =stringQueue + "\n" + name + "\n" + text + "\n" + page;
    }
    public void getPendingPagesCount(int count) {
        
    }
    public void clear() {
        stringQueue = "";
        getPendingPagesCount(1);
    }
    public void print(String titel) {
        System.out.println(titel);
        if (stringQueue.isEmpty()) {
        } else {
            System.out.println(stringQueue);
        }
    }
}

