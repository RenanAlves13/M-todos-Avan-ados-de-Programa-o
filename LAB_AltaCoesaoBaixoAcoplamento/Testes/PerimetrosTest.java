package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Figuras.FiguraGeometrica;

class PerimetrosTest {

	FiguraGeometrica figuras;
	double perimetroCirculo;
	int perimetroQuadrado;
	int perimetroRetangulo;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@BeforeEach
	void setUp() throws Exception {
		figuras = new FiguraGeometrica();
		figuras.criarQuadrado(4);
		figuras.criarCirculo(6);
		figuras.criarRetangulo(2, 6);
		perimetroQuadrado = figuras.perimetroQ();
		perimetroCirculo = figuras.perimetroC();
		perimetroRetangulo = figuras.perimetroR();
	}
	
	@Test
	void test1() {
		assertEquals(16, perimetroQuadrado);
	}
	@Test
	void test2() {
		assertEquals(18.84, perimetroCirculo);
	}
	@Test
	void test3() {
		assertEquals(16, perimetroRetangulo);
	}

	@AfterAll
	static void tearDownAfterClass(){
	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
