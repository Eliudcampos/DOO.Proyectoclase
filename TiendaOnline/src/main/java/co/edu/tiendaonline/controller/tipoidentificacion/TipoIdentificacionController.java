package co.edu.tiendaonline.controller.tipoidentificacion;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.tiendaonline.controller.support.response.Respuesta;
import co.edu.tiendaonline.crosscutting.exception.TiendaOnlineException;
import co.edu.tiendaonline.service.dto.TipoIdentificacionDTO;
import co.edu.tiendaonline.service.facade.concrete.tipoidentificacion.RegistrarTipoIdentificacionFacade;

@RestController
@RequestMapping("/api/v1/tipoidentificacion")
public class TipoIdentificacionController {
	
	@GetMapping("/dummy")
	public TipoIdentificacionDTO obtenerDummy() {
		return TipoIdentificacionDTO.crear();
	}

	@GetMapping
	public TipoIdentificacionDTO consultar(@RequestBody TipoIdentificacionDTO dto) {
		
		final Respuesta<TipoIdentificacionDTO> respuesta = new Respuesta<>();
		HttpStatus codigoHttp = HttpStatus.BAD_REQUEST;
		
		try { 
			RegistrarTipoIdentificacionFacade facade = new RegistrarTipoIdentificacionFacade();
			facade.execute(dto);
			codigoHttp = HttpStatus.OK;
			respuesta.getMensajes().add("El tipo identificacion fue registrado exitosamente");
		}catch (final TiendaOnlineException excepcion){
			respuesta.getMensajes().add(excepcion.getMensajeUsuario());
			System.err.println(excepcion.getMensajeTecnico());
			System.err.println(excepcion.getLugar());
		}catch (final Exception excepcion) {
			respuesta.getMensajes().add("Se a presentado un problema ....");
		}
		
		return new ResponseEntity<>(respuesta, codigoHttp);
	}
	
	@GetMapping("/{id}")
	public UUID consultarPorId(@PathVariable("id") UUID id) {
		return id;
	}
	
	@PostMapping
	public TipoIdentificacionDTO registrar(@RequestBody TipoIdentificacionDTO dto) {
		return dto;
	}
	
	@PutMapping("/{id}")
	public TipoIdentificacionDTO modificar(@PathVariable("id") UUID id, @RequestBody TipoIdentificacionDTO dto) {
		dto.setId(id);
		return dto;
	}
	
	@DeleteMapping("/{id}")
	public UUID eliminar(@PathVariable("id") UUID id, @RequestBody TipoIdentificacionDTO dto) {
		return id;
	}
}
