package zd2.prac23;

public interface Queue <T>{
    void addEllement(T element);
    void clear();
    boolean isEmpty();
    T element();
    T firstElement();
    int size();
}
