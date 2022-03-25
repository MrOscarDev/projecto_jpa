package projecto_jpa;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import com.devlaros.projecto_jpa.dto.DisqueraDto;
import com.devlaros.projecto_jpa.dto.DisqueraDtoImpl;
import com.devlaros.projecto_jpa.entity.Disquera;

class DisqueraTest {
	
	private DisqueraDto disqueraDto = new DisqueraDtoImpl();

	@Test
	void testGuardar() {
		
		Disquera disquera = new Disquera();
		disquera.setDescripcion("pruebaFinal7");
		disquera.setFechaCreacion(LocalDateTime.now());
		disquera.setEstatus(true);
		this.disqueraDto.guardar(disquera);
	}

	@Test
	void testActualizar() {
		fail("Not yet implemented");
	}

	@Test
	void testBorrar() {
		fail("Not yet implemented");
	}

	@Test
	void testConsultar() {
		fail("Not yet implemented");
	}

	@Test
	void testConsultarId() {
		fail("Not yet implemented");
	}

}
