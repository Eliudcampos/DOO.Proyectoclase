package co.edu.tiendaonline.service.facade;

public interface Facade<T> {
	
	void execute(T dto);
}
