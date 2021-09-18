package zadania.zadanie36;

public class Queue {

    private QueueItem head;

    public QueueItem add(QueueItem queueItem) {

        if (head == null) {
            head = queueItem;
            return queueItem;
        }

        QueueItem item = head;
        while (item.getNext() != null) {
            item = item.getNext();

            if (item.equals(queueItem)) {
                System.out.printf("Element %s znajduje się już w kolejce\n", queueItem.getName());
                return null;
            }
        }

        item.setNext(queueItem);
        return queueItem;
    }

    public QueueItem add(QueueItem queueItem, int index) {

        if (index == 0) {
            QueueItem buff = head;
            head = queueItem;
            queueItem.setNext(buff);
        }

        if (index > 0) {
            int i = 0;

            QueueItem buff = head;
            while (i < index) {
                buff = buff.getNext();
                i++;
            }

            QueueItem tmp = buff.getNext();
            buff.setNext(queueItem);
            queueItem.setNext(tmp);
        }

        return queueItem;
    }

    public int count() {

//        int result = 0;
//        if (head != null) {
//            result++;
//
//            QueueItem tmp = head;
//            while (tmp.getNext() != null) {
//                tmp = tmp.getNext();
//                result++;
//            }
//        }
//
//        return result;

        return count(head, 0);
    }

    private int count(QueueItem queueItem, int i) {
        if (queueItem == null) return i;
        return (count(queueItem.getNext(), ++i));
    }
}
