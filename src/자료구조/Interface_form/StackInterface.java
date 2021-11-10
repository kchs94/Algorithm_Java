package 자료구조.Interface_form;

public interface StackInterface<E> {
    /*
    * 스택 맨 위에 요소를 추가합니다.
    *
    * @param item 스택에 추가할 요소
    * @return 스택에 추가된 요소
    * */
    E push(E item);

    /*
    * 스택의 맨 위에 있는 요소를 제거하고 제거된 요소를 반환합니다.
    *
    * */
    E pop();
    
    /*
    * 스택의 맨 위에 있는 요소를 제거하지 않고 반환합니다.
    * 
    * @return 스택 맨 위에 있는 요소
    * */
    E peek();

    /*
    * 검색하는 요소가 상단으로부터 특정 요소가 몇 번째 위치에 있는지를 반환합니다.
    * 만약 중복되는 요소가 있을 경우에는 가장 위에 있는 요소의 위치를 반환합니다.
    *
    * @param value 스택에서 위치를 찾을 요소
    * @return 스택 상단으로부터 처음으로 요소와 일치하는 위치를 반환.
    *         만약 일치하는 요소가 없을 경우 -1을 반환
    * */
    int search(Object value);

    /*
    * 스택 안에있는 요소의 갯수를 반환합니다.
    *
    * @return 스택 안에있는 요소의 갯수를 반환
    * */
    int size();

    /*
    * 스택 안에있는 모든 요소를 제거합니다.
    * */
    void clear();

    /*
    * 스택이 비어있는지 검사합니다.
    *
    * @return 스택에 요소가 없으면 true, 요소가 있으면 false
    * */
    boolean empty();
}
