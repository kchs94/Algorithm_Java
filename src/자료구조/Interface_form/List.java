package 자료구조.Interface_form;

public interface List<E> {

    /**
     * 리스트에 요소(=원소)를 추가합니다.
     *
     * @param value 리스트에 추가할 원소
     * @return 리스트에 중복을 허용하지 않을 경우에 리스트에 이미 중복되는 원소가 있을 경우 {@Code false}를 반환하고,
     * 중복되는 원소가 없을 경우에는 {@Code true}를 반환한다.
     */
    boolean add(E value);

    /**
     * 리스트 특정 위치에 원소를 추가합니다.
     * @param index 리스트에 원소를 추가할 특정 위치 변수
     * @param value 리스트에 추가할 원소
     */
    void add(int index, E value);

    /**
     * 리스트 index 위치에 있는 원소를 삭제합니다.
     * @param index 삭제할 원소의 인덱스 위치 값을 저장할 매개변수
     * @return 삭제된 원소를 반환한다.
     */
    E remove(int index);

    
}
