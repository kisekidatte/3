package dsd_manual;

class Node { // КЛАСС – СТРУКТУРА ЭЛЕМЕНТА СПИСКА
    int value; // значение
    Node next; // поле – ссылка (указатель) на следующий узел
    int index;

    public Node(int value, Node next) { // конструктор класса
        this.index = index;
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node[" +
                "value=" + value +
                ", next=" + next +
                ']';
    }
}

public class DSD_Manual {
                    /*
   public static void main(String[] args) {
// создание несвязанных узлов с помощью конструктора
        Node node0 = new Node(0, null); // 0-й узел – будет головой в списке
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null); // последний узел – будет хвостом в списке
// связывание узлов в список с помощью ссылок
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
// вывод списка с использованием вспомогательной переменной ref,
// соответствующей текущему значению ссылки при прохождении по списку
        Node ref = node0; // для перемещения по списку достаточно помнить голову
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
                    */

    public static void main(String[] args) {
// добавление элементов с перемещением головы (наращивание с головы)
        Node head = null; // начальное значение ссылки на голову
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }
// вывод элементов на экран
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }


// создается новый элемент со значением 123 – будущий хвост
        Node newtail = new Node(123, null);
// для перемещения по списку используется вспомогательная переменная ref,
// которой в качестве начальной ссылки передается указатель на «голову»
        ref = head;
        while (ref.next != null) { // пока не последний элемент
            ref = ref.next;
        }
// указателю последнего элемента присваиваем новый «хвост» (элемент)
        ref.next = newtail;


        // создается новый элемент со значением 44 – для вставки
        Node newNode=new Node(44, null);
        ref = head; // используем временную переменную
        int k=1; // счетчик элементов
// поиск нужного положения узла для вставки
        while (ref.next!= null && (k<2 )) {
            ref = ref.next;
            k++;
        }
// переброска ссылок при вставке элемента
        newNode.next=ref.next.next;
        ref.next=newNode;


        head=head.next;

        // создаем вспомогательную переменную
        ref = head;
// перемещаемся на предпоследний элемент
        while (ref.next.next != null) {
            ref = ref.next;
        }
// полю next предпоследнего элемента присваиваем null
        ref.next=null;

        ref = head; // создаем вспомогательную переменную
        k=1;
// поиск положения узла, предшествующего удаляемому
        while (ref.next!= null && (k<2 )) {
            ref = ref.next;
            k++;
        }
// переброска ссылки для исключения ненужного элемента из списка
        ref.next=ref.next.next;

    }

}