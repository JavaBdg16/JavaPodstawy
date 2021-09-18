package zadania.zadanie34;

public class Stack {

    private StackElement[] stackElements;
    private int currentSize;

    public Stack(int size) {
        stackElements = new StackElement[size];
        currentSize = 0;
    }

    public StackElement push(StackElement stackElement) {

        if (checkStackElementExistance(stackElement)) {
            System.out.printf("Element %s znajduje się już na stosie\n", stackElement.getName());
            return null;
        }

        if (currentSize >= stackElements.length) {
            System.out.println("Przekroczono rozmiar stosu");
            return null;
        }

        stackElements[currentSize] = stackElement;
        currentSize++;

        return stackElement;
    }

    public int count() {
        return currentSize;
    }

    private boolean checkStackElementExistance(StackElement stackElement) {

        for (StackElement se : stackElements) {
            if (se == null) {
                continue;
            }

            if (se.equals(stackElement)) {
                return true;
            }
        }

        return false;
    }
}
