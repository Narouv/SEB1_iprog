import java.util.*;

public abstract class GenericList<T> implements List<T> {

  @Override
  public boolean add(T element) {
    Object[] arr = new Object[10];
    @SuppressWarnings("unchecked")
    T[] tarr = new T[10];
    return true;
  }
} 