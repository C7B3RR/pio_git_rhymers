package edu.kis.vh.nursery.list;

/**
 * Klasa node przechowuje wartość typu int oraz pola prev i next
 */
public class Node {
    private final int value;
    private Node prev;
    private Node next;

    /**
     * Konstruktor klasy Node
     * @param i liczba typu int, którą będzie przechowywać pole
     */
    public Node(int i) {
        value = i;
    }

    /**
     * Zwraca przechowywaną wartość
     * @return wartość
     */
    public int getValue() {
        return value;
    }

    /**
     *  Zwraca osatni element
     * @return ostatni element
     */
    public Node getPrev() {
        return prev;
    }

    /**
     *  Ustawia poprzedni element
     * @param prev poprzedni element
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     *  Zwraca następny element
     * @return nastepny element
     */
    public Node getNext() {
        return next;
    }

    /**
     *  Ustawia nastepny element
     * @param next nastepny element
     */
    public void setNext(Node next) {
        this.next = next;
    }
    //brak nieużywanych setterów
}
