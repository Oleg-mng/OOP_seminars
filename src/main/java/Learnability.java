public interface Learnability {
//    получение готовности к обучению
    String getInfo();
    int OPEN = 1;
    int CLOSED = 0;

    void printState(int n);
}
