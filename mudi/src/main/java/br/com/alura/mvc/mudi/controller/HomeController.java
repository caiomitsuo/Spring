package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido =  new Pedido();
		pedido.setNomeProduto("Xiaomi Redmi Note 8");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/51wgmCYDFML._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Celular-Xiaomi-Vers%C3%A3o-Global-Space/dp/B07Y9ZHLXW/ref=asc_df_B07Y9ZHLXW/?tag=googleshopp00-20&linkCode=df0&hvadid=379773236150&hvpos=&hvnetw=g&hvrand=17402919398560436402&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1001637&hvtargid=pla-825774000605&psc=1");
		pedido.setDescricao("Uma descriçao para esse pedido");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
		
	}
}
