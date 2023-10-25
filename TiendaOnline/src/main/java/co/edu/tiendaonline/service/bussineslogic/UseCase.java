package co.edu.tiendaonline.service.bussineslogic;

public interface UseCase<D> {
	
	void execute(D domain);
}
