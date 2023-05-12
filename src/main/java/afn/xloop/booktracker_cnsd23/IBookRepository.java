package afn.xloop.booktracker_cnsd23;

import java.util.Collection;

public interface IBookRepository<T> {
    public void save(T t);
    public Collection<T> getAllBook();
    public void delete(int id);
    public void update(T t); 
}
