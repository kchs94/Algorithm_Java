package 자료구조.스택;

import 자료구조.Interface_form.StackInterface;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<E> implements StackInterface<E> {

    private static final int DEFAULT_CAPACITY = 10; //  최소(기본) 용적 크기
    private static final Object[] EMPTY_ARRAY = {}; // 빈 배열

    private Object[] array; // 요소를 담을 배열
    private int size;   // 요소 갯수

    // 생성자1 (초기 공간 할당X)
    public Stack(){
        this.array = EMPTY_ARRAY;
        this.size = 0;
    }

    // 생성자2 (초기 공간 할당O)
    public Stack(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
    }

    private void resize() {

        // 빈 배열일 경우(capacity is 0)
        if(Arrays.equals(array, EMPTY_ARRAY)) {
            array = new Object[DEFAULT_CAPACITY];
            return;
        }

        int arrayCapacity = array.length;   // 현재 용적 크기

        // 용적이 가득 찰 경우
        if(size == arrayCapacity) {
            int newSize = arrayCapacity * 2;

            array = Arrays.copyOf(array, newSize);
            return ;
        }

        // 용적의 절반 미만으로 요소가 차지하고 있을 경우
        if(size < (arrayCapacity / 2)) {

            int newCapacity = (arrayCapacity / 2);

            // 배열 복사
            array = Arrays.copyOf(array, Math.max(DEFAULT_CAPACITY, newCapacity));
            return;
        }
    }

    @Override
    public E push(E item) {

        // 용적이 꽉 차있다면 용적을 재할당 해준다.
        if(size == array.length) {
            resize();
        }
        array[size] = item; // 마지막 위치에 요소 추가
        size++; // 사이즈 1 증가

        return item;
    }

    @Override
    public E pop() {

        // 만약 삭제할 요소가 없다면 Stack이 비어있다는 의미이므로 예외 발생시키기
        if(size == 0) {
            throw new EmptyStackException();
        }

        @SuppressWarnings("unchecked")
        E obj = (E) array[size-1];  // 삭제될 요소를 반환하기 위한 임시 변수

        array[size -1] = null;  // 요소 삭제

        size--; // 사이즈 1 감소
        resize();   //용적 재할당

        return obj;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E peek() {
        // 만약 조회할 요소가 없다면 Stack이 비어있다는 의미이므로 예외 발생시키기
        if(size == 0) {
            throw new EmptyStackException();
        }

        return (E) array[size-1];
    }

    @Override
    public int search(Object value) {

        for(int index = size-1 ; index >=0; index--) {

            // 같은 객체를 찾은 경우 size- index를 반환
            if(array[index].equals(value)) {
                return size - index;
            }
        }

        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {

        // 저장되어있는 모든 요소를 null 처리 해준다
        for(int i=0; i<size; i++) {
            array[i] = null;
        }
        size = 0;
        resize();
    }

    @Override
    public boolean empty() {
        return size == 0;
    }
}
