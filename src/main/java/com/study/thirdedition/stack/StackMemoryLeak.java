package study.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackMemoryLeak {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public StackMemoryLeak() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    /**
     스택에서 꺼내진 객체들을 가비지 컬렉터가 회수하지 않는다.
     이 스택이 그 객체들의 다 쓴 참조(obsolete reference)를 여전히 가지고 있기 때문이다.

     객체 참조 하나가 살아있음으로써, 그 객체가 참조하는 모든 객체가
     회수되지 못하게 되거나, 잠재적으로 성능 악영향을 줄 수 있다.
     메모리 누수
     */
    public Object pop() {
        if (size == 0) throw new EmptyStackException();
        return elements[--size];
    }

    /**
     해결법은 간단하다. 참조를 다 썻을때 null 처리 하면 된다.
     만약 다 쓴 참조를 사용하려고 할 경우 null 처리 했기 때문에
     프로그램은 즉시 NullPointerException을 일으키며 종료된다.

     But!
     객체를 null 처리하는 일은 예외적인 경우여야 한다.
     다 쓴 참조를 해제하는 가장 좋은 방법은 그 참조를 담은 변수를 유효범위
     밖으로 밀어내는 것이다.
     */
    public Object popRepair() {
        if (size == 0) throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // 다 쓴 참조 해제
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public void showElements() {
        for (Object data : elements) {
            if (data != null) {
                System.out.println(data);
            }
        }
    }
}
