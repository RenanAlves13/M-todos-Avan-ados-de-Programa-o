package Testes;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Figuras.FiguraGeometrica;

class AreasTest {

	//Realiza tarefas longas e custosas de inicialização para testes´
	FiguraGeometrica figuras;
	double areaCirculo;
	int areaQuadrado;
	int areaRetangulo;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		figuras = new FiguraGeometrica();
		figuras.criarCirculo(8);
		figuras.criarQuadrado(4);
		figuras.criarRetangulo(7, 3);
		
		areaQuadrado = figuras.areaQ();
		areaCirculo = figuras.areaC();
		areaRetangulo = figuras.areaR();
	}

	@Test
	void test1() {
		assertEquals(8, areaQuadrado);
	}
	
	@Test
	void test2() {
		assertEquals(50,24, areaCirculo);
	}
	
	@Test
	void test3() {
		assertEquals(21, areaRetangulo);
	}
	
	//Pós teste e limpeza
	@AfterEach
	void tearDown() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
}
