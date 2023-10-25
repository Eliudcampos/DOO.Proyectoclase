package co.edu.tiendaonline.service.domain;

public interface ValidationRule<T> {
	void validar(T dato);
}
