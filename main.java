public class main {
    public static void main(String[] args) {
        Printer value = new Printer();
        value.append("Стихотворение", "Мы не жалеем времени, \n" +
                                                 "А время наше нас,\n" +
                                                "Летит, не зная стремени,\n" +
                                                "Как с крыльями Пегас.", 1);
        value.print("Документы на распечатку.");
        value.clear();
        System.out.println("");
        value.print("Документы распечатаны.");
    }
}
