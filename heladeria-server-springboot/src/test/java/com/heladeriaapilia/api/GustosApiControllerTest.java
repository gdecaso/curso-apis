package com.heladeriaapilia.api;

import com.heladeriaapilia.model.GustoData;
import com.heladeriaapilia.model.GustoData.TipoDeGustoData;
import com.heladeriaapilia.repository.GustoDataRepository;
import com.heladeriaapilia.service.GustoService;
import com.heladeriaapilia.service.PedidoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GustosApiController.class)
public class GustosApiControllerTest {

	@MockBean
	private GustoDataRepository gustoDataRepository;

	@MockBean
	private PedidoService pedidoService;

	@MockBean
	private GustoService gustoService;

	private static final List<GustoData> GUSTOS = List.of(
			new GustoData("gusto1", "Gusto 1", TipoDeGustoData.CREMAS),
			new GustoData("gusto2", "Gusto 2", TipoDeGustoData.CHOCOLATES));

	@Autowired
	private MockMvc mockMvc;

	@BeforeEach
	void setUp() {
		when(gustoService.getGustos()).thenReturn(GUSTOS);
	}

	@Test
	public void elControllerDevuelveTodosLosGustosDelServicio() throws Exception {
		this.mockMvc.perform(get("/gustos"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("[0].id", is("gusto1")))
				.andExpect(jsonPath("[1].id", is("gusto2")))
				.andExpect(jsonPath("$", hasSize(2)));
	}
}