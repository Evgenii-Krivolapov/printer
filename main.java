public class main {
    public static void main(String[] args) {
        Printer value = new Printer();
        value.append("�������������", "�� �� ������ �������, \n" +
                                                 "� ����� ���� ���,\n" +
                                                "�����, �� ���� ��������,\n" +
                                                "��� � �������� �����.", 1);
        value.print("��������� �� ����������.");
        value.clear();
        System.out.println("");
        value.print("��������� �����������.");
    }
}
