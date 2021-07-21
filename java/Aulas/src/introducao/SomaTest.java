package introducao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomaTest {

	@Test
	void test() {
		Soma somador = new Soma();
		assertEquals(20,somador.somar(10,10));
	}

}
